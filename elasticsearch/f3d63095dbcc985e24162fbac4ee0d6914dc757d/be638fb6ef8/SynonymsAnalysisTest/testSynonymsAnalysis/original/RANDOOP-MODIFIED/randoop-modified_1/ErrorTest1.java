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
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray5);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray13);
        long[] longArray17 = new long[] { (short) -1 };
        long[] longArray19 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("", longArray11, longArray17);
        long[] longArray24 = new long[] { (short) -1 };
        long[] longArray26 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray11, longArray26);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray33, longArray35);
        long[] longArray39 = new long[] { (short) -1 };
        long[] longArray41 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray33, longArray39);
        long[] longArray46 = new long[] { (short) -1 };
        long[] longArray48 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray46, longArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray26, longArray39);
        org.junit.Assert.assertArrayEquals(longArray5, longArray39);
        long[] longArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray39, longArray53);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1L), (-1.0d));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) 0.0f, (double) 100);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 10, (double) 10.0f);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (short) 10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = null;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling8, (java.lang.Object) synonymsAnalysisTest9);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) throttling8);
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("tests.slow", indexReader31, 0, postingsEnum33, postingsEnum34, false);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum40, postingsEnum41, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule21, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (short) 100);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling1, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet14 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray13);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) throttlingArray13, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1.0f, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1.0f), (double) 'a');
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.Set<java.lang.Object> objSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("hi!", indexReader18, terms19, terms20, true);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest1.ruleChain;
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray28, floatArray29, (float) (-1));
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray34, floatArray35, (float) (-1));
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray39, floatArray40, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray40, (float) 'a');
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray46, floatArray47, (float) (-1));
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray51, floatArray52, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray52, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray40, floatArray52, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray52, (float) 0);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray63, floatArray64, (float) (-1));
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray68, floatArray69, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray69, (float) 'a');
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray75, floatArray76, (float) (-1));
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray80, floatArray81, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray81, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray69, floatArray81, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray69, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) testRule26, (java.lang.Object) floatArray28);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest24.setUp();
        synonymsAnalysisTest24.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule23, (java.lang.Object) synonymsAnalysisTest24);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy36 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy37 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy38 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy39 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray40 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy36, queryCachingPolicy37, queryCachingPolicy38, queryCachingPolicy39 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet41 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) queryCachingPolicyArray40);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        char[] charArray3 = new char[] { 'a', '4', 'a' };
        char[] charArray6 = new char[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (long) 0, (long) (byte) 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 'a', (float) 1, (float) 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1.0f), (double) 'a', 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0f);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader12, (int) (short) 100, postingsEnum14, postingsEnum15, false);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10L, (long) 100);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        short[] shortArray5 = new short[] { (short) 100, (short) -1, (short) 10, (short) 1, (byte) -1 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.resetCheckIndexStatus();
        synonymsAnalysisTest22.resetCheckIndexStatus();
        synonymsAnalysisTest22.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("hi!", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader10, fields11, fields12, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain17);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest20.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain26;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        short[] shortArray7 = new short[] { (byte) 10, (short) 100, (byte) 100, (short) -1, (byte) 100, (short) 10 };
        short[] shortArray14 = new short[] { (byte) 10, (byte) 10, (byte) 10, (short) 1, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray14);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1L), (double) ' ', (double) 1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling0, (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet13 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray12);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingEnumSet14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        int[] intArray2 = new int[] { (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray3);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        short[] shortArray6 = new short[] { (short) 10, (byte) 0, (short) -1, (short) 100, (byte) 1, (byte) 1 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader7, terms8, terms9, true);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        short[] shortArray1 = new short[] { (byte) 100 };
        short[] shortArray3 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[] intArray7 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray5 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet6 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray5);
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, queryCachingPolicyArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray30);
        java.lang.Object[] objArray48 = new java.lang.Object[] { executorServiceArray30 };
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray56);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray49);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray5, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        short[] shortArray7 = new short[] { (byte) 100, (byte) 100, (byte) 1, (short) 100, (byte) 100, (byte) 100 };
        short[] shortArray14 = new short[] { (short) 100, (short) 0, (short) 10, (short) 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray7, shortArray14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 0, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = null;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain19;
        java.lang.Class<?> wildcardClass21 = synonymsAnalysisTest12.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest22.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass32 = synonymsAnalysisTest22.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("", indexReader36, (int) (short) 0, postingsEnum38, postingsEnum39);
        org.junit.rules.RuleChain ruleChain41 = null;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain41;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling33, (java.lang.Object) synonymsAnalysisTest34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet46 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray45);
        java.lang.Class<?> wildcardClass47 = throttlingArray45.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest48.assertPositionsSkippingEquals("", indexReader50, (int) (short) 0, postingsEnum52, postingsEnum53);
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain57 = synonymsAnalysisTest48.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass58 = synonymsAnalysisTest48.getClass();
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.lang.Class<?> wildcardClass66 = executorServiceArray60.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray67 = new java.lang.reflect.GenericDeclaration[] { wildcardClass11, wildcardClass21, wildcardClass32, wildcardClass47, wildcardClass58, wildcardClass66 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, genericDeclarationArray67);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule70 = synonymsAnalysisTest69.ruleChain;
        synonymsAnalysisTest69.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        synonymsAnalysisTest69.assertPositionsSkippingEquals("", indexReader73, 0, postingsEnum75, postingsEnum76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) genericDeclarationList68, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (short) -1, 0.0f);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest26.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest26.failureAndSuccessEvents;
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain32;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain32;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum13, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        java.lang.Class<?> wildcardClass4 = ruleChain2.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain13;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling5, (java.lang.Object) synonymsAnalysisTest6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray17);
        java.lang.Class<?> wildcardClass19 = throttlingArray17.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26);
        org.junit.rules.RuleChain ruleChain28 = null;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain28;
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling20, (java.lang.Object) synonymsAnalysisTest21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet33 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray32);
        java.lang.Class<?> wildcardClass34 = throttlingArray32.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray35 = new java.lang.reflect.GenericDeclaration[] { wildcardClass4, wildcardClass19, wildcardClass34 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet36 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.Set<java.lang.Object> objSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray69);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray35, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) ' ', (double) (-1L), (double) 10L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling1, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet14 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray13);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) throttlingArray13, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray8, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) 'a');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray15, (float) (-1));
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray19, floatArray20, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray8, floatArray20, (float) 0L);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray44);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.Set<java.lang.Object> objSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.Set<java.lang.Object> objSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.Set<java.lang.Object> objSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray89);
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean94 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) executorServiceArray61);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, obj18);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 1, (long) 10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        int[] intArray6 = new int[] { 'a', '#', (byte) -1, 0, (byte) 0 };
        int[] intArray11 = new int[] { (short) -1, 10, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray6, intArray11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Set<java.lang.Object> objSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray8);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        long[] longArray16 = new long[] { (short) -1 };
        long[] longArray18 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray16, longArray18);
        long[] longArray22 = new long[] { (short) -1 };
        long[] longArray24 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray22, longArray24);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray22);
        long[] longArray29 = new long[] { (short) -1 };
        long[] longArray31 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray29, longArray31);
        org.junit.Assert.assertArrayEquals(longArray18, longArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) boolean12, (java.lang.Object) longArray18);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray47);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule54 = synonymsAnalysisTest53.ruleChain;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest53.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain55;
        java.lang.Class<?> wildcardClass57 = ruleChain55.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest59.assertPositionsSkippingEquals("", indexReader61, (int) (short) 0, postingsEnum63, postingsEnum64);
        org.junit.rules.RuleChain ruleChain66 = null;
        synonymsAnalysisTest59.failureAndSuccessEvents = ruleChain66;
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest59.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling58, (java.lang.Object) synonymsAnalysisTest59);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray70 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet71 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray70);
        java.lang.Class<?> wildcardClass72 = throttlingArray70.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling73 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        synonymsAnalysisTest74.assertPositionsSkippingEquals("", indexReader76, (int) (short) 0, postingsEnum78, postingsEnum79);
        org.junit.rules.RuleChain ruleChain81 = null;
        synonymsAnalysisTest74.failureAndSuccessEvents = ruleChain81;
        org.junit.rules.RuleChain ruleChain83 = synonymsAnalysisTest74.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling73, (java.lang.Object) synonymsAnalysisTest74);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray85 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling73 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet86 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray85);
        java.lang.Class<?> wildcardClass87 = throttlingArray85.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray88 = new java.lang.reflect.GenericDeclaration[] { wildcardClass57, wildcardClass72, wildcardClass87 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet89 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) genericDeclarationArray88);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        char[] charArray6 = new char[] { '4', ' ', 'a', '#', '#' };
        char[] charArray8 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray8);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0f, (float) (short) -1, 0.0f);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) byteArray16);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy30 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) queryCachingPolicy30);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) '4');
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, (double) (-1L), (double) 1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.nightly", obj1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 0.0d, 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 1L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray14, 10.0d);
        java.lang.Object obj20 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray5, obj20);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray5, doubleArray23, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray1, doubleArray23, (double) (short) 100);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) 'a', (float) (-1));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, obj10);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray9 = new char[] { 'a', ' ', 'a', '4', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 100L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray2, shortArray8);
        short[] shortArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (byte) 1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        java.lang.Object[] objArray51 = new java.lang.Object[] { executorServiceArray33 };
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.Set<java.lang.Object> objSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray52);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray33);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray1, charArray4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0, 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", objArray1, (java.lang.Object[]) queryCachingPolicyArray6);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.Set<java.lang.Object> objSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        java.util.Set<java.lang.Object> objSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        java.util.Set<java.lang.Object> objSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray84);
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray92);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray92);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray92);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray61);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        int[] intArray3 = new int[] { 0, 100, (short) 1 };
        int[] intArray9 = new int[] { (short) 1, 'a', (short) 0, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        char[] charArray5 = new char[] { '4', '4', 'a', '#', ' ' };
        char[] charArray9 = new char[] { '4', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray5, (float) (-1));
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray9, floatArray10, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) 'a');
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray16, floatArray17, (float) (-1));
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray22, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray10, floatArray22, (float) 0L);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray30, floatArray31, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray30, (float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray30, 100.0f);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader6, 0, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) 0, (java.lang.Object) indexReader13);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0.0f, (float) '4', (float) (short) 10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100.0d, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 1, 0L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) -1);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray5, (float) (-1));
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray9, floatArray10, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) 'a');
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray16, floatArray17, (float) (-1));
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray22, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray10, floatArray22, (float) 0L);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray30, floatArray31, (float) (-1));
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray36, floatArray37, (float) (-1));
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray41, floatArray42, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) 'a');
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray49, (float) (-1));
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray53, floatArray54, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray54, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray42, floatArray54, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray54, (float) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray22, floatArray54, (float) (short) 1);
        float[] floatArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray22, floatArray65, (float) (short) 100);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 10, 1.0f, (float) 0L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray9, (float) (-1));
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray13, floatArray14, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 'a');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray20, floatArray21, (float) (-1));
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray25, floatArray26, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray14, floatArray26, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray26, (float) 0);
        float[] floatArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray26, floatArray35, 1.0f);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 1, (short) 100, (short) 100, '#', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) (byte) 1, (float) 0L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (short) 1, (float) 0, (float) 0L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 1L, (double) (byte) 0, (double) 10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (byte) 0, (float) (byte) 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '#', (double) 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        int[] intArray2 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (byte) 1, (short) 0, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        char[] charArray2 = new char[] { 'a', ' ' };
        char[] charArray5 = new char[] { 'a', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray5);
        long[] longArray9 = new long[] { (short) -1 };
        long[] longArray11 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray9);
        long[] longArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray14);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (-1), (float) (byte) 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray43);
        java.lang.Object[] objArray61 = new java.lang.Object[] { executorServiceArray43 };
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray69);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray62);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) executorServiceArray26);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 'a', (-1L));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        int[] intArray4 = new int[] { (short) 100, (short) 100, '#' };
        int[] intArray8 = new int[] { 0, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray4, intArray8);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) executorServiceArray1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures12);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray14 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures11, testRuleIgnoreAfterMaxFailures13 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray19 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures16, testRuleIgnoreAfterMaxFailures18 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray4, testRuleIgnoreAfterMaxFailuresArray9, testRuleIgnoreAfterMaxFailuresArray14, testRuleIgnoreAfterMaxFailuresArray19 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.Set<java.lang.Object> objSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.Set<java.lang.Object> objSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray63);
        java.lang.Object[] objArray81 = new java.lang.Object[] { executorServiceArray63 };
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        java.util.Set<java.lang.Object> objSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray82);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        java.util.Set<java.lang.Object> objSet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray86);
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray89);
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray82);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray20, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader6, terms7, terms8, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader6, (java.lang.Object) "hi!");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest23.ruleChain;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest23.failureAndSuccessEvents;
        synonymsAnalysisTest23.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest27.ruleChain;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest27.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest53.assertPositionsSkippingEquals("", indexReader55, (int) (short) 0, postingsEnum57, postingsEnum58);
        org.junit.rules.RuleChain ruleChain60 = null;
        synonymsAnalysisTest53.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        synonymsAnalysisTest53.assertTermsEquals("enwiki.random.lines.txt", indexReader63, terms64, terms65, true);
        java.lang.String str68 = synonymsAnalysisTest53.getTestName();
        synonymsAnalysisTest53.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest53.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule72 = synonymsAnalysisTest71.ruleChain;
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest71.failureAndSuccessEvents;
        synonymsAnalysisTest71.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule76 = synonymsAnalysisTest75.ruleChain;
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest75.failureAndSuccessEvents;
        synonymsAnalysisTest71.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest71.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest53, (java.lang.Object) synonymsAnalysisTest71);
        org.junit.rules.TestRule testRule81 = synonymsAnalysisTest71.ruleChain;
        synonymsAnalysisTest71.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        synonymsAnalysisTest71.assertFieldsEquals("<unknown>", indexReader84, fields85, fields86, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) fields85);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        double[] doubleArray1 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 1L);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, 10.0d);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray19, (double) 100);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray28, (double) 1L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray34, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray34, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray1, doubleArray34, (double) 0.0f);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1.0f), (double) 1L, (double) 0.0f);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        int[] intArray3 = new int[] { 10, (short) 100 };
        int[] intArray6 = new int[] { 0, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, (double) 10L);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.nightly", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain2, (java.lang.Object) synonymsAnalysisTest5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        int[] intArray5 = new int[] { (short) 0, (byte) 100, (short) 100, '#', (byte) 10 };
        int[] intArray12 = new int[] { (short) 10, 'a', ' ', (byte) 1, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) 1L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 1L);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray24, 10.0d);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray31, (double) 100);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) (byte) 1);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray40, (double) 1L);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray46, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray46, 10.0d);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray59, (double) 1L);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray65, 10.0d);
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray72, (double) 100);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray65, (double) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) doubleArray65);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest18.assertFieldsEquals("<unknown>", indexReader31, fields32, fields33, true);
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest18.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 1L, (double) 10L, (double) 10L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        int[] intArray6 = new int[] { '#', (short) -1, 0, (short) 10, ' ', 'a' };
        int[] intArray11 = new int[] { (short) 1, (byte) 1, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1, (double) '#');
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest18.assertDocsAndPositionsEnumEquals("hi!", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25);
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest20.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain36;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) ruleChain36);
        synonymsAnalysisTest20.setUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest20);
        org.junit.Assert.assertNotSame("", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        int[] intArray5 = new int[] { (short) -1, '#', (byte) 0, (short) 0 };
        int[] intArray9 = new int[] { (short) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray9);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest19.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest33.assertPositionsSkippingEquals("", indexReader35, (int) (short) 0, postingsEnum37, postingsEnum38);
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest45.ruleChain;
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest45.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest49.ruleChain;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest45.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule55 = synonymsAnalysisTest54.ruleChain;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest54.assertPositionsSkippingEquals("tests.nightly", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        synonymsAnalysisTest54.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        synonymsAnalysisTest54.assertFieldsEquals("random", indexReader64, fields65, fields66, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule70 = synonymsAnalysisTest69.ruleChain;
        org.junit.rules.RuleChain ruleChain71 = synonymsAnalysisTest69.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain71);
        synonymsAnalysisTest54.failureAndSuccessEvents = ruleChain71;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain71;
        synonymsAnalysisTest45.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain42, (java.lang.Object) synonymsAnalysisTest45);
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest13.assertPositionsSkippingEquals("", indexReader15, (int) (short) 0, postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = null;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        synonymsAnalysisTest13.assertTermsEquals("enwiki.random.lines.txt", indexReader23, terms24, terms25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.slow", postingsEnum29, postingsEnum30, false);
        synonymsAnalysisTest13.setUp();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest13.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest35.assertPositionsSkippingEquals("", indexReader37, (int) (short) 0, postingsEnum39, postingsEnum40);
        synonymsAnalysisTest35.overrideTestDefaultQueryCache();
        synonymsAnalysisTest35.overrideTestDefaultQueryCache();
        synonymsAnalysisTest35.resetCheckIndexStatus();
        java.lang.String str45 = synonymsAnalysisTest35.getTestName();
        java.lang.String str46 = synonymsAnalysisTest35.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest47.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule52 = synonymsAnalysisTest51.ruleChain;
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest51.failureAndSuccessEvents;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest47.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest47.assertDocsEnumEquals("", postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest61.assertPositionsSkippingEquals("", indexReader63, (int) (short) 0, postingsEnum65, postingsEnum66);
        synonymsAnalysisTest61.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        synonymsAnalysisTest61.assertDocsSkippingEquals("tests.slow", indexReader70, 0, postingsEnum72, postingsEnum73, false);
        org.junit.rules.RuleChain ruleChain76 = synonymsAnalysisTest61.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain76;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain76;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain76;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) testRule34, (java.lang.Object) synonymsAnalysisTest35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule34);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        char[] charArray3 = new char[] { '#', '#', 'a' };
        char[] charArray10 = new char[] { '4', ' ', ' ', '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) (byte) 1, (double) (short) 10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        int[] intArray7 = new int[] { (short) 0, (short) 10, (byte) 100, 0, (-1), (short) 0 };
        int[] intArray14 = new int[] { '#', (-1), '#', 'a', 10, ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray14);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain30);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader16, fields17, fields18, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25);
        org.junit.Assert[] assertArray27 = new org.junit.Assert[] { synonymsAnalysisTest2, synonymsAnalysisTest9, synonymsAnalysisTest16, synonymsAnalysisTest18, synonymsAnalysisTest20 };
        java.util.List<org.junit.Assert> assertList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, assertArray27);
        java.util.Collection[] collectionArray30 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.junit.Assert>[] assertCollectionArray31 = (java.util.Collection<org.junit.Assert>[]) collectionArray30;
        assertCollectionArray31[0] = assertList28;
        java.util.Set<java.util.Collection<org.junit.Assert>> assertCollectionSet34 = org.apache.lucene.util.LuceneTestCase.asSet(assertCollectionArray31);
        java.util.Set<java.util.Collection<org.junit.Assert>> assertCollectionSet35 = org.apache.lucene.util.LuceneTestCase.asSet(assertCollectionArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) assertCollectionArray31);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 1, (double) (-1), (double) 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest8.assertFieldsEquals("", indexReader19, fields20, fields21, false);
        java.lang.Class<?> wildcardClass24 = synonymsAnalysisTest8.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "<unknown>", (java.lang.Object) wildcardClass24);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        int[] intArray4 = new int[] { (short) 10, (byte) 100, 1, ' ' };
        int[] intArray11 = new int[] { (byte) -1, 1, (byte) 1, (-1), ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray5, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray17, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray23);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray30, shortArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray23);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) 1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) (short) 10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest18.ensureAllSearchContextsReleased();
        synonymsAnalysisTest18.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest18.assertDocValuesEquals("tests.failfast", (int) 'a', numericDocValues34, numericDocValues35);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures10 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleIgnoreAfterMaxFailuresArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        org.junit.rules.RuleChain ruleChain24 = null;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest17.assertTermsEquals("enwiki.random.lines.txt", indexReader27, terms28, terms29, true);
        java.lang.String str32 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest17.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest35.failureAndSuccessEvents;
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest39.ruleChain;
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest39.failureAndSuccessEvents;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest35.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) synonymsAnalysisTest35);
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest35.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("", indexReader48, (int) (short) 0, postingsEnum50, postingsEnum51);
        synonymsAnalysisTest46.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest46.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest56.ruleChain;
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest56.failureAndSuccessEvents;
        synonymsAnalysisTest56.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest60.ruleChain;
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest56.failureAndSuccessEvents = ruleChain62;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest46, (java.lang.Object) ruleChain62);
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain62;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray12, (java.lang.Object) ruleChain62);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 1, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray48);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest52.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) executorServiceArray48, (java.lang.Object) 1);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, (-1.0d), (double) '4');
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100.0f, (-1.0f), (float) 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 100);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest17.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest21.ruleChain;
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain23;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray15, (java.lang.Object) ruleChain25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.Set<java.lang.Object> objSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.Set<java.lang.Object> objSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray66);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertNotNull("", (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest18.ensureAllSearchContextsReleased();
        synonymsAnalysisTest18.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("tests.maxfailures", indexReader33, (int) (byte) 1, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest18.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum40, postingsEnum41);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        char[] charArray5 = new char[] { '4', ' ', '#', '4' };
        char[] charArray9 = new char[] { '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.monster", (int) '4', numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain3);
        java.lang.String[] strArray11 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.monster", "tests.maxfailures", "tests.awaitsfix", "tests.maxfailures", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) ruleChain3, (java.lang.Object) strArray11);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) (short) 10);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 'a');
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader16, fields17, fields18, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", (int) (short) 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum2, postingsEnum3, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        int[] intArray2 = new int[] { 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray2, intArray3);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 0.0d, (double) 0L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.slow", indexReader10, terms11, terms12, false);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (byte) -1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        char[] charArray2 = new char[] { '4', 'a' };
        char[] charArray8 = new char[] { '4', ' ', ' ', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray41);
        java.lang.Object[] objArray59 = new java.lang.Object[] { executorServiceArray41 };
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.Set<java.lang.Object> objSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray60);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling76 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        synonymsAnalysisTest77.assertPositionsSkippingEquals("", indexReader79, (int) (short) 0, postingsEnum81, postingsEnum82);
        org.junit.rules.RuleChain ruleChain84 = null;
        synonymsAnalysisTest77.failureAndSuccessEvents = ruleChain84;
        org.junit.rules.RuleChain ruleChain86 = synonymsAnalysisTest77.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling76, (java.lang.Object) synonymsAnalysisTest77);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray88 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling76 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet89 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) throttlingArray88);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, (double) (short) 10);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray5, (float) (-1));
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray10, floatArray11, (float) (-1));
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray16, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray16, (float) 'a');
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray22, floatArray23, (float) (-1));
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray27, floatArray28, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray28, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray16, floatArray28, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray28, (float) 0);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray39, floatArray40, (float) (-1));
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray44, floatArray45, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray45, (float) 'a');
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray51, floatArray52, (float) (-1));
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray56, floatArray57, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray57, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray45, floatArray57, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray45, (float) (-1));
        org.junit.Assert.assertNotNull("", (java.lang.Object) floatArray45);
        java.lang.Object obj67 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray45, obj67);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray70, floatArray71, (float) (-1));
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray75, floatArray76, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray76, (float) 'a');
        float[] floatArray82 = new float[] {};
        float[] floatArray83 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray82, floatArray83, (float) (-1));
        float[] floatArray87 = new float[] {};
        float[] floatArray88 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray87, floatArray88, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray82, floatArray88, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray88, (float) (-1L));
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray76, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray45, (float) 1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest2.assertTermsEquals("enwiki.random.lines.txt", indexReader12, terms13, terms14, true);
        java.lang.String str17 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest20.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain26;
        synonymsAnalysisTest20.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest20);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) synonymsAnalysisTest20);
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest35.assertPositionsSkippingEquals("", indexReader37, (int) (short) 0, postingsEnum39, postingsEnum40);
        synonymsAnalysisTest35.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest35.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest45.ruleChain;
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest45.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest49.ruleChain;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain51;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest35, (java.lang.Object) ruleChain51);
        synonymsAnalysisTest35.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "tests.failfast", (java.lang.Object) synonymsAnalysisTest35);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 1L);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray15, 10.0d);
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray6, obj21);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray6, doubleArray24, (double) (-1L));
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 1L);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray39, 10.0d);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray24, doubleArray39, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray1, doubleArray39, (double) 100L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), 0, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 1, (double) (byte) 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        char[] charArray6 = new char[] { ' ', '4', ' ', '#', '#' };
        char[] charArray13 = new char[] { '#', '#', '#', '#', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray6, charArray13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        char[] charArray6 = new char[] { '4', 'a', '#', '4', 'a', 'a' };
        char[] charArray11 = new char[] { ' ', ' ', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray11);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        char[] charArray3 = new char[] { '4', ' ' };
        char[] charArray5 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        int[] intArray2 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (-1), (short) 100, '4', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray2, intArray8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray16);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray23, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray31);
        byte[] byteArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray16, byteArray36);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        long[] longArray5 = new long[] { (short) -1 };
        long[] longArray7 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray5, longArray7);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray11);
        long[] longArray18 = new long[] { (short) -1 };
        long[] longArray20 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray18, longArray20);
        org.junit.Assert.assertArrayEquals(longArray5, longArray20);
        long[] longArray27 = new long[] { (short) -1 };
        long[] longArray29 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray27, longArray29);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("", longArray27, longArray33);
        long[] longArray40 = new long[] { (short) -1 };
        long[] longArray42 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray33, longArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray20, longArray33);
        long[] longArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray33, longArray46);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        int[] intArray6 = new int[] { (-1), 10, (short) 0, ' ', (short) 1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 10, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray11);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (-1.0d));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 100, 0.0f, (float) 10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100, 10.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) 'a', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) byteArray8);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray4, (float) (-1));
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray9, floatArray10, (float) (-1));
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray15, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray15, (float) 'a');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray22, (float) (-1));
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray27, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray15, floatArray27, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray27, (float) 0);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray38, floatArray39, (float) (-1));
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray43, floatArray44, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray44, (float) 'a');
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray50, floatArray51, (float) (-1));
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray55, floatArray56, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray44, floatArray56, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray44, (float) (-1));
        org.junit.Assert.assertNotNull("", (java.lang.Object) floatArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray44, 1.0f);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader21, fields22, fields23, true);
        java.lang.String str26 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader28, fields29, fields30, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader28);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { '#', '#', ' ', ' ', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray1, charArray8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray11);
        java.lang.String str26 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray7, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray13, shortArray19);
        short[] shortArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray26);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 100, (short) 10, (short) 10, (short) 100 };
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray12, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest2.assertTermsEquals("", indexReader6, terms7, terms8, true);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) 10, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest19.assertTermsEquals("enwiki.random.lines.txt", indexReader29, terms30, terms31, true);
        synonymsAnalysisTest19.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("", indexReader38, (int) (short) 0, postingsEnum40, postingsEnum41);
        synonymsAnalysisTest36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("tests.slow", indexReader45, 0, postingsEnum47, postingsEnum48, false);
        synonymsAnalysisTest36.overrideTestDefaultQueryCache();
        synonymsAnalysisTest36.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule54 = synonymsAnalysisTest53.ruleChain;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest53.failureAndSuccessEvents;
        synonymsAnalysisTest53.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule58 = synonymsAnalysisTest57.ruleChain;
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest57.failureAndSuccessEvents;
        synonymsAnalysisTest53.failureAndSuccessEvents = ruleChain59;
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain59;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain59;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain59;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.Set<java.lang.Object> objSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.Set<java.lang.Object> objSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray84);
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        java.util.Set<java.lang.Object> objSet90 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray88);
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray91);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray88, (java.lang.Object[]) executorServiceArray91);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray81);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) executorServiceArray81);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100.0f);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain11;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray3, (java.lang.Object) ruleChain13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray27);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Set<java.lang.Object> objSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest38.assertPositionsSkippingEquals("", indexReader40, (int) (short) 0, postingsEnum42, postingsEnum43);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("", indexReader47, (int) (short) 0, postingsEnum49, postingsEnum50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest52.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule55 = synonymsAnalysisTest54.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest56.assertPositionsSkippingEquals("", indexReader58, (int) (short) 0, postingsEnum60, postingsEnum61);
        org.junit.Assert[] assertArray63 = new org.junit.Assert[] { synonymsAnalysisTest38, synonymsAnalysisTest45, synonymsAnalysisTest52, synonymsAnalysisTest54, synonymsAnalysisTest56 };
        java.util.List<org.junit.Assert> assertList64 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, assertArray63);
        java.util.Collection[] collectionArray66 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.junit.Assert>[] assertCollectionArray67 = (java.util.Collection<org.junit.Assert>[]) collectionArray66;
        assertCollectionArray67[0] = assertList64;
        java.util.Set<java.util.Collection<org.junit.Assert>> assertCollectionSet70 = org.apache.lucene.util.LuceneTestCase.asSet(assertCollectionArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) assertCollectionArray67);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray31);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray52);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest55.assertPositionsSkippingEquals("", indexReader57, (int) (short) 0, postingsEnum59, postingsEnum60);
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        synonymsAnalysisTest55.assertDocsSkippingEquals("tests.slow", indexReader64, 0, postingsEnum66, postingsEnum67, false);
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        synonymsAnalysisTest55.assertTermsEquals("hi!", indexReader72, terms73, terms74, true);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) executorServiceArray38, (java.lang.Object) terms73);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray38);
        java.lang.CharSequence[] charSequenceArray85 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "random", "tests.nightly", "enwiki.random.lines.txt", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.CharSequence> charSequenceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        java.util.Set<java.lang.CharSequence> charSequenceSet87 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray85);
        java.util.List<java.lang.CharSequence> charSequenceList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, charSequenceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) charSequenceArray85);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 10, 100L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) -1, (float) 100L, (float) 1L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1L, 0.0d, (double) 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        char[] charArray6 = new char[] { ' ', '#', 'a', ' ', '4' };
        char[] charArray8 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray6, charArray8);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (-1.0d));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("", indexReader16, (int) (short) 0, postingsEnum18, postingsEnum19);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.slow", indexReader23, 0, postingsEnum25, postingsEnum26, false);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader33, 1, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.badapples", obj1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "random", "tests.nightly", "enwiki.random.lines.txt", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        java.lang.Object[] objArray67 = new java.lang.Object[] { executorServiceArray49 };
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.Set<java.lang.Object> objSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.Set<java.lang.Object> objSet74 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray75);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray68);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        char[] charArray7 = new char[] { '4', '#', ' ', '#', '4', 'a' };
        char[] charArray13 = new char[] { ' ', 'a', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray7, charArray13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray2, (float) (-1));
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray7, (float) (-1));
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray12, floatArray13, (float) (-1));
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray17, floatArray18, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray18, (float) 'a');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray25, (float) (-1));
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray29, floatArray30, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray30, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray18, floatArray30, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray30, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray30, (float) (-1));
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray43, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray43, (float) (short) 0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest48.assertPositionsSkippingEquals("", indexReader50, (int) (short) 0, postingsEnum52, postingsEnum53);
        synonymsAnalysisTest48.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest48.ensureCleanedUp();
        synonymsAnalysisTest48.setUp();
        synonymsAnalysisTest48.setIndexWriterMaxDocs((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray30, (java.lang.Object) synonymsAnalysisTest48);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 0L, 0.0d, (double) 'a');
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 100);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain13;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray5, (java.lang.Object) ruleChain15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", obj1, (java.lang.Object) "random");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray48);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10L, (long) (byte) 100);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray8 = new int[] { (byte) -1, (byte) 0, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("tests.nightly", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23);
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest17.assertFieldsEquals("random", indexReader27, fields28, fields29, true);
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        synonymsAnalysisTest17.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray16, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        java.lang.Class<?> wildcardClass10 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        synonymsAnalysisTest11.resetCheckIndexStatus();
        synonymsAnalysisTest11.resetCheckIndexStatus();
        synonymsAnalysisTest11.resetCheckIndexStatus();
        synonymsAnalysisTest11.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass10, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) '4');
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (-1L), (float) 1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum16, postingsEnum17, false);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 10, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0f, (float) (byte) 1, (float) (byte) 10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        char[] charArray1 = new char[] { '#' };
        char[] charArray5 = new char[] { ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest10.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain16;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain16);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 0L, (double) 10.0f, (double) '4');
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        long[] longArray2 = new long[] { (short) -1 };
        long[] longArray4 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray2, longArray4);
        long[] longArray10 = new long[] { (short) -1 };
        long[] longArray12 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray10, longArray12);
        long[] longArray16 = new long[] { (short) -1 };
        long[] longArray18 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray16, longArray18);
        org.junit.Assert.assertArrayEquals("", longArray10, longArray16);
        long[] longArray23 = new long[] { (short) -1 };
        long[] longArray25 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray23, longArray25);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray16, longArray25);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) longArray16, obj28);
        org.junit.Assert.assertArrayEquals(longArray4, longArray16);
        long[] longArray31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray31);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) ' ', (float) '4', (float) (-1));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray5 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray5);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        java.lang.String str9 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest11.assertTermsEquals("tests.monster", indexReader13, terms14, terms15, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) indexReader13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray8, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) 'a');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray15, (float) (-1));
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray19, floatArray20, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray8, floatArray20, (float) 0L);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray36, byteArray40);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray40, byteArray46);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray61);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray70);
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray70, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray79);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray83, byteArray84);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray87, byteArray88);
        byte[] byteArray91 = new byte[] {};
        byte[] byteArray92 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray91, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray87, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray61, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray46, byteArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray20, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest2.assertTermsEquals("enwiki.random.lines.txt", indexReader12, terms13, terms14, true);
        java.lang.String str17 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.setUp();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) '#', postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest29.assertTermsEquals("", indexReader33, terms34, terms35, true);
        java.lang.String str38 = synonymsAnalysisTest29.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest29.assertDocsEnumEquals("", postingsEnum40, postingsEnum41, true);
        synonymsAnalysisTest29.assertPathHasBeenCleared("europarl.lines.txt.gz");
        synonymsAnalysisTest29.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) postingsEnum26, (java.lang.Object) synonymsAnalysisTest29);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader4, (int) (short) 0, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest12.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest16.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain18;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) ruleChain18);
        synonymsAnalysisTest2.setUp();
        org.junit.Assert.assertNotSame("", obj1, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("hi!", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray5, (float) (-1));
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray9, floatArray10, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) 'a');
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray16, floatArray17, (float) (-1));
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray22, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray22, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray10, floatArray22, (float) 0L);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray30, floatArray31, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray30, (float) (short) 1);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray37, floatArray38, (float) (-1));
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray43, (float) (-1));
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray49, (float) (-1));
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray53, floatArray54, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray54, (float) 'a');
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray60, floatArray61, (float) (-1));
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray65, floatArray66, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray66, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray54, floatArray66, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray66, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray66, (float) (-1));
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray78, floatArray79, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray79, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("hi!", floatArray30, floatArray66, (float) 1);
        float[] floatArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray66, floatArray86, (float) 'a');
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) (byte) 10, (double) '4');
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 1L);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, 10.0d);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray3, obj18);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray21, (double) (-1L));
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) (byte) 1);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray31, (double) 1L);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray37, 10.0d);
        java.lang.Object obj43 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray28, obj43);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray28, (double) 0.0f);
        double[] doubleArray53 = new double[] { 'a', (byte) 1, (short) 0, 1.0f, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray53, (double) 10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 100);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        long[] longArray5 = new long[] { (short) -1 };
        long[] longArray7 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray5, longArray7);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray11);
        long[] longArray18 = new long[] { (short) -1 };
        long[] longArray20 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray18, longArray20);
        org.junit.Assert.assertArrayEquals(longArray5, longArray20);
        long[] longArray27 = new long[] { (short) -1 };
        long[] longArray29 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray27, longArray29);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("", longArray27, longArray33);
        long[] longArray40 = new long[] { (short) -1 };
        long[] longArray42 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray33, longArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray20, longArray33);
        long[] longArray48 = new long[] { (short) -1 };
        long[] longArray50 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray48, longArray50);
        org.junit.Assert.assertArrayEquals(longArray33, longArray50);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy53 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy54 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy55 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy56 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray57 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy53, queryCachingPolicy54, queryCachingPolicy55, queryCachingPolicy56 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy58 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy59 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy60 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy61 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray62 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy58, queryCachingPolicy59, queryCachingPolicy60, queryCachingPolicy61 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy63 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy65 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy66 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray67 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy63, queryCachingPolicy64, queryCachingPolicy65, queryCachingPolicy66 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy68 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy69 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy70 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy71 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray72 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy68, queryCachingPolicy69, queryCachingPolicy70, queryCachingPolicy71 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray73 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray57, queryCachingPolicyArray62, queryCachingPolicyArray67, queryCachingPolicyArray72 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) longArray33, (java.lang.Object) queryCachingPolicyArraySet74);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        char[] charArray4 = new char[] { '#', '#', '4', 'a' };
        char[] charArray8 = new char[] { 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray19);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) executorServiceArray19);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest19.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest23.ruleChain;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest23.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest19.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.resetCheckIndexStatus();
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.slow", indexReader33, (int) (short) 0, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest38.ruleChain;
        synonymsAnalysisTest38.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest38.assertPositionsSkippingEquals("", indexReader42, 0, postingsEnum44, postingsEnum45);
        synonymsAnalysisTest38.setUp();
        synonymsAnalysisTest38.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) indexReader33, (java.lang.Object) 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) 100, (double) 0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) 10L, (double) (-1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader19, 1, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertPositionsSkippingEquals("tests.nightly", indexReader28, (int) (short) 10, postingsEnum30, postingsEnum31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("", indexReader36, (int) (short) 0, postingsEnum38, postingsEnum39);
        org.junit.rules.RuleChain ruleChain41 = null;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain41;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling33, (java.lang.Object) synonymsAnalysisTest34);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) throttling33);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.slow", indexReader47, fields48, fields49, true);
        synonymsAnalysisTest25.tearDown();
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) indexReader19, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        int[] intArray5 = new int[] { (short) 0, (short) 0, (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { '4', (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray9);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100, (double) '4');
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { ' ', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 100, (float) (short) -1, (float) ' ');
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader6, terms7, terms8, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader17, 10, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray9, (float) (-1));
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray13, floatArray14, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 'a');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray20, floatArray21, (float) (-1));
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray25, floatArray26, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray14, floatArray26, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray26, (float) 0);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray37, floatArray38, (float) (-1));
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray43, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 'a');
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray50, (float) (-1));
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray54, floatArray55, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray55, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray43, floatArray55, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray43, (float) (-1));
        org.junit.Assert.assertNotNull("", (java.lang.Object) floatArray43);
        java.lang.Object obj65 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray43, obj65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray43);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', (long) (byte) -1);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (short) 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 1.0f);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray9, byteArray13);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray13, byteArray19);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray43);
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray43, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray52);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray34, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray19, byteArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray19);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        int[] intArray4 = new int[] { (short) 10, ' ', (byte) 10, (short) -1 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray9, intArray13);
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray36);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.Set<java.lang.Object> objSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.Set<java.lang.Object> objSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.Set<java.lang.Object> objSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray81);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) executorServiceArray53);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) 10.0f);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 0, (long) (byte) 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.failfast", indexReader13, (int) (short) 0, postingsEnum15, postingsEnum16);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) (byte) 1);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 1L);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray31, 10.0d);
        java.lang.Object obj37 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray22, obj37);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray22, doubleArray40, (double) (-1L));
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) (byte) 1);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 1L);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray55, 10.0d);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray62, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray55, (double) 1);
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) (byte) 1);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 1L);
        double[] doubleArray81 = new double[] {};
        double[] doubleArray82 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray82, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray81, 10.0d);
        java.lang.Object obj87 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray72, obj87);
        double[] doubleArray89 = new double[] {};
        double[] doubleArray90 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray89, doubleArray90, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray72, doubleArray90, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray22, doubleArray72, 1.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) "tests.failfast", (java.lang.Object) doubleArray72);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        char[] charArray4 = new char[] { '#', 'a', '4' };
        char[] charArray8 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray19);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest43.assertPositionsSkippingEquals("", indexReader45, (int) (short) 0, postingsEnum47, postingsEnum48);
        org.junit.rules.RuleChain ruleChain50 = null;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain50;
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest43.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.Set<java.lang.Object> objSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.Set<java.lang.Object> objSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest43, (java.lang.Object) executorServiceArray54);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray54, (java.lang.Object) false);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray54);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "random", "tests.nightly", "enwiki.random.lines.txt", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.CharSequence> charSequenceSet80 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.util.Set<java.lang.CharSequence> charSequenceSet81 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray79);
        java.util.List<java.lang.CharSequence> charSequenceList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, charSequenceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) charSequenceArray79);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) -1);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("<unknown>", indexReader13, 1, postingsEnum15, postingsEnum16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) objSet21, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) postingsEnum15, (java.lang.Object) executorServiceArray44);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) 1, (long) 1);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest73 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule74 = synonymsAnalysisTest73.ruleChain;
        synonymsAnalysisTest73.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest73.assertTermsEquals("", indexReader77, terms78, terms79, true);
        java.lang.String str82 = synonymsAnalysisTest73.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        synonymsAnalysisTest73.assertDocsEnumEquals("", postingsEnum84, postingsEnum85, true);
        synonymsAnalysisTest73.assertPathHasBeenCleared("europarl.lines.txt.gz");
        synonymsAnalysisTest73.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest73.assertPathHasBeenCleared("tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) executorServiceArray2, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", obj1, (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray4, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray1, floatArray3, (float) (byte) -1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 1L);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray13, 10.0d);
        java.lang.Object obj19 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray4, obj19);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray4, doubleArray22, (double) (-1L));
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 1L);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray38, 10.0d);
        java.lang.Object obj44 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray29, obj44);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray29, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray29, (double) (short) 100);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest54.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest54);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        synonymsAnalysisTest54.assertTermsEquals("random", indexReader59, terms60, terms61, true);
        synonymsAnalysisTest54.ensureAllSearchContextsReleased();
        synonymsAnalysisTest54.ensureCleanedUp();
        synonymsAnalysisTest54.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        synonymsAnalysisTest54.assertFieldsEquals("<unknown>", indexReader68, fields69, fields70, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        double[] doubleArray4 = new double[] { 1L, (short) 0, 10.0f, 10.0f };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) (byte) 1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray12, (double) 1L);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray18, 10.0d);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray9, obj24);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray9, doubleArray27, (double) (-1L));
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray37, (double) 1L);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray43, 10.0d);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray50, (double) 100);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray59, (double) 1L);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray65, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray65, 10.0d);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray74, (double) (byte) 1);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray78, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray77, (double) 1L);
        double[] doubleArray83 = new double[] {};
        double[] doubleArray84 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray84, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray83, 10.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray65, doubleArray74, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray9, doubleArray65, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray65, 100.0d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        long[] longArray5 = new long[] { (short) -1 };
        long[] longArray7 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray5, longArray7);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray11);
        long[] longArray18 = new long[] { (short) -1 };
        long[] longArray20 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray18, longArray20);
        org.junit.Assert.assertArrayEquals(longArray5, longArray20);
        long[] longArray26 = new long[] { (short) -1 };
        long[] longArray28 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray26, longArray28);
        long[] longArray32 = new long[] { (short) -1 };
        long[] longArray34 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray32, longArray34);
        long[] longArray40 = new long[] { (short) -1 };
        long[] longArray42 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray40, longArray42);
        long[] longArray46 = new long[] { (short) -1 };
        long[] longArray48 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray46, longArray48);
        org.junit.Assert.assertArrayEquals("", longArray40, longArray46);
        long[] longArray53 = new long[] { (short) -1 };
        long[] longArray55 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray53, longArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray46, longArray55);
        java.lang.Object obj58 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) longArray46, obj58);
        org.junit.Assert.assertArrayEquals(longArray34, longArray46);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray28, longArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray28);
        org.junit.rules.TestRule testRule63 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "tests.weekly", (java.lang.Object) testRule63);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray4 = new char[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28);
        org.junit.rules.RuleChain ruleChain30 = null;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest23.assertTermsEquals("enwiki.random.lines.txt", indexReader33, terms34, terms35, true);
        java.lang.String str38 = synonymsAnalysisTest23.getTestName();
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest41.ruleChain;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest45.ruleChain;
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain47;
        synonymsAnalysisTest41.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) synonymsAnalysisTest41);
        org.junit.rules.TestRule testRule51 = synonymsAnalysisTest41.ruleChain;
        synonymsAnalysisTest41.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest41.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) false, (java.lang.Object) testRule53);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 100, 0.0d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray6);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray17, byteArray21);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray21, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray21);
        byte[] byteArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray36);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (-1.0d), (double) ' ', (double) 'a');
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.nightly", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        synonymsAnalysisTest10.resetCheckIndexStatus();
        synonymsAnalysisTest10.resetCheckIndexStatus();
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest28.assertPositionsSkippingEquals("", indexReader30, (int) (short) 0, postingsEnum32, postingsEnum33);
        synonymsAnalysisTest28.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest28.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest38.ruleChain;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest38.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule43 = synonymsAnalysisTest42.ruleChain;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest42.failureAndSuccessEvents;
        synonymsAnalysisTest38.failureAndSuccessEvents = ruleChain44;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest28, (java.lang.Object) ruleChain44);
        synonymsAnalysisTest28.setUp();
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest28);
        org.junit.Assert.assertNotSame("", (java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain6, (java.lang.Object) "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 10.0f, (float) (short) 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain11;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray3, (java.lang.Object) ruleChain13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray27);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray60);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy79 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy80 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy81 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy82 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray83 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy79, queryCachingPolicy80, queryCachingPolicy81, queryCachingPolicy82 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet84 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray83);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet85 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) queryCachingPolicyArray83);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (byte) 1, 100.0d, (double) (byte) 100);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 1L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray14, 10.0d);
        java.lang.Object obj20 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray5, obj20);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray5, doubleArray23, (double) (-1L));
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 1L);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray39, 10.0d);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray46, (double) 100);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) (byte) 1);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray55, (double) 1L);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray61, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray61, 10.0d);
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) (byte) 1);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray74, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray73, (double) 1L);
        double[] doubleArray79 = new double[] {};
        double[] doubleArray80 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray80, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray79, 10.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray61, doubleArray70, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray5, doubleArray61, (double) 'a');
        double[] doubleArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray5, doubleArray90, (double) '#');
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) (byte) 100, (float) '#');
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 10L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures24);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures26);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray32 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures22, testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures29, testRuleIgnoreAfterMaxFailures30 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleIgnoreAfterMaxFailuresArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.badapples", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 0, (long) '4');
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        long[] longArray3 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray5);
        long[] longArray11 = new long[] { (short) -1 };
        long[] longArray13 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray13);
        long[] longArray17 = new long[] { (short) -1 };
        long[] longArray19 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("", longArray11, longArray17);
        long[] longArray24 = new long[] { (short) -1 };
        long[] longArray26 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray11, longArray26);
        long[] longArray33 = new long[] { (short) -1 };
        long[] longArray35 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray33, longArray35);
        long[] longArray39 = new long[] { (short) -1 };
        long[] longArray41 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray33, longArray39);
        long[] longArray46 = new long[] { (short) -1 };
        long[] longArray48 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray46, longArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray26, longArray39);
        org.junit.Assert.assertArrayEquals(longArray5, longArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) longArray39);
        long[] longArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray54);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest3.assertPositionsSkippingEquals("", indexReader5, (int) (short) 0, postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = null;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest3.assertTermsEquals("enwiki.random.lines.txt", indexReader13, terms14, terms15, true);
        synonymsAnalysisTest3.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest3);
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) 0, (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray9, (double) 1L);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray15, 10.0d);
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray6, obj21);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray6, doubleArray24, (double) (-1L));
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 1L);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray39, 10.0d);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray24, doubleArray39, (double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray1, doubleArray24, (double) 10.0f);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0L, 0L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("", indexReader36, (int) (short) 0, postingsEnum38, postingsEnum39);
        synonymsAnalysisTest34.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest34.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest34);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100.0f, (double) 10, (double) (short) -1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader16, fields17, fields18, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) 10, (long) (byte) 10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', 1.0f, (-1.0f));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray2, doubleArray5, (double) 100L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        char[] charArray6 = new char[] { '4', ' ', '#', '#', 'a' };
        char[] charArray11 = new char[] { 'a', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray6, charArray11);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10.0f, 0.0d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        java.lang.String[] strArray7 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.monster", "tests.maxfailures", "tests.awaitsfix", "tests.maxfailures", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) strArray7);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        char[] charArray2 = new char[] { 'a', 'a' };
        char[] charArray5 = new char[] { ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        org.junit.rules.RuleChain ruleChain24 = null;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain24;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        char[] charArray3 = new char[] { 'a', '#', '4' };
        char[] charArray6 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest36.ruleChain;
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain42;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray34, (java.lang.Object) ruleChain44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.Set<java.lang.Object> objSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.Set<java.lang.Object> objSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.Set<java.lang.Object> objSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray85);
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertNotNull("", (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest19.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest23.ruleChain;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest23.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest19.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain11;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray3, (java.lang.Object) ruleChain13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.Set<java.lang.Object> objSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray54);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray26);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy62 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy63 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy64 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy65 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray66 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy62, queryCachingPolicy63, queryCachingPolicy64, queryCachingPolicy65 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet67 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray66);
        java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, queryCachingPolicyArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) queryCachingPolicyArray66);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        char[] charArray1 = null;
        char[] charArray4 = new char[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray4);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        char[] charArray4 = new char[] { '4', '#', '4' };
        char[] charArray9 = new char[] { ' ', '4', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (double) 'a', (double) 1.0f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) '#', 0.0f);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) locale3);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "europarl.lines.txt.gz", "random", "tests.nightly", "enwiki.random.lines.txt", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray4, shortArray10);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray22, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray28);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray28, shortArray34);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray46, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray41);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray61, shortArray67);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray73);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray76);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray73, shortArray79);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray79);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray41, shortArray79);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray10, shortArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray79);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) ' ');
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1, (double) 10.0f, (-1.0d));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray4, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray15, intArray19);
        org.junit.Assert.assertArrayEquals(intArray12, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray8 = new char[] { 'a', 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray3, charArray8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader7, terms8, terms9, true);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 0L, (-1.0d), (double) 10L);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray11);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray27, intArray31);
        org.junit.Assert.assertArrayEquals(intArray24, intArray27);
        org.junit.Assert.assertArrayEquals(intArray7, intArray24);
        int[] intArray41 = new int[] { (short) 1, 1, 'a', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray24, intArray41);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1L), 0L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 10, (double) '#', (double) (byte) 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray15 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures19 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray15, testRuleIgnoreAfterMaxFailuresArray20 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest29.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest33.ruleChain;
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain35;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray27, (java.lang.Object) ruleChain37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.Set<java.lang.Object> objSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.Set<java.lang.Object> objSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray78);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull("", (java.lang.Object) executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray21, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) (byte) 1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray4, (double) 1L);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray10, 10.0d);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray17, (double) 100);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray26, (double) 1L);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray32, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray32, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray26, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray37, intArray41);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray30, intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (-1L));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, 100L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray6);
        long[] longArray10 = new long[] { (short) -1 };
        long[] longArray12 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray10);
        long[] longArray17 = new long[] { (short) -1 };
        long[] longArray19 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals(longArray4, longArray19);
        long[] longArray26 = new long[] { (short) -1 };
        long[] longArray28 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray26, longArray28);
        long[] longArray32 = new long[] { (short) -1 };
        long[] longArray34 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray32, longArray34);
        org.junit.Assert.assertArrayEquals("", longArray26, longArray32);
        long[] longArray39 = new long[] { (short) -1 };
        long[] longArray41 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray32, longArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray19, longArray32);
        long[] longArray47 = new long[] { (short) -1 };
        long[] longArray49 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray47, longArray49);
        org.junit.Assert.assertArrayEquals(longArray32, longArray49);
        long[] longArray55 = new long[] { (short) -1 };
        long[] longArray57 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray55, longArray57);
        long[] longArray61 = new long[] { (short) -1 };
        long[] longArray63 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("", longArray55, longArray61);
        org.junit.Assert.assertArrayEquals(longArray49, longArray55);
        long[] longArray71 = new long[] { (short) -1 };
        long[] longArray73 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray71, longArray73);
        long[] longArray77 = new long[] { (short) -1 };
        long[] longArray79 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray77, longArray79);
        org.junit.Assert.assertArrayEquals("", longArray71, longArray77);
        long[] longArray84 = new long[] { (short) -1 };
        long[] longArray86 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray84, longArray86);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray77, longArray86);
        java.lang.Object obj89 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) longArray77, obj89);
        long[] longArray93 = new long[] { (short) -1 };
        long[] longArray95 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray93, longArray95);
        org.junit.Assert.assertArrayEquals(longArray77, longArray95);
        org.junit.Assert.assertArrayEquals(longArray55, longArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray77);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, 0, postingsEnum7, postingsEnum8);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("enwiki.random.lines.txt", indexReader5, fields6, fields7, true);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest26.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest26.failureAndSuccessEvents;
        synonymsAnalysisTest26.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain32;
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest26.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray24, (java.lang.Object) ruleChain34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.Set<java.lang.Object> objSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray75);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertNotNull("", (java.lang.Object) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) fields7, (java.lang.Object) executorServiceArray12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = null;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling8, (java.lang.Object) synonymsAnalysisTest9);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) throttling8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest21);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.monster", indexReader25, (int) (short) 10, postingsEnum27, postingsEnum28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 100.0f, 0.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0L, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest6.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain12;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray4, (java.lang.Object) ruleChain14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray55);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        synonymsAnalysisTest62.assertPositionsSkippingEquals("", indexReader64, (int) (short) 0, postingsEnum66, postingsEnum67);
        org.junit.rules.RuleChain ruleChain69 = null;
        synonymsAnalysisTest62.failureAndSuccessEvents = ruleChain69;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        synonymsAnalysisTest62.assertTermsEquals("enwiki.random.lines.txt", indexReader72, terms73, terms74, true);
        java.lang.String str77 = synonymsAnalysisTest62.getTestName();
        synonymsAnalysisTest62.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest62.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest80 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule81 = synonymsAnalysisTest80.ruleChain;
        org.junit.rules.RuleChain ruleChain82 = synonymsAnalysisTest80.failureAndSuccessEvents;
        synonymsAnalysisTest80.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest84 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule85 = synonymsAnalysisTest84.ruleChain;
        org.junit.rules.RuleChain ruleChain86 = synonymsAnalysisTest84.failureAndSuccessEvents;
        synonymsAnalysisTest80.failureAndSuccessEvents = ruleChain86;
        synonymsAnalysisTest80.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest62, (java.lang.Object) synonymsAnalysisTest80);
        org.junit.rules.TestRule testRule90 = synonymsAnalysisTest80.ruleChain;
        synonymsAnalysisTest80.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass92 = synonymsAnalysisTest80.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "<unknown>", (java.lang.Object) synonymsAnalysisTest80);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("<unknown>", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (short) 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 0, (-1.0f), (float) 0L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '4', (long) 1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest4.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest8.ruleChain;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest8.failureAndSuccessEvents;
        synonymsAnalysisTest4.failureAndSuccessEvents = ruleChain10;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray2, (java.lang.Object) ruleChain12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        java.lang.Class<?> wildcardClass18 = ruleChain16.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling19 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25);
        org.junit.rules.RuleChain ruleChain27 = null;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain27;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling19, (java.lang.Object) synonymsAnalysisTest20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling19 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet32 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray31);
        java.lang.Class<?> wildcardClass33 = throttlingArray31.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest35.assertPositionsSkippingEquals("", indexReader37, (int) (short) 0, postingsEnum39, postingsEnum40);
        org.junit.rules.RuleChain ruleChain42 = null;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain42;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling34, (java.lang.Object) synonymsAnalysisTest35);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet47 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray46);
        java.lang.Class<?> wildcardClass48 = throttlingArray46.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray49 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18, wildcardClass33, wildcardClass48 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet50 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) genericDeclarationArray49);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray6, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray23, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray23);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray36, shortArray42);
        org.junit.Assert.assertArrayEquals("hi!", shortArray23, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest49.assertPositionsSkippingEquals("", indexReader51, (int) (short) 0, postingsEnum53, postingsEnum54);
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest49, (java.lang.Object) locale59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) shortArray23, (java.lang.Object) locale59);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, 0.0d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 1L);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, 10.0d);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray18, (double) 100);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 1L);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray33, 10.0d);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray40, (double) 100);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) (byte) 1);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray49, (double) 1L);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray55, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray55, 10.0d);
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) (byte) 1);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray68, (double) 1L);
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray74, 10.0d);
        double[] doubleArray80 = new double[] {};
        double[] doubleArray81 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray81, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray81, (double) 100);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray74, (double) '4');
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray18, doubleArray40, (double) 1L);
        double[] doubleArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray91, (double) 100L);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("tests.slow", indexReader15, 0, postingsEnum17, postingsEnum18, false);
        synonymsAnalysisTest6.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) ' ');
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        java.lang.String str16 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) '4');
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        char[] charArray3 = new char[] { 'a', ' ', '#' };
        char[] charArray8 = new char[] { 'a', 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray8, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray25, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray38, shortArray44);
        org.junit.Assert.assertArrayEquals("hi!", shortArray25, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray51);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (-1.0d));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        java.lang.Iterable[] iterableArray1 = new java.lang.Iterable[0];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.junit.Assert>[] assertIterableArray2 = (java.lang.Iterable<org.junit.Assert>[]) iterableArray1;
        java.util.Set<java.lang.Iterable<org.junit.Assert>> assertIterableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<org.junit.Assert>[]) iterableArray1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures10, testRuleIgnoreAfterMaxFailures12 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures15, testRuleIgnoreAfterMaxFailures17 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray23 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures20, testRuleIgnoreAfterMaxFailures22 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray24 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray8, testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray18, testRuleIgnoreAfterMaxFailuresArray23 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) iterableArray1, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray24);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("hi!", postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("tests.slow", postingsEnum21, postingsEnum22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 10, (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 1L);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, 10.0d);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray3, obj18);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray3, doubleArray21, (double) 0.0f);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest26.assertPositionsSkippingEquals("", indexReader28, (int) (short) 0, postingsEnum30, postingsEnum31);
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0f, (java.lang.Object) synonymsAnalysisTest26);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 'a', (long) (short) 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy4, queryCachingPolicy5 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy7, queryCachingPolicy8 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray12 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy10, queryCachingPolicy11 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray13 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray3, queryCachingPolicyArray6, queryCachingPolicyArray9, queryCachingPolicyArray12 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.Set<java.lang.Object> objSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.Set<java.lang.Object> objSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.Set<java.lang.Object> objSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        java.util.Set<java.lang.Object> objSet78 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray76);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) queryCachingPolicyArray13, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray2, (float) (-1));
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray7, (float) (-1));
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray12, floatArray13, (float) (-1));
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray17, floatArray18, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray18, (float) 'a');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray25, (float) (-1));
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray29, floatArray30, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray30, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray18, floatArray30, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray30, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray30, (float) (-1));
        org.junit.Assert.assertNotNull((java.lang.Object) floatArray2);
        float[] floatArray48 = new float[] { 10.0f, 100, 0, (byte) 10, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray48, (float) (byte) 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, obj1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[][] byteArray16 = new byte[][] { byteArray3, byteArray7, byteArray11, byteArray15 };
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        byte[][] byteArray33 = new byte[][] { byteArray20, byteArray24, byteArray28, byteArray32 };
        byte[][][] byteArray34 = new byte[][][] { byteArray16, byteArray33 };
        java.util.Set<byte[][]> byteArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray34);
        java.lang.Object[] objArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) byteArray34, objArray36);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 10, (double) 1);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray8, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) 'a');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray15, (float) (-1));
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray19, floatArray20, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray8, floatArray20, (float) 0L);
        float[] floatArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray27, (float) (short) -1);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader22, (int) (short) 0, postingsEnum24, postingsEnum25);
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (short) 1);
        synonymsAnalysisTest20.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain36;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) ruleChain36);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest20.assertTermsEquals("", indexReader40, terms41, terms42, true);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("random", postingsEnum46, postingsEnum47, true);
        synonymsAnalysisTest20.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule19, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("random", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0L, 1.0d, (double) 1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.badapples", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) -1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, 10L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        char[] charArray3 = new char[] { '4', ' ', '#' };
        char[] charArray9 = new char[] { 'a', '#', '#', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = null;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest9.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) executorServiceArray20);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest11.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest15.failureAndSuccessEvents;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("tests.slow", indexReader31, 0, postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest22.assertFieldsEquals("<unknown>", indexReader38, fields39, fields40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest22.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain17, (java.lang.Object) fields46);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        int[] intArray4 = new int[] { 'a', (short) 10, (-1) };
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray8, intArray12);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray19, intArray23);
        org.junit.Assert.assertArrayEquals(intArray16, intArray19);
        org.junit.Assert.assertArrayEquals("", intArray12, intArray16);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray29);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.slow", indexReader27, terms28, terms29, false);
        java.lang.String str32 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest17.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) boolean16, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule13 = org.apache.lucene.util.LuceneTestCase.classRules;
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray16, (float) (-1));
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray22, (float) (-1));
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray26, floatArray27, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 'a');
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray33, floatArray34, (float) (-1));
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray38, floatArray39, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray39, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray27, floatArray39, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray39, (float) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule13, (java.lang.Object) floatArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) testRule13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (short) 10, 0.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        float[] floatArray4 = new float[] { (short) -1, 1.0f, 100, 0.0f };
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray9, (float) (-1));
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray13, floatArray14, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 'a');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray20, floatArray21, (float) (-1));
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray25, floatArray26, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray14, floatArray26, (float) 0L);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray34, floatArray35, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray34, (float) 100L);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray43, floatArray44, (float) (-1));
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray49, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray49, (float) 'a');
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray55, floatArray56, (float) (-1));
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray60, floatArray61, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray61, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray49, floatArray61, (float) 0L);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray69, floatArray70, (float) (-1));
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray74, floatArray75, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray75, (float) 'a');
        org.junit.Assert.assertArrayEquals("hi!", floatArray49, floatArray69, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray34, floatArray49, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray34, (float) 0L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        char[] charArray1 = new char[] {};
        char[] charArray5 = new char[] { '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray5);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) (byte) 10, 0.0f);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 1.0f, (double) 0L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader24, (int) (short) 0, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("tests.slow", indexReader31, 0, postingsEnum33, postingsEnum34, false);
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest22.assertTermsEquals("hi!", indexReader39, terms40, terms41, true);
        org.junit.rules.TestRule testRule44 = synonymsAnalysisTest22.ruleChain;
        synonymsAnalysisTest22.ensureCheckIndexPassed();
        synonymsAnalysisTest22.tearDown();
        org.junit.rules.TestRule testRule47 = synonymsAnalysisTest22.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20, false);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader25, terms26, terms27, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35);
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest30.assertTermsEquals("tests.slow", indexReader40, terms41, terms42, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) terms26, (java.lang.Object) terms42);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray19);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray28);
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray28, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray37);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray47);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray47, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain12, (java.lang.Object) byteArray47);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 10, (long) 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray3);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) ' ');
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) '4', (long) 100);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (short) -1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { ' ', '4', '#', 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray1, charArray8);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        char[] charArray5 = new char[] { 'a', ' ', '#', 'a' };
        char[] charArray7 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray5, charArray7);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader8, (int) (byte) 10, postingsEnum10, postingsEnum11);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (-1.0d));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (-1), numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 10L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        char[] charArray6 = new char[] { ' ', '4', ' ', '4', '4', '#' };
        char[] charArray8 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (-1), (float) (byte) 1, (float) (byte) 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray11);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest28.assertPositionsSkippingEquals("", indexReader30, (int) (short) 0, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = null;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain35;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest28.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling27, (java.lang.Object) synonymsAnalysisTest28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet40 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray39);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) throttlingArray39);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 0, 0L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0, (double) (short) 0, (double) 10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "random", (java.lang.Object) shortArray21);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, true);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader18, fields19, fields20, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("", indexReader25, (int) (short) 0, postingsEnum27, postingsEnum28);
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("tests.slow", indexReader32, 0, postingsEnum34, postingsEnum35, false);
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) true, (java.lang.Object) synonymsAnalysisTest23);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest23.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        char[] charArray2 = new char[] { 'a', 'a' };
        char[] charArray6 = new char[] { '#', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 'a');
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain19;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray11, (java.lang.Object) ruleChain21);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100L, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray14, intArray18);
        org.junit.Assert.assertArrayEquals(intArray11, intArray14);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray11);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray26, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray37, intArray41);
        org.junit.Assert.assertArrayEquals(intArray34, intArray37);
        org.junit.Assert.assertArrayEquals("", intArray30, intArray34);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray34, intArray47);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray52, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray63, intArray67);
        org.junit.Assert.assertArrayEquals(intArray60, intArray63);
        org.junit.Assert.assertArrayEquals("", intArray56, intArray60);
        org.junit.Assert.assertArrayEquals(intArray47, intArray60);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray11, intArray47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule75 = synonymsAnalysisTest74.ruleChain;
        synonymsAnalysisTest74.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        synonymsAnalysisTest74.assertTermsEquals("", indexReader78, terms79, terms80, true);
        java.lang.String str83 = synonymsAnalysisTest74.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest74.assertDocsEnumEquals("", postingsEnum85, postingsEnum86, true);
        synonymsAnalysisTest74.ensureAllSearchContextsReleased();
        java.lang.String str90 = synonymsAnalysisTest74.getTestName();
        org.junit.rules.TestRule testRule91 = synonymsAnalysisTest74.ruleChain;
        synonymsAnalysisTest74.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.weekly", (java.lang.Object) synonymsAnalysisTest74);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { ' ', 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule16);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest27.assertPositionsSkippingEquals("tests.nightly", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        java.lang.String str35 = synonymsAnalysisTest27.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest27.assertPositionsSkippingEquals("", indexReader37, (int) (short) 0, postingsEnum39, postingsEnum40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum40);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        char[] charArray6 = new char[] { '4', ' ', '4', '#', 'a', '4' };
        char[] charArray9 = new char[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 0L, (double) (short) 10);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        java.lang.Object[] objArray67 = new java.lang.Object[] { executorServiceArray49 };
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.Set<java.lang.Object> objSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.Set<java.lang.Object> objSet74 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray75);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray68);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray49);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray49);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy85 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy86 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray87 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy85, queryCachingPolicy86 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy88 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy89 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray90 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy88, queryCachingPolicy89 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy91 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy92 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray93 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy91, queryCachingPolicy92 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy94 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy95 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray96 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy94, queryCachingPolicy95 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray97 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray87, queryCachingPolicyArray90, queryCachingPolicyArray93, queryCachingPolicyArray96 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet98 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) queryCachingPolicyArray97);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 10, (long) 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray15 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures19 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray15, testRuleIgnoreAfterMaxFailuresArray20 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest24.assertPositionsSkippingEquals("", indexReader26, (int) (short) 0, postingsEnum28, postingsEnum29);
        org.junit.rules.RuleChain ruleChain31 = null;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain31;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling23, (java.lang.Object) synonymsAnalysisTest24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet36 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray35);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray21, (java.lang.Object[]) throttlingArray35);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 1L);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray13, 10.0d);
        java.lang.Object obj19 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray4, obj19);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray4, doubleArray22, (double) (-1L));
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest27.assertPositionsSkippingEquals("", indexReader29, (int) (short) 0, postingsEnum31, postingsEnum32);
        org.junit.rules.RuleChain ruleChain34 = null;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain34;
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray22, (java.lang.Object) ruleChain34);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) (byte) 1);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray41, (double) 1L);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray47, 10.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray22, doubleArray38, (double) 100);
        double[] doubleArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray56, (double) 'a');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0L, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", 0.0d, (double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray8, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        char[] charArray4 = new char[] { 'a', 'a', 'a', ' ' };
        char[] charArray7 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader11, terms12, terms13, true);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        long[] longArray24 = new long[] { (short) -1 };
        long[] longArray26 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray24, longArray26);
        long[] longArray32 = new long[] { (short) -1 };
        long[] longArray34 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray32, longArray34);
        long[] longArray38 = new long[] { (short) -1 };
        long[] longArray40 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray38, longArray40);
        org.junit.Assert.assertArrayEquals("", longArray32, longArray38);
        long[] longArray45 = new long[] { (short) -1 };
        long[] longArray47 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray45, longArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray38, longArray47);
        java.lang.Object obj50 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) longArray38, obj50);
        org.junit.Assert.assertArrayEquals(longArray26, longArray38);
        long[] longArray57 = new long[] { (short) -1 };
        long[] longArray59 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray57, longArray59);
        long[] longArray63 = new long[] { (short) -1 };
        long[] longArray65 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray63, longArray65);
        org.junit.Assert.assertArrayEquals("", longArray57, longArray63);
        long[] longArray70 = new long[] { (short) -1 };
        long[] longArray72 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray70, longArray72);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray63, longArray72);
        org.junit.Assert.assertArrayEquals("hi!", longArray38, longArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "hi!", (java.lang.Object) longArray72);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray6);
        long[] longArray12 = new long[] { (short) -1 };
        long[] longArray14 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray12, longArray14);
        long[] longArray18 = new long[] { (short) -1 };
        long[] longArray20 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray18, longArray20);
        org.junit.Assert.assertArrayEquals("", longArray12, longArray18);
        long[] longArray25 = new long[] { (short) -1 };
        long[] longArray27 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray25, longArray27);
        org.junit.Assert.assertArrayEquals(longArray12, longArray27);
        long[] longArray34 = new long[] { (short) -1 };
        long[] longArray36 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray34, longArray36);
        long[] longArray40 = new long[] { (short) -1 };
        long[] longArray42 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("", longArray34, longArray40);
        long[] longArray47 = new long[] { (short) -1 };
        long[] longArray49 = new long[] { (-1) };
        org.junit.Assert.assertArrayEquals("<unknown>", longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray40, longArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray27, longArray40);
        org.junit.Assert.assertArrayEquals(longArray6, longArray40);
        org.junit.Assert.assertNotNull((java.lang.Object) longArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray40);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        char[] charArray4 = new char[] { 'a', ' ', '#' };
        char[] charArray6 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray5, (double) 1L);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, 10.0d);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray18, (double) 100);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray25, byteArray26);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray32, (double) 1L);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray32, (double) 10L);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) (byte) 1);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray47, (double) 1L);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray53, 10.0d);
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray44, obj59);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray44, doubleArray62, (double) 0.0f);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray68, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray67, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) 10L, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.Set<java.lang.Object> objSet66 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray64);
        java.lang.String[] strArray80 = new java.lang.String[] { "enwiki.random.lines.txt", "tests.monster", "tests.maxfailures", "tests.awaitsfix", "tests.maxfailures", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) strArray80);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray4 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0, queryCachingPolicy1, queryCachingPolicy2, queryCachingPolicy3 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy7 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray9 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy5, queryCachingPolicy6, queryCachingPolicy7, queryCachingPolicy8 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy10 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy11 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy12 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy13 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray14 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy10, queryCachingPolicy11, queryCachingPolicy12, queryCachingPolicy13 };
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy15 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy16 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy17 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy18 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray19 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy15, queryCachingPolicy16, queryCachingPolicy17, queryCachingPolicy18 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray20 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray4, queryCachingPolicyArray9, queryCachingPolicyArray14, queryCachingPolicyArray19 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest27.ruleChain;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest27.failureAndSuccessEvents;
        synonymsAnalysisTest27.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest31.failureAndSuccessEvents;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain33;
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray25, (java.lang.Object) ruleChain35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.Set<java.lang.Object> objSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray49);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray20, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 100.0f);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10, (double) ' ', (double) 10L);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray3, (float) (-1));
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray7, floatArray8, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) 'a');
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray14, floatArray15, (float) (-1));
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray19, floatArray20, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray20, (float) (-1L));
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray29, floatArray30, (float) (-1));
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray34, floatArray35, (float) (-1));
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray40, floatArray41, (float) (-1));
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray45, floatArray46, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray46, (float) 'a');
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray52, floatArray53, (float) (-1));
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray57, floatArray58, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray58, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray46, floatArray58, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray58, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray58, (float) (-1));
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray70, floatArray71, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray71, (float) (short) 0);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) floatArray58);
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray78, floatArray79, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray79, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray79, (float) (short) 0);
        float[] floatArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray86, 0.0f);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader10, 0, postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest1.failureAndSuccessEvents;
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray22, (double) 1L);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray28, 10.0d);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray35, (double) 100);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) (byte) 1);
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray44, (double) 1L);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray50, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray50, 10.0d);
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) (byte) 1);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 1L);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray68, 10.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray50, doubleArray59, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) doubleArray59);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 100, (float) 10L, (float) (byte) -1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray9);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) 1L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray18, (double) 1L);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray24, 10.0d);
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray15, obj30);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray15, doubleArray33, (double) (-1L));
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 1L);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray48, 10.0d);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray55, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray48, (double) 1);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray3, doubleArray48, (double) (short) 0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        synonymsAnalysisTest64.assertPositionsSkippingEquals("", indexReader66, (int) (short) 0, postingsEnum68, postingsEnum69);
        org.junit.rules.RuleChain ruleChain71 = null;
        synonymsAnalysisTest64.failureAndSuccessEvents = ruleChain71;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        synonymsAnalysisTest64.assertTermsEquals("enwiki.random.lines.txt", indexReader74, terms75, terms76, true);
        java.lang.String str79 = synonymsAnalysisTest64.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        synonymsAnalysisTest64.assertDocsEnumEquals("tests.maxfailures", postingsEnum81, postingsEnum82, false);
        synonymsAnalysisTest64.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) doubleArray3, (java.lang.Object) synonymsAnalysisTest64);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest9.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray9, byteArray13);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray13, byteArray19);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray33);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray43, floatArray44, (float) (-1));
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray50, (float) (-1));
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray54, floatArray55, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray55, (float) 'a');
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray61, floatArray62, (float) (-1));
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray66, floatArray67, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray67, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray55, floatArray67, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray67, (float) 0);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) byteArray33, (java.lang.Object) floatArray43);
        org.junit.Assert.assertArrayEquals("hi!", byteArray19, byteArray33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures78 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures79 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures78);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures80 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures81 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures80);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures82 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures83 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures82);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures84 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures85 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures84);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures86 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures87 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures86);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray88 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures79, testRuleIgnoreAfterMaxFailures81, testRuleIgnoreAfterMaxFailures82, testRuleIgnoreAfterMaxFailures84, testRuleIgnoreAfterMaxFailures87 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet89 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray88);
        java.util.Set<org.junit.rules.TestRule> testRuleSet90 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray88);
        org.junit.Assert.assertNotNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "hi!", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray88);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) queryCachingPolicySet8, (java.lang.Object) executorServiceArray23);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        byte[][] byteArray49 = new byte[][] { byteArray33, byteArray38, byteArray43, byteArray48 };
        java.util.Set<byte[]> byteArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) byteArray49);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest9.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain15;
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, obj18);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain11;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) executorServiceArray3, (java.lang.Object) ruleChain13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest58.ruleChain;
        synonymsAnalysisTest58.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        synonymsAnalysisTest58.assertTermsEquals("", indexReader62, terms63, terms64, true);
        synonymsAnalysisTest58.assertPathHasBeenCleared("tests.nightly");
        java.lang.String str69 = synonymsAnalysisTest58.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray16, (java.lang.Object) str69);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) ' ', (float) (short) 10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '4', (long) (byte) 100);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 0, (long) '4');
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain2 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("tests.nightly", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest9.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain26);
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain26;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain26;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest33.assertPositionsSkippingEquals("", indexReader35, (int) (short) 0, postingsEnum37, postingsEnum38);
        org.junit.rules.RuleChain ruleChain40 = null;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        synonymsAnalysisTest33.assertTermsEquals("enwiki.random.lines.txt", indexReader43, terms44, terms45, true);
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest33.assertDocsSkippingEquals("hi!", indexReader51, 100, postingsEnum53, postingsEnum54, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        char[] charArray6 = new char[] { 'a', '#', '#', '4', '#', 'a' };
        char[] charArray9 = new char[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) 1L);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray14, 10.0d);
        java.lang.Object obj20 = null;
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) doubleArray5, obj20);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray5, doubleArray23, (double) (-1L));
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest28.assertPositionsSkippingEquals("", indexReader30, (int) (short) 0, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = null;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain35;
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray23, (java.lang.Object) ruleChain35);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray42, (double) 1L);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray48, 10.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray39);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray23, doubleArray39, (double) 100);
        double[] doubleArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray39, doubleArray57, (double) (byte) 1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] {};
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] { synonymsAnalysisTestArray0 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray37);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.Set<java.lang.Object> objSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.Set<java.lang.Object> objSet72 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.Set<java.lang.Object> objSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray82);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) synonymsAnalysisTestArray1, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, (long) (short) 10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) (short) 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray35);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.Set<java.lang.Object> objSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.Set<java.lang.Object> objSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.Set<java.lang.Object> objSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.Set<java.lang.Object> objSet74 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray80);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray52);
        java.lang.Object[] objArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray10, objArray88);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) '4');
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest19.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) 1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (short) 10, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.resetCheckIndexStatus();
        synonymsAnalysisTest19.resetCheckIndexStatus();
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("hi!", postingsEnum32, postingsEnum33, true);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 'a');
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (short) 10, postingsEnum5, postingsEnum6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = null;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling8, (java.lang.Object) synonymsAnalysisTest9);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) throttling8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest21);
        java.lang.String str24 = synonymsAnalysisTest21.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest21.assertDocsAndPositionsEnumEquals("", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray31, floatArray32, (float) (-1));
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray37, floatArray38, (float) (-1));
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray43, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 'a');
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray50, (float) (-1));
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals("", floatArray54, floatArray55, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray55, (float) 'a');
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray43, floatArray55, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray55, (float) 0);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) byteArray21, (java.lang.Object) floatArray31);
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray21);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray67);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) '4', (double) (-1L));
    }
}

