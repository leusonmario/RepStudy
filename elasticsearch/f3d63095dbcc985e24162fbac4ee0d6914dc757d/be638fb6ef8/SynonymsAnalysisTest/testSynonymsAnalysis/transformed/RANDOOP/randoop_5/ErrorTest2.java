import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        long[] longArray5 = new long[] { (-1L), 100L, (-1), 1L };
        long[] longArray10 = new long[] { (byte) 0, 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (-1L));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1.0f), (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader17, (int) (short) -1, postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.monster", indexReader33, fields34, fields35, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest23.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("tests.badapples", indexReader40, (int) (byte) -1, postingsEnum42, postingsEnum43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) false, (java.lang.Object) postingsEnum43);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        int[] intArray2 = new int[] { 4 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray3);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceArray7.getClass();
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        java.lang.Class<?> wildcardClass19 = shortArray15.getClass();
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        java.lang.Class<?> wildcardClass29 = shortArray25.getClass();
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray48, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray48);
        java.lang.Class<?> wildcardClass55 = executorServiceArray48.getClass();
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        java.lang.Class<?> wildcardClass65 = shortArray61.getClass();
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray72);
        java.lang.Class<?> wildcardClass74 = charSequenceArray72.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = new java.lang.reflect.GenericDeclaration[] { wildcardClass9, wildcardClass19, wildcardClass29, wildcardClass55, wildcardClass65, wildcardClass74 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet76 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray75);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray85, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) genericDeclarationArray75, (java.lang.Object[]) executorServiceArray80);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("tests.badapples", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest12.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (java.lang.Object) postingsEnum9, (java.lang.Object) analysisService31);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, 10.0f, (float) (-1L));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 'a', (long) 'a');
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String str13 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest1.tearDown();
        java.lang.Class<?> wildcardClass17 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) (short) 1);
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest24.assertDocsSkippingEquals("hi!", indexReader27, 0, postingsEnum29, postingsEnum30, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest24.analysisService;
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain34;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest18.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader25, 3, postingsEnum27, postingsEnum28);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest0.getlogger();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (byte) 1, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        long[] longArray5 = new long[] { (short) 10, 10L, (short) -1, (-1) };
        long[] longArray8 = new long[] { (byte) 100, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100.0f, 0.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) ' ');
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest7.assertDocsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10, true);
        synonymsAnalysisTest7.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest7.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (int) '4', postingsEnum19, postingsEnum20);
        synonymsAnalysisTest7.setUp();
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray34);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        org.junit.Assert.assertArrayEquals("random", shortArray29, shortArray43);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray54, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray43, (java.lang.Object) executorServiceArray54);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) executorServiceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) 100);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 100L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 10.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (short) -1, 100.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 0L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) 0L);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray11, (double) (-1));
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) 0L);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray17, doubleArray22, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray17, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, (double) 10.0f);
        double[] doubleArray37 = new double[] { 1L, 3, 4, 1, 100, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray11, doubleArray37, (double) (byte) 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        int[] intArray6 = new int[] { (byte) 0, '4', (byte) 0, (short) -1, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, 0, (-1), (short) -1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray13);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray13, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray38, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray50, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray66, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray61);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        int[] intArray2 = new int[] { 3 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest6);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest6.logger;
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest6.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strComparableSet5, (java.lang.Object) testRule19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        long[] longArray3 = new long[] { 1, 10 };
        long[] longArray10 = new long[] { 0, (byte) 10, (short) 1, 1, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray3, longArray10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        char[] charArray0 = null;
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray19);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray12, charArray25);
        org.junit.Assert.assertArrayEquals(charArray1, charArray12);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray30, charArray37);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals("", charArray42, charArray49);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertArrayEquals(charArray12, charArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) ' ', (long) (short) 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 10, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) 2);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) '4', (double) (byte) 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest16.assertPositionsSkippingEquals("tests.badapples", indexReader28, (int) (short) 10, postingsEnum30, postingsEnum31);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (short) -1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (byte) -1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) '4', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (-1), (byte) 100, (short) 10, 'a', 0L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (byte) 10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) 10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '4', (double) 10L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str39 = synonymsAnalysisTest38.getTestName();
        java.lang.String str40 = synonymsAnalysisTest38.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest38.logger;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        synonymsAnalysisTest38.assertTermsEquals("tests.badapples", indexReader43, terms44, terms45, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) executorServiceArray16, (java.lang.Object) terms45);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        long[] longArray1 = new long[] { 0L };
        long[] longArray4 = new long[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        long[] longArray4 = new long[] { 1, 100, 3 };
        long[] longArray9 = new long[] { 1, 'a', 2, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str16 = synonymsAnalysisTest15.getTestName();
        synonymsAnalysisTest15.ensureCleanedUp();
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        int[] intArray3 = new int[] { (byte) -1, (short) 100 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray3, intArray5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 'a', 1.0d, (double) (short) 1);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), (long) 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray15, (java.lang.Object) (-1.0f));
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray29, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray37, (java.lang.Object) (-1.0f));
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray37, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray37);
        java.lang.Class<?> wildcardClass47 = executorServiceArray37.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) executorServiceArray37);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.analysisService;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (short) 10, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("hi!", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest28.setanalysisService(analysisService37);
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest28.logger;
        java.lang.Object obj40 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest28, obj40);
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest28.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) synonymsAnalysisTest28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        synonymsAnalysisTest44.ensureCheckIndexPassed();
        synonymsAnalysisTest44.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest44.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest49.assertDocsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest49.analysisService;
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest49.assertPositionsSkippingEquals("tests.badapples", indexReader61, (int) (short) 10, postingsEnum63, postingsEnum64);
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest44.failureAndSuccessEvents = ruleChain66;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain66);
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain66;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain66;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues74 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) (byte) 100, numericDocValues74, numericDocValues75);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray20 = new java.util.concurrent.ExecutorService[][] { executorServiceArray14, executorServiceArray15, executorServiceArray16, executorServiceArray17, executorServiceArray18, executorServiceArray19 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        long[] longArray5 = new long[] { 100L, (short) -1, '#', (short) 10, 100 };
        long[] longArray10 = new long[] { (byte) 0, 1L, (byte) 100, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (-1.0d));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        int[] intArray2 = new int[] { 2, (byte) 10 };
        int[] intArray5 = new int[] { 10, 3 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) (short) 10, postingsEnum16, postingsEnum17);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService30);
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest21.logger;
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest21, obj33);
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest21.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        long[] longArray3 = new long[] { 0L, 4 };
        long[] longArray7 = new long[] { '4', (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.badapples");
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest1.analysisService = analysisService21;
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray32);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray53);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray56);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray61);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals("random", shortArray56, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) analysisService21, (java.lang.Object) shortArray24);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 0, 1L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100, (double) 5);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService4);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader7, (-1), postingsEnum9, postingsEnum10, true);
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader16, (int) (short) -1, postingsEnum18, postingsEnum19, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        synonymsAnalysisTest22.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest22.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30, true);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService7);
        java.lang.Class<?> wildcardClass9 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest10.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass9, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.analysisService;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (short) 10, postingsEnum23, postingsEnum24);
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain26;
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals("random", shortArray9, shortArray23);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray38);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray38);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray68);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray77, shortArray78);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray23, shortArray73);
        short[] shortArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray23, shortArray88);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) ' ', (float) (byte) 10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { 'a', 100, 4, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) (byte) -1);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100.0f, (double) 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray5, charArray8);
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray30, charArray37);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray30, charArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray20, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray20);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        long[] longArray3 = new long[] { (short) 1, 0 };
        long[] longArray7 = new long[] { '#', (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray9);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray14, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("", charArray14, charArray21);
        org.junit.Assert.assertArrayEquals(charArray9, charArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charArray14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray5 = new long[] { (byte) 10, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        long[] longArray3 = new long[] { 10, (short) 100 };
        long[] longArray9 = new long[] { 100, 'a', 10L, 4, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        synonymsAnalysisTest10.ensureCleanedUp();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest10.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        long[] longArray5 = new long[] { (short) 0, 10, 100L, (byte) 100, 0L };
        long[] longArray9 = new long[] { (byte) 1, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        long[] longArray1 = new long[] { (byte) -1 };
        long[] longArray6 = new long[] { (byte) 1, 10, 10L, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        java.util.concurrent.ExecutorService[][] executorServiceArray0 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray0);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray8);
        java.lang.Class<?> wildcardClass10 = charSequenceArray8.getClass();
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        java.lang.Class<?> wildcardClass20 = shortArray16.getClass();
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        java.lang.Class<?> wildcardClass30 = shortArray26.getClass();
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray37, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray49, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        java.lang.Class<?> wildcardClass56 = executorServiceArray49.getClass();
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        java.lang.Class<?> wildcardClass66 = shortArray62.getClass();
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray73);
        java.lang.Class<?> wildcardClass75 = charSequenceArray73.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray76 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass20, wildcardClass30, wildcardClass56, wildcardClass66, wildcardClass75 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet77 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) genericDeclarationArray76);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 1.0f, 10.0f, (float) (-1L));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, (double) (byte) -1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain5);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray7);
        short[] shortArray14 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray18 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray22 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray23 = new short[][] { shortArray14, shortArray18, shortArray22 };
        java.util.List<short[]> shortArrayList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray56, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray68, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArrayList24, (java.lang.Object) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) executorServiceArray56);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 3, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray4, strArray8, strArray12, strArray16, strArray20 };
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[][] strArray42 = new java.lang.String[][] { strArray25, strArray29, strArray33, strArray37, strArray41 };
        java.lang.String[][][] strArray43 = new java.lang.String[][][] { strArray21, strArray42 };
        java.util.Set<java.lang.String[][]> strArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str46 = synonymsAnalysisTest45.getTestName();
        synonymsAnalysisTest45.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest45.analysisService;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        synonymsAnalysisTest45.assertTermsEquals("", indexReader50, terms51, terms52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) strArraySet44, (java.lang.Object) indexReader50);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        int[] intArray5 = new int[] { (-1), 4, 'a', (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, 3, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray9);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", 1.0d, (double) (short) 100, (double) 100);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest15.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) eSLogger14, (java.lang.Object) ruleChain28);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray3);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        long[] longArray3 = new long[] { (-1L), (byte) 1 };
        long[] longArray8 = new long[] { 1, 3, 10, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest6.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest6.setanalysisService(analysisService10);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("<unknown>", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest6.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest6.analysisService = analysisService22;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService22);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, obj13);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (short) 10, 1.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray41);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray62);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray41, shortArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray62);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray5 = new int[] { 0, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest1.analysisService = analysisService4;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) analysisService4);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        synonymsAnalysisTest12.ensureCheckIndexPassed();
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("tests.badapples", indexReader29, (int) (short) 10, postingsEnum31, postingsEnum32);
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain34;
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest12.analysisService;
        java.lang.Class<?> wildcardClass38 = synonymsAnalysisTest12.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest39.setUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest39.assertDocsSkippingEquals("hi!", indexReader42, 0, postingsEnum44, postingsEnum45, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest39.analysisService;
        synonymsAnalysisTest39.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest39.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest39.analysisService = analysisService51;
        synonymsAnalysisTest39.setIndexWriterMaxDocs((int) (byte) -1);
        java.lang.Class<?> wildcardClass55 = synonymsAnalysisTest39.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray56 = new java.lang.reflect.GenericDeclaration[] { wildcardClass11, wildcardClass38, wildcardClass55 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet57 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray65, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray77, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) genericDeclarationArray56, (java.lang.Object[]) executorServiceArray65);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        int[] intArray4 = new int[] { 5, 100, (byte) 1 };
        int[] intArray9 = new int[] { 'a', 5, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 5, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) 10);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray17, (float) (byte) 10);
        java.lang.Object obj25 = null;
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 0);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray31, (float) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray41, (float) 10);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray46, (float) (short) 10);
        org.junit.Assert.assertNotEquals("tests.nightly", obj25, (java.lang.Object) floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray46, (float) 2);
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) (short) 0);
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray62, (float) 10);
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) (short) 0);
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray72, (float) 10);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray77, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray77, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray77, (float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray77, (float) (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1L), (long) (short) 1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 2, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1.0f, (double) '4', 10.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.analysisService = analysisService4;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) (short) 0, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService8);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest14.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) (-1), (float) (short) 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray25);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", 100L, 100L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", 10.0d, (double) 10L, (double) 1.0f);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 1, (-1.0d));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        java.lang.String str14 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) 10);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray17, (float) (byte) 10);
        java.lang.Object obj25 = null;
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 0);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray31, (float) 10);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray41, (float) 10);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray46, (float) (short) 10);
        org.junit.Assert.assertNotEquals("tests.nightly", obj25, (java.lang.Object) floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray46, (float) 2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest57.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger59 = synonymsAnalysisTest57.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest60.setUp();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest60.assertDocsSkippingEquals("hi!", indexReader63, 0, postingsEnum65, postingsEnum66, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = synonymsAnalysisTest60.analysisService;
        org.junit.rules.RuleChain ruleChain70 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest57.failureAndSuccessEvents = ruleChain70;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) floatArray17, (java.lang.Object) synonymsAnalysisTest57);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest7.assertFieldsEquals("random", indexReader18, fields19, fields20, true);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest10.assertFieldsEquals("random", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest10.assertTermsEquals("tests.weekly", indexReader27, terms28, terms29, false);
        synonymsAnalysisTest10.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest34.analysisService;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("tests.badapples", indexReader46, (int) (short) 10, postingsEnum48, postingsEnum49);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain51;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain51);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest55.getanalysisService();
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        synonymsAnalysisTest55.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest55);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str61 = synonymsAnalysisTest60.getTestName();
        synonymsAnalysisTest60.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest60.analysisService;
        synonymsAnalysisTest60.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest60.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        synonymsAnalysisTest60.assertDocsEnumEquals("tests.awaitsfix", postingsEnum67, postingsEnum68, true);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest60);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum73, postingsEnum74);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 10, (double) 4);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        int[] intArray4 = new int[] { '#', 2, '4', '4' };
        int[] intArray11 = new int[] { 'a', (short) -1, 1, ' ', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray11);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        int[] intArray6 = new int[] { (short) -1, ' ', (short) 10, 0, 4, (byte) -1 };
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest4);
        java.lang.String str18 = synonymsAnalysisTest4.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest4.setanalysisService(analysisService19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService2, (java.lang.Object) analysisService19);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray14);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray26);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray43, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray48, byteArray49);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray49, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray26, byteArray35);
        byte[] byteArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray26, byteArray60);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        long[] longArray6 = new long[] { 1, (byte) 1, (short) -1, ' ', '4' };
        long[] longArray12 = new long[] { 'a', 10L, (-1), 100, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray12);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader15, fields16, fields17, true);
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18, true);
        synonymsAnalysisTest15.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.weekly", indexReader24, (int) (short) 100, postingsEnum26, postingsEnum27);
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest15.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("hi!", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest32.assertFieldsEquals("random", indexReader43, fields44, fields45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        synonymsAnalysisTest32.assertTermsEquals("tests.weekly", indexReader49, terms50, terms51, false);
        synonymsAnalysisTest32.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest56.analysisService;
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest56.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        synonymsAnalysisTest56.assertPositionsSkippingEquals("tests.badapples", indexReader68, (int) (short) 10, postingsEnum70, postingsEnum71);
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest56.failureAndSuccessEvents;
        synonymsAnalysisTest32.failureAndSuccessEvents = ruleChain73;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain73;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain73;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger14, (java.lang.Object) ruleChain73);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 100L, (double) 1.0f);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.failfast", (int) '#', numericDocValues45, numericDocValues46);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        long[] longArray3 = new long[] { (short) 0, (short) 1 };
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray3, longArray5);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        float[] floatArray6 = new float[] { 0, (short) 0, (short) 10, 1.0f, (short) 10 };
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 0);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray13, (float) 10);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray18, (float) 5);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray18, floatArray24, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray6, floatArray24, (float) 1L);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService16);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.slow", indexReader20, 100, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.getanalysisService();
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        synonymsAnalysisTest25.tearDown();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum22, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        synonymsAnalysisTest6.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest6.analysisService;
        synonymsAnalysisTest6.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 4, 100.0f, (float) 1L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest15.getlogger();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.maxfailures", indexReader18, fields19, fields20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest15.setanalysisService(analysisService23);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) shortArray11, (java.lang.Object) analysisService23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) boolean28);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray19, obj30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray2, strArray4, strArray6 };
        java.util.Set<java.lang.String[]> strArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, objArray9);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 100);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        org.junit.Assert.assertArrayEquals("hi!", shortArray4, shortArray11);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray36);
        org.junit.Assert.assertArrayEquals("hi!", shortArray24, shortArray31);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray31);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray47);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray62);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray71);
        org.junit.Assert.assertArrayEquals("random", shortArray57, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray57);
        short[] shortArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray78);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 1, (double) 3, (double) ' ');
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        int[] intArray2 = new int[] { 4 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray2, intArray4);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest1.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest19.getanalysisService();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.tearDown();
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest19, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest19.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest19);
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest19.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger27);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        int[] intArray5 = new int[] { 10, (-1), ' ', 10, 0 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 100L, (float) 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) 10, (double) 1.0f);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        int[] intArray1 = new int[] {};
        int[] intArray3 = new int[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray1, intArray3);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 0L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.nightly", (int) (short) -1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 10L);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader25, 3, postingsEnum27, postingsEnum28);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger30);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, 100L);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) -1);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest16.assertPositionsSkippingEquals("tests.badapples", indexReader28, (int) (short) 10, postingsEnum30, postingsEnum31);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.maxfailures", 5, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) eSLogger6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) 1, 100.0f, (float) (byte) 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        long[] longArray6 = new long[] { (byte) 10, (byte) 1, (short) -1, 'a', (-1L), (-1) };
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray22, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray22);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray32);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray51);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray56, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest10.analysisService;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.weekly", indexReader16, fields17, fields18, false);
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        java.lang.String str22 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest10.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        synonymsAnalysisTest26.ensureCheckIndexPassed();
        synonymsAnalysisTest26.ensureCleanedUp();
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain31;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain31;
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray35, charArray39);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray43, charArray47);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals("", charArray43, charArray50);
        org.junit.Assert.assertArrayEquals(charArray39, charArray43);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray43, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray64, charArray68);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals("", charArray64, charArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray61, charArray64);
        org.junit.Assert.assertArrayEquals(charArray56, charArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray56);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest1.analysisService = analysisService13;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest15.logger;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest1.analysisService = analysisService28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader31, 10, postingsEnum33, postingsEnum34, false);
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest38.getanalysisService();
        synonymsAnalysisTest38.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest38.getlogger();
        synonymsAnalysisTest38.ensureCheckIndexPassed();
        synonymsAnalysisTest38.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest44.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest47.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest47.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest50.setUp();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest50.assertDocsSkippingEquals("hi!", indexReader53, 0, postingsEnum55, postingsEnum56, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest50.failureAndSuccessEvents;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain60;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest62.setUp();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        synonymsAnalysisTest62.assertDocsSkippingEquals("hi!", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = synonymsAnalysisTest62.analysisService;
        org.junit.rules.RuleChain ruleChain72 = synonymsAnalysisTest62.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        synonymsAnalysisTest62.assertPositionsSkippingEquals("tests.badapples", indexReader74, (int) (short) 10, postingsEnum76, postingsEnum77);
        org.junit.rules.RuleChain ruleChain79 = synonymsAnalysisTest62.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest47, (java.lang.Object) synonymsAnalysisTest62);
        synonymsAnalysisTest47.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest44, (java.lang.Object) synonymsAnalysisTest47);
        org.junit.rules.RuleChain ruleChain83 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest38.failureAndSuccessEvents = ruleChain83;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain83;
        org.apache.lucene.index.IndexReader indexReader87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        org.apache.lucene.index.Fields fields89 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader87, fields88, fields89, false);
        org.elasticsearch.common.logging.ESLogger eSLogger92 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.NumericDocValues numericDocValues95 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.awaitsfix", 100, numericDocValues95, numericDocValues96);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest15.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain28;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest30.assertDocsSkippingEquals("hi!", indexReader33, 0, postingsEnum35, postingsEnum36, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest30.analysisService;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("tests.badapples", indexReader42, (int) (short) 10, postingsEnum44, postingsEnum45);
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) synonymsAnalysisTest30);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) synonymsAnalysisTest15);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest15.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) '#', (java.lang.Object) ruleChain51);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray12, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray7, obj18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("tests.badapples", postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest22.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest22.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("hi!", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest31.analysisService;
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        synonymsAnalysisTest43.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest43, (java.lang.Object) (short) 1);
        synonymsAnalysisTest43.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest49.assertDocsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest49.analysisService;
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest61.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger63 = synonymsAnalysisTest61.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest64.setUp();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("hi!", indexReader67, 0, postingsEnum69, postingsEnum70, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest64.analysisService;
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest64.failureAndSuccessEvents;
        synonymsAnalysisTest61.failureAndSuccessEvents = ruleChain74;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest76 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest76.setUp();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        synonymsAnalysisTest76.assertDocsSkippingEquals("hi!", indexReader79, 0, postingsEnum81, postingsEnum82, true);
        org.junit.rules.TestRule testRule85 = synonymsAnalysisTest76.ruleChain;
        org.junit.rules.TestRule[] testRuleArray86 = new org.junit.rules.TestRule[] { testRule30, ruleChain41, ruleChain59, ruleChain74, testRule85 };
        java.util.List<org.junit.rules.TestRule> testRuleList87 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) executorServiceArray7, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str35 = synonymsAnalysisTest34.getTestName();
        synonymsAnalysisTest34.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest34.analysisService;
        synonymsAnalysisTest34.ensureCleanedUp();
        synonymsAnalysisTest34.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest40.getanalysisService();
        synonymsAnalysisTest40.overrideTestDefaultQueryCache();
        synonymsAnalysisTest40.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest40.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest34, (java.lang.Object) synonymsAnalysisTest40);
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest40.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        short[] shortArray7 = new short[] { (byte) 0, (byte) 100, (short) 0, (short) 10, (short) 10, (short) 100 };
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        org.junit.Assert.assertArrayEquals("random", shortArray15, shortArray29);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray44);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray29, shortArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray44);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("hi!", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest14.setanalysisService(analysisService23);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest14.logger;
        java.lang.Object obj26 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest14, obj26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest14.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ruleChain12, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest13.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRule12, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) 100, 0.0f);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader7, (int) (short) -1, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) ' ', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        int[] intArray7 = new int[] { 4, 1, (-1), (byte) -1, 4, (short) -1 };
        int[] intArray14 = new int[] { (short) 100, 1, (byte) 100, (short) 0, (byte) 10, 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray7, intArray14);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        java.lang.Object obj8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, obj8);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '4', (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 10);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("hi!", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest14.analysisService;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest14.logger;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) executorServiceArray8, (java.lang.Object) synonymsAnalysisTest14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) executorServiceArray8, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest6.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest6.analysisService = analysisService8;
        synonymsAnalysisTest6.assertPathHasBeenCleared("tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) (short) 10, postingsEnum24, postingsEnum25);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, false);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest36.analysisService;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.weekly", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest36.analysisService;
        synonymsAnalysisTest36.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest49.assertDocsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest49.analysisService;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        synonymsAnalysisTest49.assertFieldsEquals("random", indexReader60, fields61, fields62, true);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        synonymsAnalysisTest49.assertTermsEquals("tests.weekly", indexReader66, terms67, terms68, false);
        synonymsAnalysisTest49.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest73 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest73.setUp();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        synonymsAnalysisTest73.assertDocsSkippingEquals("hi!", indexReader76, 0, postingsEnum78, postingsEnum79, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService82 = synonymsAnalysisTest73.analysisService;
        org.junit.rules.RuleChain ruleChain83 = synonymsAnalysisTest73.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        synonymsAnalysisTest73.assertPositionsSkippingEquals("tests.badapples", indexReader85, (int) (short) 10, postingsEnum87, postingsEnum88);
        org.junit.rules.RuleChain ruleChain90 = synonymsAnalysisTest73.failureAndSuccessEvents;
        synonymsAnalysisTest49.failureAndSuccessEvents = ruleChain90;
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain90;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain90;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) ' ', 1.0f);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) (short) 10, (float) 2);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.logger;
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest5.setanalysisService(analysisService14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest5.logger;
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest5, obj17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) testRule3, (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0f, (float) 0, 0.0f);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) (short) 10, (double) 100);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        java.lang.Object obj1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals("random", shortArray9, shortArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray30, (java.lang.Object) (-1.0f));
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) shortArray23, (java.lang.Object) boolean35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) shortArray23);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", 3, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        org.junit.Assert.assertArrayEquals("random", shortArray20, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest41.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest41.setanalysisService(analysisService43);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) shortArray10, (java.lang.Object) analysisService43);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("europarl.lines.txt.gz", "europarl.lines.txt.gz", "tests.badapples");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 100.0d, (double) (short) 1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest19.getanalysisService();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.tearDown();
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest19, obj23);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest19.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.weekly", (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) ' ', (float) (byte) 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100L, (double) 100.0f);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        int[] intArray3 = new int[] { '4', (short) -1, (byte) 1 };
        int[] intArray7 = new int[] { 5, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (-1L), (double) 0.0f);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (-1), (long) '4');
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray21);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray57, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray69, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray57);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest78 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest78.setUp();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        synonymsAnalysisTest78.assertDocsSkippingEquals("hi!", indexReader81, 0, postingsEnum83, postingsEnum84, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService87 = synonymsAnalysisTest78.analysisService;
        synonymsAnalysisTest78.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = null;
        synonymsAnalysisTest78.setanalysisService(analysisService89);
        org.elasticsearch.common.logging.ESLogger eSLogger91 = synonymsAnalysisTest78.getlogger();
        synonymsAnalysisTest78.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray57, (java.lang.Object) synonymsAnalysisTest78);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet5 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray13, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray13);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest45.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = null;
        synonymsAnalysisTest45.setanalysisService(analysisService52);
        java.lang.String str54 = synonymsAnalysisTest45.getTestName();
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest45.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest45.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) shortArray25, (java.lang.Object) eSLogger57);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) 'a', (float) ' ');
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService9);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.weekly", indexReader13, 5, postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest19.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        java.lang.String str31 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest19.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest35.setUp();
        synonymsAnalysisTest35.ensureCheckIndexPassed();
        synonymsAnalysisTest35.ensureCleanedUp();
        synonymsAnalysisTest35.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain40;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain40;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest44.getanalysisService();
        synonymsAnalysisTest44.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest44.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain40, (java.lang.Object) synonymsAnalysisTest44);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0f, (float) ' ', (float) (byte) 1);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService11);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        java.lang.Object obj14 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest2, obj14);
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest19, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest19.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService23);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest19.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        long[] longArray3 = new long[] { 0L, (short) 10, 10 };
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray5);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0f, 0.0f, (float) 0L);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, 100.0f, (float) (short) 1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.nightly", indexReader9, terms10, terms11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService16);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest19.assertFieldsEquals("random", indexReader30, fields31, fields32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest19.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        synonymsAnalysisTest19.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest19.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        synonymsAnalysisTest44.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService43, (java.lang.Object) synonymsAnalysisTest44);
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest44.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest49.assertDocsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest49.analysisService;
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger60 = synonymsAnalysisTest49.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger48, (java.lang.Object) synonymsAnalysisTest49);
        org.elasticsearch.index.analysis.AnalysisService analysisService62 = synonymsAnalysisTest49.analysisService;
        java.lang.String str63 = synonymsAnalysisTest49.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) str63);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 100, (long) '4');
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("hi!", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest27.analysisService;
        synonymsAnalysisTest27.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("", indexReader41, (int) '4', postingsEnum43, postingsEnum44, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) indexReader41);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        java.lang.Class<?> wildcardClass13 = ruleChain11.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) wildcardClass13);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 100.0d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 3, (double) (short) -1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray22, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray22);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray34, byteArray38);
        org.junit.Assert.assertArrayEquals("", byteArray13, byteArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService9, (java.lang.Object) byteArray13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) (short) 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10L, (double) 100.0f);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (short) -1, 0.0d, (double) 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.analysisService = analysisService8;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("tests.badapples", indexReader23, (int) (short) 10, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("hi!", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest28.analysisService;
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest28.failureAndSuccessEvents;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain38;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain38;
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str43 = synonymsAnalysisTest42.getTestName();
        java.lang.String str44 = synonymsAnalysisTest42.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest42.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest42.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger46);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 0, (double) 5);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 1);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest0.analysisService = analysisService3;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest5.getanalysisService();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService24);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest0.analysisService = analysisService26;
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest29.assertDocsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32, true);
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest38.setUp();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest38.assertDocsSkippingEquals("hi!", indexReader41, 0, postingsEnum43, postingsEnum44, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest38.analysisService;
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest38.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest38.assertPositionsSkippingEquals("tests.badapples", indexReader50, (int) (short) 10, postingsEnum52, postingsEnum53);
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain55;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.nightly", indexReader58, fields59, fields60, false);
        synonymsAnalysisTest29.ensureCheckIndexPassed();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest29);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray9 = new long[] { (short) 100, 1L, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray9);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        int[] intArray5 = new int[] { 2, (short) -1, (byte) 10, (byte) -1, 0 };
        int[] intArray12 = new int[] { (byte) 1, '4', 1, (short) 100, 5, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray11);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray17);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals("random", shortArray37, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray37);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray59);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray27, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray1, shortArray76);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 4, (long) ' ');
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader42, (int) (short) 10, postingsEnum44, postingsEnum45);
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("hi!", 5, numericDocValues49, numericDocValues50);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 5, (double) (short) 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        long[] longArray2 = new long[] { ' ', 0L };
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), (double) 10L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 10, (long) (byte) 10);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.weekly", indexReader27, (int) (short) -1, postingsEnum29, postingsEnum30);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest34.getlogger();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray12);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray20);
        java.util.Collection[] collectionArray23 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray24 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray23;
        charSequenceCollectionArray24[0] = charSequenceList13;
        charSequenceCollectionArray24[1] = charSequenceList21;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet29 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charSequenceCollectionSet29);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 10, (double) 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (short) 0, (float) (short) -1);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray2, charArray5);
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        org.junit.Assert.assertArrayEquals(charArray2, charArray19);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray19, (java.lang.Object) locale28);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 10.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '4', (long) 100);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray20);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[][] executorServiceArray42 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray42);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray16);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("hi!", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = null;
        synonymsAnalysisTest40.setanalysisService(analysisService49);
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest40.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray38, (java.lang.Object) synonymsAnalysisTest40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain11);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest25.assertPositionsSkippingEquals("tests.badapples", indexReader37, (int) (short) 10, postingsEnum39, postingsEnum40);
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest44.assertDocsSkippingEquals("hi!", indexReader47, 0, postingsEnum49, postingsEnum50, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = null;
        synonymsAnalysisTest44.setanalysisService(analysisService53);
        org.elasticsearch.common.logging.ESLogger eSLogger55 = synonymsAnalysisTest44.logger;
        java.lang.Object obj56 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest44, obj56);
        org.junit.rules.TestRule testRule58 = synonymsAnalysisTest44.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) synonymsAnalysisTest44);
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest25.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray7, longArray11);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) longArray7, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray21);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray36);
        short[] shortArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray56);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray17, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray23, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray23);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray33);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray43, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray47, byteArray48);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray53, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray53);
        org.junit.Assert.assertArrayEquals("", byteArray33, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray53);
        byte[] byteArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray53, byteArray64);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 'a', (double) (short) 1);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 0, (double) (-1L), (double) 0L);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        org.junit.Assert.assertArrayEquals("hi!", shortArray4, shortArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest21.assertDocsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24, true);
        synonymsAnalysisTest21.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest21.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray4, (java.lang.Object) testRule29);
        short[][][][] shortArray31 = new short[][][][] {};
        java.util.Set<short[][][]> shortArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) shortArray4, (java.lang.Object) shortArraySet32);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray41);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray62);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray41, shortArray62);
        short[] shortArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray62, shortArray78);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray2, obj4);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray18, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray31, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray31);
        short[] shortArray55 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray60 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray65 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray70 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray75 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray76 = new short[][] { shortArray55, shortArray60, shortArray65, shortArray70, shortArray75 };
        short[][][] shortArray77 = new short[][][] { shortArray76 };
        java.util.Set<short[][]> shortArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray77);
        java.util.Set<short[][]> shortArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray77);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) shortArray77);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), (long) 100);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray12, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray12);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray22);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray36, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray41, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray42, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray42);
        org.junit.Assert.assertArrayEquals("", byteArray22, byteArray42);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest52.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest52.assertDocsSkippingEquals("hi!", indexReader55, 0, postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest52.analysisService;
        synonymsAnalysisTest52.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest52.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        synonymsAnalysisTest52.assertDocsSkippingEquals("", indexReader66, (int) '4', postingsEnum68, postingsEnum69, false);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        synonymsAnalysisTest52.assertDocsEnumEquals("random", postingsEnum73, postingsEnum74, false);
        synonymsAnalysisTest52.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) synonymsAnalysisTest52);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest16.assertFieldsEquals("random", indexReader27, fields28, fields29, true);
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest16.logger;
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest16.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule33;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) fields12, (java.lang.Object) testRule33);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray28, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray36, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray36);
        java.lang.Object[] objArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, objArray46);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) (short) 1);
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain39;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest44.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest44.assertDocsSkippingEquals("hi!", indexReader47, 0, postingsEnum49, postingsEnum50, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest44.analysisService;
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest44.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain54;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("hi!", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest56.ruleChain;
        org.junit.rules.TestRule[] testRuleArray66 = new org.junit.rules.TestRule[] { testRule10, ruleChain21, ruleChain39, ruleChain54, testRule65 };
        java.util.List<org.junit.rules.TestRule> testRuleList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest12.setanalysisService(analysisService21);
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest12.logger;
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest12, obj24);
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest12.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest27.logger;
        synonymsAnalysisTest27.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest2, synonymsAnalysisTest12, synonymsAnalysisTest27 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet32 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray1, (java.lang.Object[]) synonymsAnalysisTestArray31);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) ' ', 0.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (short) 10, (float) 5);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray28);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) 10);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray51, (float) 5);
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) (short) 0);
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray62, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray46, floatArray57, 0.0f);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray70, (float) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest76 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger77 = synonymsAnalysisTest76.getlogger();
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray79, (float) (short) 0);
        float[] floatArray82 = new float[] {};
        float[] floatArray83 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray82, floatArray83, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray83, (float) 10);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) eSLogger77, (java.lang.Object) floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray78, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) "tests.nightly", (java.lang.Object) ' ');
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray2, charArray5);
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray17);
        char[] charArray19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray17, charArray19);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray8 = new long[] { 4, 3, 'a', 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) (-1.0f));
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray30, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray55, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray43);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray43);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) boolean66);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (short) 1, 0.0f);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService28);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest19.logger;
        java.lang.Object obj31 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest19, obj31);
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest19.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest35.setUp();
        synonymsAnalysisTest35.ensureCheckIndexPassed();
        synonymsAnalysisTest35.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest35.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("hi!", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest40.assertPositionsSkippingEquals("tests.badapples", indexReader52, (int) (short) 10, postingsEnum54, postingsEnum55);
        org.junit.rules.RuleChain ruleChain57 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain57;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain57);
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain57;
        org.apache.lucene.index.NumericDocValues numericDocValues63 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest19.assertDocValuesEquals("tests.nightly", (int) '#', numericDocValues63, numericDocValues64);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader19, (int) (byte) 100, postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("random", indexReader26, 2, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.weekly", indexReader32, (int) '4', postingsEnum34, postingsEnum35, false);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest39.assertFieldsEquals("tests.failfast", indexReader41, fields42, fields43, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest39.setanalysisService(analysisService46);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest39);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', 1L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest3.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.badapples", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest38.getanalysisService();
        synonymsAnalysisTest38.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest38.getlogger();
        synonymsAnalysisTest38.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) synonymsAnalysisTest38);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray55);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals("random", shortArray50, shortArray64);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray75, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray64, (java.lang.Object) executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest38, (java.lang.Object) shortArray64);
        short[] shortArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray64, shortArray83);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 3, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) 1L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray23);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray55);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals("random", shortArray50, shortArray64);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray23, (java.lang.Object) shortArray64);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray71, shortArray72);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray75);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray75);
        short[] shortArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray75, shortArray85);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 10, 0.0d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray47, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray59, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray21);
        java.lang.Object[] objArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray21, objArray68);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 1L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 1.0d, (double) 0.0f);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, 0.0f, (float) (short) -1);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 10, (float) 3, (float) 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        java.lang.Object obj6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) testRule5, obj6);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 10);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 1, (long) (short) 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray17, byteArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray21, byteArray22);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray27);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray27, byteArray42);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0f, (float) 4, (-1.0f));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 2, (double) (short) 10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        int[] intArray4 = new int[] { (short) 1, (short) 100, 5, (short) 1 };
        int[] intArray9 = new int[] { (short) 1, (short) -1, 4, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1.0f, (-1.0d));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureCleanedUp();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService21);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (byte) 0, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        java.lang.Class<?> wildcardClass5 = eSLogger4.getClass();
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
        org.junit.Assert.assertArrayEquals("hi!", shortArray9, shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) eSLogger4, (java.lang.Object) shortArray16);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.ensureCleanedUp();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain19;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest22.getlogger();
        synonymsAnalysisTest22.ensureCheckIndexPassed();
        synonymsAnalysisTest22.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest28.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest31.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest34.analysisService;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain44;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("hi!", indexReader49, 0, postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest46.analysisService;
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("tests.badapples", indexReader58, (int) (short) 10, postingsEnum60, postingsEnum61);
        org.junit.rules.RuleChain ruleChain63 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest31, (java.lang.Object) synonymsAnalysisTest46);
        synonymsAnalysisTest31.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest28, (java.lang.Object) synonymsAnalysisTest31);
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest31.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain67;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain67;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("hi!", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest28.analysisService;
        synonymsAnalysisTest28.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest28.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest28.logger;
        synonymsAnalysisTest28.setUp();
        synonymsAnalysisTest28.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest28.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain45;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("<unknown>", indexReader49, 5, postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest25.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) '4', (double) (short) 10);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest31.getanalysisService();
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest31.getlogger();
        synonymsAnalysisTest31.ensureCheckIndexPassed();
        synonymsAnalysisTest31.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest40.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest43.assertDocsSkippingEquals("hi!", indexReader46, 0, postingsEnum48, postingsEnum49, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest43.analysisService;
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest43.failureAndSuccessEvents;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain53;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest55.setUp();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest55.assertDocsSkippingEquals("hi!", indexReader58, 0, postingsEnum60, postingsEnum61, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest55.analysisService;
        org.junit.rules.RuleChain ruleChain65 = synonymsAnalysisTest55.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        synonymsAnalysisTest55.assertPositionsSkippingEquals("tests.badapples", indexReader67, (int) (short) 10, postingsEnum69, postingsEnum70);
        org.junit.rules.RuleChain ruleChain72 = synonymsAnalysisTest55.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) synonymsAnalysisTest55);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest37, (java.lang.Object) synonymsAnalysisTest40);
        org.junit.rules.RuleChain ruleChain76 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain76;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain76;
        org.apache.lucene.index.NumericDocValues numericDocValues81 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", (int) 'a', numericDocValues81, numericDocValues82);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, (double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 10);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray16, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray1, floatArray16, (float) (byte) 10);
        float[] floatArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray23, (float) 0L);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray23);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray55);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals("random", shortArray50, shortArray64);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) executorServiceArray23, (java.lang.Object) shortArray64);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", obj1, (java.lang.Object) executorServiceArray23);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) 100);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest3.assertFieldsEquals("random", indexReader14, fields15, fields16, true);
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        synonymsAnalysisTest3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("", indexReader22, (int) (byte) 100, postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest3.assertPositionsSkippingEquals("random", indexReader29, 2, postingsEnum31, postingsEnum32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) postingsEnum31);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, obj11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (short) 10, (double) (-1), (double) 100L);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray15);
        java.util.Collection[] collectionArray18 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray19 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray18;
        charSequenceCollectionArray19[0] = charSequenceList8;
        charSequenceCollectionArray19[1] = charSequenceList16;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet24 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest25.logger;
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService30);
        synonymsAnalysisTest25.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) charSequenceCollectionSet24, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.slow", "hi!", "");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest3.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService22);
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest13.logger;
        java.lang.Object obj25 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest13, obj25);
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest13.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest28.logger;
        synonymsAnalysisTest28.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest3, synonymsAnalysisTest13, synonymsAnalysisTest28 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet33 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray32);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray32);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet35 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray32);
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray32);
        java.util.List<org.junit.Assert> assertList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, (org.junit.Assert[]) synonymsAnalysisTestArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) assertList37);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 10, (long) (-1));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) -1, (double) (-1));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("", charArray16, charArray23);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray13, charArray16);
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        org.junit.Assert.assertArrayEquals(charArray13, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray30);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) 3, (float) (short) 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 'a');
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[][] shortArray7 = new short[][] { shortArray2, shortArray3, shortArray4, shortArray5, shortArray6 };
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[][] shortArray13 = new short[][] { shortArray8, shortArray9, shortArray10, shortArray11, shortArray12 };
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[][] shortArray19 = new short[][] { shortArray14, shortArray15, shortArray16, shortArray17, shortArray18 };
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        short[][] shortArray25 = new short[][] { shortArray20, shortArray21, shortArray22, shortArray23, shortArray24 };
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        short[][] shortArray31 = new short[][] { shortArray26, shortArray27, shortArray28, shortArray29, shortArray30 };
        short[][][] shortArray32 = new short[][][] { shortArray7, shortArray13, shortArray19, shortArray25, shortArray31 };
        java.util.List<short[][]> shortArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, shortArray32);
        short[][][][] shortArray34 = new short[][][][] {};
        java.util.Set<short[][][]> shortArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) shortArray32, (java.lang.Object[]) shortArray34);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj1, (java.lang.Object) synonymsAnalysisTest2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertPathHasBeenCleared("");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray21);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray21);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray50, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray58, (java.lang.Object) (-1.0f));
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray72, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray80, (java.lang.Object) (-1.0f));
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray80, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray80);
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        int[] intArray4 = new int[] { (byte) 1, 5, 3, 1 };
        int[] intArray10 = new int[] { (short) 0, 2, (short) 100, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader26, (int) (short) -1, postingsEnum28, postingsEnum29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) -1);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (byte) 10, (short) 10, 0 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray6, intArray9);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 2, (double) (byte) 10);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (short) 0);
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest10.logger;
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (byte) 1);
        synonymsAnalysisTest10.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray5, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 4);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (-1.0f));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 2, (float) 'a', 0.0f);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray7, objArray14);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0L, (long) (short) 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 0L);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, obj13);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest3.analysisService;
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest3.logger;
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader24, 5, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        int[] intArray2 = new int[] { 1, (short) 1 };
        int[] intArray7 = new int[] { 4, 0, 'a', 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray23);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray10, byteArray28);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray48, byteArray49);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray54, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray10, byteArray40);
        byte[] byteArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray40, byteArray65);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest12.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.slow", indexReader23, 10, postingsEnum25, postingsEnum26, false);
        synonymsAnalysisTest12.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService41);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        org.junit.Assert.assertArrayEquals("hi!", shortArray5, shortArray12);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray37);
        org.junit.Assert.assertArrayEquals("hi!", shortArray25, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest43.getlogger();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        synonymsAnalysisTest43.assertFieldsEquals("tests.maxfailures", indexReader46, fields47, fields48, true);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        synonymsAnalysisTest43.assertTermsEquals("tests.nightly", indexReader52, terms53, terms54, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest43.getanalysisService();
        synonymsAnalysisTest43.setUp();
        java.lang.String str59 = synonymsAnalysisTest43.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) shortArray5, (java.lang.Object) str59);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) byteArray17);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 0.0f, 0.0d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) 0L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) 0L);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray11, (double) (-1));
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) 0L);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray17, doubleArray22, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray17, (double) 4);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 0L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray30, doubleArray35, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray11, doubleArray30, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray11, (double) (-1L));
        double[] doubleArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray44, (double) (byte) 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 1);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain23);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("hi!", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest27.ruleChain;
        synonymsAnalysisTest27.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.ensureCleanedUp();
        synonymsAnalysisTest27.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest27.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService41);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) ' ', (-1.0d));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.weekly", obj1);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) 10);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray13, (float) 5);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) (short) 0);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray24, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray8, floatArray19, 0.0f);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 0);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) 10);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) 5);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 0);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray53, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray37, floatArray48, 0.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray61, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray8, floatArray61, (float) (-1));
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray69, (float) (short) 0);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray73, (float) 10);
        org.junit.Assert.assertArrayEquals("", floatArray8, floatArray73, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100L);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, '4', (-1) };
        int[] intArray10 = new int[] { (-1), 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.maxfailures", 10, numericDocValues44, numericDocValues45);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        int[] intArray4 = new int[] { (short) 1, 100, 1, (short) 1 };
        int[] intArray10 = new int[] { 'a', '4', (byte) -1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray19, obj30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray49, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray61, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray70, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray70);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest76 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str77 = synonymsAnalysisTest76.getTestName();
        synonymsAnalysisTest76.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = synonymsAnalysisTest76.analysisService;
        synonymsAnalysisTest76.ensureCleanedUp();
        synonymsAnalysisTest76.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest82 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService83 = synonymsAnalysisTest82.getanalysisService();
        synonymsAnalysisTest82.overrideTestDefaultQueryCache();
        synonymsAnalysisTest82.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest82.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest76, (java.lang.Object) synonymsAnalysisTest82);
        org.elasticsearch.common.logging.ESLogger eSLogger88 = synonymsAnalysisTest82.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray49, (java.lang.Object) synonymsAnalysisTest82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray49);
        java.lang.Class<?> wildcardClass91 = executorServiceArray49.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) wildcardClass91);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray14);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray29);
        org.junit.Assert.assertArrayEquals(longArray21, longArray29);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray38, longArray39);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        org.junit.Assert.assertArrayEquals(longArray39, longArray43);
        org.junit.Assert.assertArrayEquals(longArray35, longArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray29, longArray39);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray49, longArray50);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray53, longArray54);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray57, longArray58);
        org.junit.Assert.assertArrayEquals(longArray54, longArray58);
        org.junit.Assert.assertArrayEquals(longArray50, longArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray29, longArray54);
        org.junit.Assert.assertArrayEquals(longArray5, longArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray29);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.ensureCleanedUp();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain19;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService22);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest26);
        synonymsAnalysisTest26.ensureCleanedUp();
        java.lang.String str31 = synonymsAnalysisTest26.getTestName();
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest26.analysisService = analysisService33;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService33);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 4, (double) (byte) 10);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) '4');
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        org.junit.Assert.assertArrayEquals("hi!", shortArray4, shortArray11);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals("random", shortArray37, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray37);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray59);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray27, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray27);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 'a');
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        java.lang.Object obj1 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) 10);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) 10);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray22, (float) (short) 10);
        org.junit.Assert.assertNotEquals("tests.nightly", obj1, (java.lang.Object) floatArray22);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) ' ');
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.getanalysisService();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest6.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("enwiki.random.lines.txt", "tests.maxfailures", "enwiki.random.lines.txt");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService25);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        synonymsAnalysisTest18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest18.assertFieldsEquals("", indexReader30, fields31, fields32, false);
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest18.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray3, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray30);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray46);
        java.util.Collection[] collectionArray49 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray50 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray49;
        charSequenceCollectionArray50[0] = charSequenceList23;
        charSequenceCollectionArray50[1] = charSequenceList31;
        charSequenceCollectionArray50[2] = charSequenceList39;
        charSequenceCollectionArray50[3] = charSequenceList47;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) charSequenceCollectionArray50);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, 0, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest23.getlogger();
        java.lang.String str31 = synonymsAnalysisTest23.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str31);
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues35, numericDocValues36);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 'a');
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray21);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray33);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray38, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray32);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest1.getanalysisService();
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 0);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray13, (float) 10);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray8, floatArray23, (float) (byte) 10);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) analysisService6, (java.lang.Object) floatArray8);
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) (short) 0);
        float[] floatArray36 = new float[] {};
        float[] floatArray37 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray37, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) 10);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) 5);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray42, floatArray48, 100.0f);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) (short) 0);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray60, (float) 10);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray65, (float) 5);
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) (short) 0);
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray76, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray60, floatArray71, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray71, (float) (byte) 0);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray71, (float) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray8);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureCleanedUp();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, obj13);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.awaitsfix", 3, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("hi!", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest14.assertFieldsEquals("random", indexReader25, fields26, fields27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest14.assertTermsEquals("tests.weekly", indexReader31, terms32, terms33, false);
        synonymsAnalysisTest14.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("tests.weekly", indexReader40, (int) (short) -1, postingsEnum42, postingsEnum43);
        synonymsAnalysisTest14.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest14.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest48.getanalysisService();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        synonymsAnalysisTest48.setUp();
        synonymsAnalysisTest48.ensureCleanedUp();
        synonymsAnalysisTest48.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) synonymsAnalysisTest48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, (float) 100, (float) (short) 1);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 10);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService19);
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest10.logger;
        java.lang.Object obj22 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest10, obj22);
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest10.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        synonymsAnalysisTest25.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest0, synonymsAnalysisTest10, synonymsAnalysisTest25 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet30 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray29);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray29);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet32 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) luceneTestCaseSet32);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray13, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray13);
        java.lang.Object obj19 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray8, obj19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray44, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray51, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray63, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray76, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.weekly", obj2);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        synonymsAnalysisTest5.ensureCheckIndexPassed();
        synonymsAnalysisTest5.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest5.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.weekly", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest5.analysisService;
        synonymsAnalysisTest5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.weekly", indexReader19, fields20, fields21, true);
        java.lang.Class<?> wildcardClass24 = synonymsAnalysisTest5.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest25.ruleChain;
        java.lang.Class<?> wildcardClass35 = synonymsAnalysisTest25.getClass();
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray47, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        java.lang.Object obj53 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray42, obj53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.lang.Class<?> wildcardClass57 = executorServiceArray42.getClass();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) wildcardClass57);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        synonymsAnalysisTest59.assertFieldsEquals("tests.failfast", indexReader61, fields62, fields63, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest59.setanalysisService(analysisService66);
        java.lang.Class<?> wildcardClass68 = synonymsAnalysisTest59.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray69 = new java.lang.reflect.GenericDeclaration[] { wildcardClass24, wildcardClass35, wildcardClass57, wildcardClass68 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray70 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray69 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet71 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) genericDeclarationArraySet71);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule11);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 0);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 0L);
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) 0L);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray9, doubleArray14, (double) (-1));
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) 0L);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray20, doubleArray25, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray20, (double) 4);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) 0L);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray33, doubleArray38, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray14, doubleArray33, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray14, (double) (-1L));
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 0L);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray48, doubleArray53, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray14, doubleArray48, (double) 10L);
        double[] doubleArray61 = new double[] {};
        double[] doubleArray62 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray62, (double) 0L);
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray61, doubleArray66, (double) (-1));
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray73, (double) 0L);
        double[] doubleArray76 = new double[] {};
        double[] doubleArray77 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray77, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray72, doubleArray77, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray77, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray14, doubleArray61, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray61, (double) 0.0f);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) synonymsAnalysisTest3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttling0, obj2);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0, (double) (-1.0f));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (short) 10, (double) (short) 100);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        int[] intArray2 = new int[] { (byte) -1, (short) 0 };
        int[] intArray7 = new int[] { (short) 10, (byte) 0, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 10L);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 1);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 1, (long) 10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain10);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) ' ', 100.0d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 100, (double) 'a', (double) (byte) 1);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 100, (long) 10);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest8.getanalysisService();
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest8.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest14.logger;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) eSLogger17);
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest2.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService29);
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest20.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0.0f);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService24, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest25.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest30.assertDocsSkippingEquals("hi!", indexReader33, 0, postingsEnum35, postingsEnum36, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest30.analysisService;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest30.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger29, (java.lang.Object) synonymsAnalysisTest30);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest30.analysisService;
        java.lang.String str44 = synonymsAnalysisTest30.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest45.ensureCleanedUp();
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest45.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule57;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule57;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest30, (java.lang.Object) testRule57);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) synonymsAnalysisTest3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.analysisService;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest9.assertPositionsSkippingEquals("tests.badapples", indexReader21, (int) (short) 10, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("hi!", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest28.setanalysisService(analysisService37);
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest28.logger;
        java.lang.Object obj40 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest28, obj40);
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest28.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) synonymsAnalysisTest28);
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest9.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        synonymsAnalysisTest2.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest2.match("hi!", "", "europarl.lines.txt.gz");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling54, throttling55, throttling56 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet58 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray57);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) throttlingArray57);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) 0.0f, (double) ' ');
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) -1, 100L);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        org.junit.Assert.assertArrayEquals(longArray17, longArray21);
        org.junit.Assert.assertArrayEquals(longArray13, longArray21);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray34, longArray35);
        org.junit.Assert.assertArrayEquals(longArray31, longArray35);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray21, longArray31);
        org.junit.Assert.assertArrayEquals(longArray6, longArray31);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray47);
        org.junit.Assert.assertArrayEquals(longArray6, longArray47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest51.getanalysisService();
        synonymsAnalysisTest51.overrideTestDefaultQueryCache();
        synonymsAnalysisTest51.tearDown();
        java.lang.Object obj55 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest51, obj55);
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest51.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest51);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = null;
        synonymsAnalysisTest51.analysisService = analysisService59;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) longArray47, (java.lang.Object) synonymsAnalysisTest51);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain23;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest25.assertPositionsSkippingEquals("tests.badapples", indexReader37, (int) (short) 10, postingsEnum39, postingsEnum40);
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader49, terms50, terms51, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest54.setUp();
        synonymsAnalysisTest54.ensureCheckIndexPassed();
        synonymsAnalysisTest54.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest54.analysisService;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        synonymsAnalysisTest54.assertFieldsEquals("tests.weekly", indexReader60, fields61, fields62, false);
        synonymsAnalysisTest54.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger66 = synonymsAnalysisTest54.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) false, (java.lang.Object) eSLogger66);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals("", longArray3, longArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest15.getlogger();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.maxfailures", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        synonymsAnalysisTest15.assertTermsEquals("tests.nightly", indexReader24, terms25, terms26, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest15.getanalysisService();
        synonymsAnalysisTest15.setUp();
        java.lang.String str31 = synonymsAnalysisTest15.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray12, (java.lang.Object) str31);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        java.util.concurrent.ExecutorService[][] executorServiceArray1 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray1);
        java.lang.Class<?> wildcardClass3 = executorServiceArraySet2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest5.assertFieldsEquals("", indexReader9, fields10, fields11, true);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest5.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest25.assertFieldsEquals("random", indexReader36, fields37, fields38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest25.assertTermsEquals("tests.weekly", indexReader42, terms43, terms44, false);
        synonymsAnalysisTest25.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest49.assertDocsSkippingEquals("hi!", indexReader52, 0, postingsEnum54, postingsEnum55, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest49.analysisService;
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest49.assertPositionsSkippingEquals("tests.badapples", indexReader61, (int) (short) 10, postingsEnum63, postingsEnum64);
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain66;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) ruleChain66);
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) synonymsAnalysisTest15);
        synonymsAnalysisTest15.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) wildcardClass3, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray54, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray33);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[][] strArray67 = new java.lang.String[][] { strArray62, strArray64, strArray66 };
        java.util.Set<java.lang.String[]> strArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) strArray67);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) 4);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger3);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 0L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) 0L);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray11, (double) (-1));
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) 0L);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray17, doubleArray22, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray17, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray11, (double) 10.0f);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) 0L);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 0L);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray37, doubleArray42, (double) (-1));
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) 0L);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray48, doubleArray53, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray53, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("random", doubleArray33, doubleArray37, (double) '4');
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray11, doubleArray33, (double) 0.0f);
        double[] doubleArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray64, 100.0d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader11, fields12, fields13, true);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals("hi!", shortArray28, shortArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest45.assertDocsEnumEquals("tests.badapples", postingsEnum47, postingsEnum48, true);
        synonymsAnalysisTest45.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest45.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray28, (java.lang.Object) testRule53);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray56, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray56);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray73);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray76);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray81);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray86, shortArray87);
        short[] shortArray90 = new short[] {};
        short[] shortArray91 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray90, shortArray91);
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray90);
        org.junit.Assert.assertArrayEquals("random", shortArray76, shortArray90);
        org.junit.Assert.assertArrayEquals("random", shortArray56, shortArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) "random");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray9);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals(charArray14, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("", charArray14, charArray21);
        org.junit.Assert.assertArrayEquals(charArray9, charArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) charArray14);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, 100.0f, (float) 1L);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        int[] intArray2 = new int[] { (-1) };
        int[] intArray5 = new int[] { 'a', 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray5);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader6, terms7, terms8, true);
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest12.assertFieldsEquals("random", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest12.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, false);
        synonymsAnalysisTest12.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest12.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        synonymsAnalysisTest37.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService36, (java.lang.Object) synonymsAnalysisTest37);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest37.assertTermsEquals("europarl.lines.txt.gz", indexReader42, terms43, terms44, true);
        org.junit.rules.TestRule testRule47 = synonymsAnalysisTest37.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest37);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        int[] intArray3 = new int[] { ' ', (byte) -1 };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray5);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest0.analysisService = analysisService3;
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest7.assertDocsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10, true);
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest7.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest7.logger;
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest7.ruleChain;
        java.lang.Class<?> wildcardClass17 = synonymsAnalysisTest7.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule6, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (byte) 100);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 100.0d, (double) '4');
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader5, fields6, fields7, true);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 10);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray15);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray8, charArray21);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray26, charArray29);
        org.junit.Assert.assertArrayEquals(charArray21, charArray29);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray50, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray57);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray50, charArray63);
        org.junit.Assert.assertArrayEquals(charArray21, charArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray21);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (byte) 10, 1, (byte) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader5, terms6, terms7, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest13);
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule27);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (-1.0f), (double) 'a');
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("enwiki.random.lines.txt", indexReader6, terms7, terms8, true);
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService14);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("hi!", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest27.analysisService;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest27.assertFieldsEquals("random", indexReader38, fields39, fields40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        synonymsAnalysisTest27.assertTermsEquals("tests.weekly", indexReader44, terms45, terms46, false);
        synonymsAnalysisTest27.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest51.setUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest51.assertDocsSkippingEquals("hi!", indexReader54, 0, postingsEnum56, postingsEnum57, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = synonymsAnalysisTest51.analysisService;
        org.junit.rules.RuleChain ruleChain61 = synonymsAnalysisTest51.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest51.assertPositionsSkippingEquals("tests.badapples", indexReader63, (int) (short) 10, postingsEnum65, postingsEnum66);
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest51.failureAndSuccessEvents;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain68;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) ruleChain68);
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest72.getanalysisService();
        synonymsAnalysisTest72.overrideTestDefaultQueryCache();
        synonymsAnalysisTest72.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) synonymsAnalysisTest72);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str78 = synonymsAnalysisTest77.getTestName();
        synonymsAnalysisTest77.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService80 = synonymsAnalysisTest77.analysisService;
        synonymsAnalysisTest77.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService82 = synonymsAnalysisTest77.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        synonymsAnalysisTest77.assertDocsEnumEquals("tests.awaitsfix", postingsEnum84, postingsEnum85, true);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) synonymsAnalysisTest77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest77);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray13);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray23, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray23);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray37, byteArray38);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray43, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray43);
        org.junit.Assert.assertArrayEquals("", byteArray23, byteArray43);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray43, byteArray53);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (byte) -1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) 10);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.analysisService = analysisService17;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) '#', (float) (byte) 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 1, (double) '4');
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray22, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray48, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray60, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger70 = synonymsAnalysisTest69.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = null;
        synonymsAnalysisTest69.setanalysisService(analysisService71);
        synonymsAnalysisTest69.setUp();
        org.junit.rules.TestRule testRule74 = synonymsAnalysisTest69.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest69);
        synonymsAnalysisTest69.tearDown();
        synonymsAnalysisTest69.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10.0d, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) 3);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10L, (long) (byte) 1);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) '4');
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        java.lang.Object obj0 = null;
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray16);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray9, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("", charArray30, charArray37);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray27, charArray30);
        org.junit.Assert.assertArrayEquals(charArray22, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) charArray30);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        java.lang.Object obj1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray14);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray24);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray42, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray47, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray48, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray48);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray64, byteArray65);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray69, byteArray70);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray70, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray61);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest80 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest80.setUp();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest80.assertDocsSkippingEquals("hi!", indexReader83, 0, postingsEnum85, postingsEnum86, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = synonymsAnalysisTest80.analysisService;
        synonymsAnalysisTest80.setUp();
        org.junit.rules.TestRule testRule91 = synonymsAnalysisTest80.ruleChain;
        synonymsAnalysisTest80.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) byteArray61, (java.lang.Object) synonymsAnalysisTest80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", obj1, (java.lang.Object) byteArray61);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 100);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 10, (long) (byte) 0);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) ' ');
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 100, (double) '4');
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (short) 10, (float) (byte) 1, (float) (short) -1);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest0.analysisService = analysisService13;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader19, terms20, terms21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger30);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0d, (-1.0d));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.junit.Assert.assertNotEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.analysisService = analysisService9;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.weekly", 3, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 0L);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray3, doubleArray8, (double) (-1));
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) 0L);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray14, doubleArray19, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray14, (double) 4);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) 0L);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray27, doubleArray32, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray8, doubleArray27, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray27, (double) '4');
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest0.analysisService = analysisService10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        int[] intArray3 = new int[] { 5, (byte) -1, (short) 1 };
        int[] intArray8 = new int[] { (byte) 1, 3, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest0.assertTermsEquals("enwiki.random.lines.txt", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.weekly", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22);
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest10.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest27.analysisService;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest27.assertFieldsEquals("tests.weekly", indexReader33, fields34, fields35, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest27.analysisService;
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) synonymsAnalysisTest27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest27);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 4, (long) 100);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray15);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray8, charArray21);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray26, charArray29);
        org.junit.Assert.assertArrayEquals(charArray21, charArray29);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray42, charArray46);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals(charArray50, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray57);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray50, charArray63);
        org.junit.Assert.assertArrayEquals(charArray21, charArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest68.setUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        synonymsAnalysisTest68.assertDocsSkippingEquals("hi!", indexReader71, 0, postingsEnum73, postingsEnum74, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = null;
        synonymsAnalysisTest68.setanalysisService(analysisService77);
        org.elasticsearch.common.logging.ESLogger eSLogger79 = synonymsAnalysisTest68.logger;
        java.lang.Object obj80 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest68, obj80);
        org.junit.rules.TestRule testRule82 = synonymsAnalysisTest68.ruleChain;
        synonymsAnalysisTest68.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest68.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger85 = synonymsAnalysisTest68.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray50, (java.lang.Object) synonymsAnalysisTest68);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        int[] intArray4 = new int[] { (byte) 0, 5, (short) -1, (short) 1 };
        int[] intArray10 = new int[] { (-1), (-1), (short) -1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest2.analysisService = analysisService14;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) eSLogger27);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest2.analysisService = analysisService29;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader32, terms33, terms34, true);
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        int[] intArray3 = new int[] { 4, 100, 4 };
        int[] intArray9 = new int[] { (byte) 1, (short) 10, (short) 1, 3, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest2);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest2);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest2);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("<unknown>", postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray11);
        java.lang.Class<?> wildcardClass13 = charSequenceArray11.getClass();
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        java.lang.Class<?> wildcardClass23 = shortArray19.getClass();
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        java.lang.Class<?> wildcardClass33 = shortArray29.getClass();
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray40, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray52, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray52);
        java.lang.Class<?> wildcardClass59 = executorServiceArray52.getClass();
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray65);
        java.lang.Class<?> wildcardClass69 = shortArray65.getClass();
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList77 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray76);
        java.lang.Class<?> wildcardClass78 = charSequenceArray76.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = new java.lang.reflect.GenericDeclaration[] { wildcardClass13, wildcardClass23, wildcardClass33, wildcardClass59, wildcardClass69, wildcardClass78 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet80 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray79);
        org.junit.Assert.assertNotNull((java.lang.Object) genericDeclarationSet80);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) genericDeclarationSet80);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum84, postingsEnum85);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader6, 3, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f, (double) (short) 1);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) 0L);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray2, doubleArray7, (double) (-1));
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 0L);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray13, doubleArray18, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray18, (double) (byte) 100);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 0L);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) 0L);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray32, doubleArray37, (double) (-1));
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 0L);
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray43, doubleArray48, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray43, (double) 4);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) 0L);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray56, doubleArray61, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray37, doubleArray56, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray37, (double) (-1L));
        double[] doubleArray71 = new double[] {};
        double[] doubleArray72 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray71, doubleArray72, (double) 0L);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray71, doubleArray76, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray37, doubleArray71, (double) 10L);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray18, doubleArray37, (double) 2);
        double[] doubleArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray85, (double) (short) -1);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (byte) 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray23);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray10, byteArray28);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray44, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray48, byteArray49);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray54, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray10, byteArray40);
        byte[] byteArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray10, byteArray65);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        java.lang.String str6 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest9.ruleChain;
        synonymsAnalysisTest9.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest9.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) ruleChain31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        org.junit.Assert.assertArrayEquals(longArray4, longArray12);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray17, longArray21);
        org.junit.Assert.assertArrayEquals(longArray4, longArray21);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        org.junit.Assert.assertArrayEquals(longArray32, longArray36);
        org.junit.Assert.assertArrayEquals(longArray28, longArray32);
        org.junit.Assert.assertArrayEquals("hi!", longArray21, longArray32);
        long[] longArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray21, longArray41);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1.0f, 10.0d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray14);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) longArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest18.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.weekly", indexReader27, (int) (short) 100, postingsEnum29, postingsEnum30);
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray5, (java.lang.Object) (-1.0f));
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray17, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray29, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray48, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray43, obj54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray63, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray75, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray75);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray63);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest85 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest85.setUp();
        synonymsAnalysisTest85.ensureCheckIndexPassed();
        synonymsAnalysisTest85.ensureCleanedUp();
        synonymsAnalysisTest85.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain90 = synonymsAnalysisTest85.failureAndSuccessEvents;
        synonymsAnalysisTest85.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService92 = null;
        synonymsAnalysisTest85.setanalysisService(analysisService92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) executorServiceArray63, (java.lang.Object) analysisService92);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest45.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) executorServiceArray24, (java.lang.Object) eSLogger46);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, 10L);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService25);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }
}

