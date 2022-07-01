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
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) "tests.monster", obj17);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10.0d, (double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5503");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.weekly");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures13, testRuleIgnoreAfterMaxFailures16, testRuleIgnoreAfterMaxFailures18, testRuleIgnoreAfterMaxFailures19 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet22 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet23 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, testRuleIgnoreAfterMaxFailuresArray21);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet25 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray21);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 1, 1L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5506");
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
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("hi!", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest14.analysisService;
        synonymsAnalysisTest14.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest14.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest14.analysisService = analysisService26;
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (byte) -1);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 2);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("hi!", indexReader39, (int) (short) 0, postingsEnum41, postingsEnum42);
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest1.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader48, (int) (short) -1, postingsEnum50, postingsEnum51);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        synonymsAnalysisTest53.assertDocsEnumEquals("tests.badapples", postingsEnum55, postingsEnum56, true);
        synonymsAnalysisTest53.ensureAllSearchContextsReleased();
        synonymsAnalysisTest53.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest53.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) (short) -1, (java.lang.Object) testRule62);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100.0f);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5508");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest6.assertFieldsEquals("random", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, 0, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest28.assertDocsEnumEquals("tests.badapples", postingsEnum30, postingsEnum31, true);
        synonymsAnalysisTest28.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest28.getlogger();
        java.lang.String str36 = synonymsAnalysisTest28.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) str36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("<unknown>", indexReader39, 5, postingsEnum41, postingsEnum42, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest6.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest6.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest6.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClassArray2, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) '4', 0.0d);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5510");
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
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray25);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray40);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray47, byteArray51);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray63, byteArray64);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray68, byteArray69);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray72, byteArray73);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray69, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray51, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray35, byteArray51);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray25, byteArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray51);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5511");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray17, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray12, obj23);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray12);
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
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray53, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray53);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray32);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray63 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray64 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray65 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray66 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray63, genericDeclarationArray64, genericDeclarationArray65 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray66);
        java.util.List<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, genericDeclarationArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) genericDeclarationArray66);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5512");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, 0, postingsEnum19, postingsEnum20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        java.lang.Object obj28 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.setUp();
        org.junit.Assert.assertNotEquals(obj28, (java.lang.Object) synonymsAnalysisTest29);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest29.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest29.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) eSLogger36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest25.assertTermsEquals("<unknown>", indexReader39, terms40, terms41, false);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest45.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest64.setUp();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("hi!", indexReader67, 0, postingsEnum69, postingsEnum70, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest64.analysisService;
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest64.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain74;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain74);
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain74;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain74;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum80, postingsEnum81);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100, (double) 3);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5514");
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
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader39, (int) (short) 10, postingsEnum41, postingsEnum42, false);
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule45;
        java.lang.Class<?> wildcardClass47 = testRule45.getClass();
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray59);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray64);
        org.junit.Assert.assertArrayEquals("hi!", shortArray52, shortArray59);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest69.assertDocsEnumEquals("tests.badapples", postingsEnum71, postingsEnum72, true);
        synonymsAnalysisTest69.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule77 = synonymsAnalysisTest69.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray52, (java.lang.Object) testRule77);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) testRule77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass47, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (double) 2);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5516");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5517");
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray11, doubleArray43, (double) ' ');
        double[] doubleArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray57, (double) '#');
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5518");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("random", indexReader14, (int) (byte) 1, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.failfast", indexReader21, fields22, fields23, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest19.analysisService = analysisService28;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum31, postingsEnum32, false);
        java.lang.String str35 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest38.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest38.logger;
        java.lang.Object obj41 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.getanalysisService();
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        synonymsAnalysisTest42.setUp();
        org.junit.Assert.assertNotEquals(obj41, (java.lang.Object) synonymsAnalysisTest42);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest42.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest42.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest38, (java.lang.Object) eSLogger49);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        synonymsAnalysisTest38.assertTermsEquals("<unknown>", indexReader52, terms53, terms54, false);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest58.setUp();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest58.assertDocsSkippingEquals("hi!", indexReader61, 0, postingsEnum63, postingsEnum64, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService67 = synonymsAnalysisTest58.analysisService;
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest58.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        synonymsAnalysisTest58.assertPositionsSkippingEquals("tests.badapples", indexReader70, (int) (short) 10, postingsEnum72, postingsEnum73);
        org.junit.rules.RuleChain ruleChain75 = synonymsAnalysisTest58.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = synonymsAnalysisTest58.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest77.setUp();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        synonymsAnalysisTest77.assertDocsSkippingEquals("hi!", indexReader80, 0, postingsEnum82, postingsEnum83, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest77.analysisService;
        org.junit.rules.RuleChain ruleChain87 = synonymsAnalysisTest77.failureAndSuccessEvents;
        synonymsAnalysisTest58.failureAndSuccessEvents = ruleChain87;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain87);
        synonymsAnalysisTest38.failureAndSuccessEvents = ruleChain87;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain87;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) (byte) 1, (java.lang.Object) ruleChain87);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1L, (double) (byte) -1);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5520");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5521");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (short) 100, 0.0d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 4, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5524");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray4, strArray8, strArray12, strArray16, strArray20 };
        java.util.Set<java.lang.String[]> strArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.String[]> strArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][]) strArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray36, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray36);
        java.lang.Object obj42 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray31, obj42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
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
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray51);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray21, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5525");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) 0L);
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray4, doubleArray9, (double) (-1));
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) 0L);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray15, doubleArray20, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray15, (double) 4);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) 0L);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray28, doubleArray33, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray9, doubleArray28, (double) 1L);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray28, doubleArray41, (double) 1.0f);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) 0L);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) 0L);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray51, doubleArray56, (double) (-1));
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) 0L);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray62, doubleArray67, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray67, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray51, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray51, (double) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray51, (double) '#');
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5526");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 10.0d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) 10);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5529");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) 10, 0.0d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5530");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.getlogger();
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
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
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray50);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest71.setUp();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        synonymsAnalysisTest71.assertDocsSkippingEquals("hi!", indexReader74, 0, postingsEnum76, postingsEnum77, true);
        org.junit.rules.TestRule testRule80 = synonymsAnalysisTest71.ruleChain;
        java.lang.Class<?> wildcardClass81 = synonymsAnalysisTest71.getClass();
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray88, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClass81, (java.lang.Object) executorServiceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray88);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) eSLogger18, (java.lang.Object) executorServiceArray50);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 100, (double) '4');
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5532");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.getanalysisService();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        synonymsAnalysisTest10.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger14);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.analysisService = analysisService16;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (short) -1, (float) 'a', (float) (byte) -1);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5534");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, (double) 0.0f, 0.0d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5535");
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
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray11, shortArray30);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray38);
        short[] shortArray46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray38, shortArray46);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5536");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest2.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) analysisService24);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5537");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.weekly", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, false);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 100.0d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (-1.0d));
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5540");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Locale[] localeArray2 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray3 = new java.util.Locale[][] { localeArray0, localeArray1, localeArray2 };
        java.util.Set<java.util.Locale[]> localeArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray3);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray9, (java.lang.Object) (-1.0f));
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
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
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray21);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
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
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray55, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray55);
        java.lang.Object obj61 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray50, obj61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray3, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, (long) ' ');
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (-1L));
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5543");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) (short) 10, (long) (short) 10);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5544");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) 100, (long) 100);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5546");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 4, 1L);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5547");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray58, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray46);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
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
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray83, (java.lang.Object) (-1.0f));
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray83, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray46);
        boolean boolean94 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.lang.Object[] objArray95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray46, objArray95);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5548");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.nightly", (int) (short) 10, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 'a', (float) 3, 0.0f);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5550");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 100, (long) (short) 100);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) ' ', (long) (byte) 1);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (-1));
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5554");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
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
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray35, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray43, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray64, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray64);
        java.lang.Object obj70 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray59, obj70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray59);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray59);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest76 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest76.setUp();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        synonymsAnalysisTest76.assertDocsSkippingEquals("hi!", indexReader79, 0, postingsEnum81, postingsEnum82, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService85 = synonymsAnalysisTest76.analysisService;
        synonymsAnalysisTest76.setUp();
        org.junit.rules.TestRule testRule87 = synonymsAnalysisTest76.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger88 = synonymsAnalysisTest76.logger;
        synonymsAnalysisTest76.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = null;
        synonymsAnalysisTest76.setanalysisService(analysisService90);
        org.junit.rules.TestRule testRule92 = synonymsAnalysisTest76.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray4, (java.lang.Object) testRule92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) testRule92);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5555");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 100, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5556");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest2.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest2.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService26, (java.lang.Object) synonymsAnalysisTest27);
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest27.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("hi!", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest32.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest32.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger31, (java.lang.Object) synonymsAnalysisTest32);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest32.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) eSLogger45, (java.lang.Object) synonymsAnalysisTest46);
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest46.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest49.getanalysisService();
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        synonymsAnalysisTest49.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest54.setUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest54.assertDocsSkippingEquals("hi!", indexReader57, 0, postingsEnum59, postingsEnum60, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest54.analysisService;
        synonymsAnalysisTest54.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest54.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest54.analysisService = analysisService66;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest68.setUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        synonymsAnalysisTest68.assertDocsSkippingEquals("hi!", indexReader71, 0, postingsEnum73, postingsEnum74, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = synonymsAnalysisTest68.analysisService;
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest68.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger79 = synonymsAnalysisTest68.logger;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest54, (java.lang.Object) eSLogger79);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest49, (java.lang.Object) eSLogger79);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) eSLogger48, (java.lang.Object) eSLogger79);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest83 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest83, (java.lang.Object) 100.0f);
        synonymsAnalysisTest83.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) eSLogger48, (java.lang.Object) "<unknown>");
        java.lang.Object obj89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", obj89);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5557");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray10);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray15, charArray19);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray22);
        org.junit.Assert.assertArrayEquals(charArray10, charArray15);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray10, charArray27);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray40, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray40, charArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray37, charArray40);
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray52);
        org.junit.Assert.assertArrayEquals("hi!", charArray10, charArray37);
        char[] charArray57 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray37, charArray57);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10L, (double) (short) 0);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5559");
        java.lang.Object[] objArray1 = null;
        org.junit.rules.TestRule[][][][] testRuleArray2 = new org.junit.rules.TestRule[][][][] {};
        java.util.Set<org.junit.rules.TestRule[][][]> testRuleArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) testRuleArray2);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5560");
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
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray32);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray58);
        short[] shortArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray71);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5561");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.analysisService = analysisService11;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest15.setanalysisService(analysisService24);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest15.getanalysisService();
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        synonymsAnalysisTest15.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest15.analysisService = analysisService29;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest15);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest15.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 0, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5562");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader10, terms11, terms12, true);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass16 = synonymsAnalysisTest0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5563");
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
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray20, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.lang.Object obj26 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray15, obj26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray37 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures29, testRuleIgnoreAfterMaxFailures32, testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures35 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray37);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5564");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, true);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest12.logger;
        synonymsAnalysisTest12.setUp();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain29;
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray45);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray35, charArray38);
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray50);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals(charArray57, charArray61);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray57, charArray64);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray54, charArray57);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        org.junit.Assert.assertArrayEquals(charArray54, charArray69);
        org.junit.Assert.assertArrayEquals(charArray50, charArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain29, (java.lang.Object) charArray69);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5565");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        synonymsAnalysisTest2.tearDown();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest8.ruleChain;
        synonymsAnalysisTest8.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest8.setUp();
        synonymsAnalysisTest8.ensureCleanedUp();
        synonymsAnalysisTest8.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest8.analysisService;
        org.junit.Assert.assertNotSame((java.lang.Object) testRule7, (java.lang.Object) synonymsAnalysisTest8);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", obj1, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5566");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.analysisService = analysisService17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest20.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("<unknown>", indexReader27, (-1), postingsEnum29, postingsEnum30, true);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest20.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest37.assertDocsSkippingEquals("hi!", indexReader40, 0, postingsEnum42, postingsEnum43, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest37.analysisService;
        synonymsAnalysisTest37.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest48.setUp();
        synonymsAnalysisTest48.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest48, (java.lang.Object) (short) 1);
        synonymsAnalysisTest48.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest54.setUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest54.assertDocsSkippingEquals("hi!", indexReader57, 0, postingsEnum59, postingsEnum60, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest54.analysisService;
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest54.failureAndSuccessEvents;
        synonymsAnalysisTest48.failureAndSuccessEvents = ruleChain64;
        synonymsAnalysisTest37.failureAndSuccessEvents = ruleChain64;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain64;
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        synonymsAnalysisTest20.assertTermsEquals("tests.slow", indexReader69, terms70, terms71, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger75 = synonymsAnalysisTest74.getlogger();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        synonymsAnalysisTest74.assertFieldsEquals("tests.maxfailures", indexReader77, fields78, fields79, true);
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        synonymsAnalysisTest74.assertTermsEquals("tests.nightly", indexReader83, terms84, terms85, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = synonymsAnalysisTest74.getanalysisService();
        synonymsAnalysisTest74.setUp();
        java.lang.String str90 = synonymsAnalysisTest74.getTestName();
        synonymsAnalysisTest74.assertPathHasBeenCleared("europarl.lines.txt.gz");
        synonymsAnalysisTest74.setUp();
        synonymsAnalysisTest74.setIndexWriterMaxDocs(100);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) indexReader69, (java.lang.Object) synonymsAnalysisTest74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest74);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5567");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray2, intArray4);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("", intArray10, intArray12);
        org.junit.Assert.assertArrayEquals(intArray2, intArray12);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray19, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("", intArray27, intArray29);
        org.junit.Assert.assertArrayEquals(intArray19, intArray29);
        org.junit.Assert.assertArrayEquals(intArray12, intArray19);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray12, intArray35);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray48);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray59, intArray61);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray54, intArray61);
        org.junit.Assert.assertArrayEquals("", intArray41, intArray61);
        org.junit.Assert.assertArrayEquals(intArray12, intArray61);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray74, intArray75);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray75, intArray77);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray70, intArray77);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray88, intArray90);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray83, intArray90);
        org.junit.Assert.assertArrayEquals("", intArray70, intArray90);
        org.junit.Assert.assertArrayEquals(intArray61, intArray90);
        int[] intArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray90, intArray97);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5568");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader9, fields10, fields11, true);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.slow", indexReader16, (int) (short) 1, postingsEnum18, postingsEnum19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 1);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5569");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest1.getanalysisService();
        java.lang.Class<?> wildcardClass19 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest20.getanalysisService();
        synonymsAnalysisTest20.overrideTestDefaultQueryCache();
        synonymsAnalysisTest20.tearDown();
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass19, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) (short) 0, 0.0d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5571");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.slow", indexReader20, 3, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest0.analysisService = analysisService25;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 3, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5572");
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
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, 0.0f, (float) (byte) -1);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5574");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj4 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, obj4);
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 'a', (double) 0L, (double) 10.0f);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5577");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.analysisService = analysisService8;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader18, terms19, terms20, true);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 0);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray30, (float) 10);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) 5);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray30, floatArray41, 0.0f);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray59, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray64);
        org.junit.Assert.assertArrayEquals(longArray56, longArray64);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray73, longArray74);
        org.junit.Assert.assertArrayEquals(longArray69, longArray73);
        org.junit.Assert.assertArrayEquals(longArray56, longArray73);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray79, longArray80);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray83, longArray84);
        long[] longArray87 = new long[] {};
        long[] longArray88 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray87, longArray88);
        org.junit.Assert.assertArrayEquals(longArray84, longArray88);
        org.junit.Assert.assertArrayEquals(longArray80, longArray84);
        org.junit.Assert.assertArrayEquals("hi!", longArray73, longArray84);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) floatArray41, (java.lang.Object) longArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) "", (java.lang.Object) floatArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) floatArray41);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5578");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals(charArray7, charArray11);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray7);
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        org.junit.Assert.assertArrayEquals(charArray4, charArray21);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray4, charArray34);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) charArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray4);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5579");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray13, intArray15);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("", intArray21, intArray23);
        org.junit.Assert.assertArrayEquals(intArray13, intArray21);
        org.junit.Assert.assertArrayEquals(intArray7, intArray21);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray38, intArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray33, intArray40);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray51, intArray53);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray46, intArray53);
        org.junit.Assert.assertArrayEquals("", intArray33, intArray53);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("", intArray61, intArray63);
        org.junit.Assert.assertArrayEquals("", intArray53, intArray63);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) intArray53);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("", intArray71, intArray73);
        org.junit.Assert.assertArrayEquals(intArray53, intArray73);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray7, intArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray1, intArray7);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5580");
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
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest30.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest46.getanalysisService();
        synonymsAnalysisTest46.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader50, (int) (short) 1, postingsEnum52, postingsEnum53, true);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest30, (java.lang.Object) "enwiki.random.lines.txt");
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        synonymsAnalysisTest30.assertDocsEnumEquals("<unknown>", postingsEnum58, postingsEnum59, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum59);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) '4');
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5582");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest28.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("hi!", indexReader31, 0, postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest28.analysisService;
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest28.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        synonymsAnalysisTest41.tearDown();
        synonymsAnalysisTest41.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest41.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest41.logger;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest41);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        synonymsAnalysisTest41.assertTermsEquals("tests.maxfailures", indexReader51, terms52, terms53, false);
        synonymsAnalysisTest41.overrideTestDefaultQueryCache();
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        org.junit.Assert.assertArrayEquals("hi!", shortArray61, shortArray68);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest78 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        synonymsAnalysisTest78.assertDocsEnumEquals("tests.badapples", postingsEnum80, postingsEnum81, true);
        synonymsAnalysisTest78.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule86 = synonymsAnalysisTest78.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray61, (java.lang.Object) testRule86);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) testRule86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest41, (java.lang.Object) testRule86);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 100.0d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5584");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5585");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.badapples", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        synonymsAnalysisTest22.tearDown();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain26;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest31.assertDocsEnumEquals("tests.badapples", postingsEnum33, postingsEnum34, true);
        synonymsAnalysisTest31.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest31.assertPositionsSkippingEquals("tests.weekly", indexReader40, (int) (short) 100, postingsEnum42, postingsEnum43);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = null;
        synonymsAnalysisTest31.setanalysisService(analysisService45);
        synonymsAnalysisTest31.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest31.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 3, (double) (-1));
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5588");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest2.analysisService = analysisService14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest2.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest23.analysisService;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest23);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("tests.weekly", indexReader36, 5, postingsEnum38, postingsEnum39, false);
        synonymsAnalysisTest23.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest23.setanalysisService(analysisService44);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest23.analysisService = analysisService46;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest23);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5589");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", (-1), numericDocValues23, numericDocValues24);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5590");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray7, (java.lang.Object) (-1.0f));
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray53, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray53);
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray48, obj59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest65 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        synonymsAnalysisTest65.assertFieldsEquals("tests.failfast", indexReader67, fields68, fields69, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService72 = null;
        synonymsAnalysisTest65.setanalysisService(analysisService72);
        synonymsAnalysisTest65.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        synonymsAnalysisTest65.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader77, (int) (short) 1, postingsEnum79, postingsEnum80, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray1, (java.lang.Object) indexReader77);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5591");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest16.setIndexWriterMaxDocs(100);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest16.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5592");
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
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet25 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray19);
        java.util.List<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, charSequenceCollectionArray19);
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        synonymsAnalysisTest40.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.weekly", indexReader46, fields47, fields48, false);
        synonymsAnalysisTest40.overrideTestDefaultQueryCache();
        java.lang.String str52 = synonymsAnalysisTest40.getTestName();
        synonymsAnalysisTest40.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest55.setUp();
        synonymsAnalysisTest55.ensureCheckIndexPassed();
        synonymsAnalysisTest55.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest60.setUp();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest60.assertDocsSkippingEquals("hi!", indexReader63, 0, postingsEnum65, postingsEnum66, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = synonymsAnalysisTest60.analysisService;
        org.junit.rules.RuleChain ruleChain70 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest60.assertPositionsSkippingEquals("tests.badapples", indexReader72, (int) (short) 10, postingsEnum74, postingsEnum75);
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest55.failureAndSuccessEvents = ruleChain77;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain77);
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService83 = null;
        synonymsAnalysisTest27.analysisService = analysisService83;
        synonymsAnalysisTest27.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceCollectionArray19, (java.lang.Object) synonymsAnalysisTest27);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 5, (-1.0f));
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) -1, (long) 2);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5595");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj2, (java.lang.Object) synonymsAnalysisTest3);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest3.analysisService;
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
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) fields22);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest3.assertDocsEnumEquals("", postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5596");
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
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertPathHasBeenCleared("");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) '#', (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5598");
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
        synonymsAnalysisTest16.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest16.setanalysisService(analysisService37);
        synonymsAnalysisTest16.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (byte) -1, 1.0f);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5600");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5601");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.weekly", indexReader10, (int) (short) 100, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService15);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("hi!", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(100);
        java.lang.String str26 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest29.analysisService;
        synonymsAnalysisTest29.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain36;
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain55;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain55;
        float[] floatArray58 = new float[] {};
        float[][] floatArray59 = new float[][] { floatArray58 };
        java.util.Set<float[]> floatArraySet60 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) ruleChain55, (java.lang.Object) floatArraySet60);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5602");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.ensureCleanedUp();
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest5.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        synonymsAnalysisTest19.ensureCleanedUp();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest19.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest19.getlogger();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest19.logger;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService18, (java.lang.Object) synonymsAnalysisTest19);
        synonymsAnalysisTest19.setUp();
        java.lang.String str32 = synonymsAnalysisTest19.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5603");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) 10);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray17, (float) 5);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray17, floatArray23, 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray17, (float) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        synonymsAnalysisTest32.ensureCheckIndexPassed();
        synonymsAnalysisTest32.ensureCleanedUp();
        synonymsAnalysisTest32.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest32.getanalysisService();
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 0);
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray44, (float) 10);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) (short) 0);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray54, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray39, floatArray54, (float) (byte) 10);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) analysisService37, (java.lang.Object) floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray39, (float) 'a');
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 0);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray70, (float) 10);
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) 5);
        float[] floatArray81 = new float[] {};
        float[] floatArray82 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray81, floatArray82, (float) (short) 0);
        float[] floatArray85 = new float[] {};
        float[] floatArray86 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray85, floatArray86, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray81, floatArray86, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray70, floatArray81, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray81, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) 100L);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5604");
        short[] shortArray1 = null;
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray11);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        org.junit.Assert.assertArrayEquals("random", shortArray24, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest45.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = null;
        synonymsAnalysisTest45.setanalysisService(analysisService47);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) shortArray14, (java.lang.Object) analysisService47);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray51);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray66);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray71);
        org.junit.Assert.assertArrayEquals("hi!", shortArray59, shortArray66);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray78, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray82, shortArray83);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray86);
        short[] shortArray91 = new short[] {};
        short[] shortArray92 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray91, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray91);
        org.junit.Assert.assertArrayEquals("hi!", shortArray79, shortArray86);
        org.junit.Assert.assertArrayEquals("", shortArray59, shortArray86);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray51, shortArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray1, shortArray51);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5606");
        float[] floatArray1 = null;
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
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray18, (float) 10);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray23, (float) (short) 10);
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
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray47, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray32, floatArray47, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray32, (float) (short) 10);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) (short) 0);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) 10);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray66, (float) 5);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray32, floatArray61, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray61, (float) 100);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5607");
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
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 100, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5608");
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
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray35, charArray39);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray42);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        org.junit.Assert.assertArrayEquals(charArray2, charArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest48.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest48.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest48.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) charArray2, (java.lang.Object) synonymsAnalysisTest48);
        synonymsAnalysisTest48.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest48.match("tests.maxfailures", "tests.failfast", "");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5609");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
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
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertArrayEquals("random", shortArray11, shortArray25);
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
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray40);
        short[] shortArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray61);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (-1.0f), 0.0f);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5611");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.analysisService = analysisService9;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5612");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest2.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest2.failureAndSuccessEvents;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest30.getlogger();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.maxfailures", indexReader33, fields34, fields35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest30.assertTermsEquals("tests.nightly", indexReader39, terms40, terms41, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest30.getanalysisService();
        synonymsAnalysisTest30.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest30.assertDocsSkippingEquals("tests.maxfailures", indexReader47, (int) (short) 100, postingsEnum49, postingsEnum50, false);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) testRule29, (java.lang.Object) indexReader47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (-1), (double) 1.0f);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5614");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5615");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray30, byteArray31);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray36, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray18, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray18);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray54, byteArray55);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray60, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray51, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray54);
        byte[] byteArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray70);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5616");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 100);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) '#', 1.0d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 100, (long) (short) 0);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5619");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.getlogger();
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
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest14.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest39.setUp();
        synonymsAnalysisTest39.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService38, (java.lang.Object) synonymsAnalysisTest39);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        synonymsAnalysisTest39.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, true);
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest39.ruleChain;
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest39.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader53, terms54, terms55, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 0);
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum63, postingsEnum64);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 4, (double) 100L, (double) 'a');
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5621");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader5, (int) (short) 10, postingsEnum7, postingsEnum8);
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService12);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5622");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.getanalysisService();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest10.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest10.getlogger();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest10.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule8, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5623");
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
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray48 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] {};
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray48);
        java.util.List<org.junit.rules.TestRule[][]> testRuleArrayList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (org.junit.rules.TestRule[][][]) testRuleIgnoreAfterMaxFailuresArray48);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray48);
        java.util.Set<org.junit.rules.TestRule[][]> testRuleArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[][][]) testRuleIgnoreAfterMaxFailuresArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray48);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5624");
        java.lang.Object[] objArray1 = null;
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
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray37);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) executorServiceArray37);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5625");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        synonymsAnalysisTest19.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.weekly", indexReader28, (int) (short) 100, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService33);
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest19.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService36);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(5);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.weekly", postingsEnum41, postingsEnum42, false);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest0.analysisService = analysisService46;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader49, 10, postingsEnum51, postingsEnum52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 3);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 'a', 100L);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 4);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5629");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader14, (int) (short) 0, postingsEnum16, postingsEnum17);
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest20.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest20.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest20.analysisService = analysisService29;
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest20.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) ' ', 0L);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5631");
        float[] floatArray0 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 5);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) (short) 0);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray28, (float) 10);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray33, (float) 5);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray33, floatArray39, 100.0f);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) (short) 0);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray51, (float) 10);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray56, (float) 5);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) (short) 0);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray67, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray51, floatArray62, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray62, (float) (byte) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray18, floatArray62, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray62, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray6, (float) (-1));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5632");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        synonymsAnalysisTest26.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest29.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest29.logger;
        synonymsAnalysisTest29.setUp();
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest26.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest26.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest51.setUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest51.assertDocsSkippingEquals("hi!", indexReader54, 0, postingsEnum56, postingsEnum57, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = synonymsAnalysisTest51.analysisService;
        synonymsAnalysisTest51.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest51.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest51);
        synonymsAnalysisTest51.ensureAllSearchContextsReleased();
        synonymsAnalysisTest51.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) analysisService50, (java.lang.Object) synonymsAnalysisTest51);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        synonymsAnalysisTest51.assertTermsEquals("", indexReader69, terms70, terms71, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray11, (java.lang.Object) indexReader69);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5633");
        java.lang.Object obj0 = null;
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray11, intArray13);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray6, intArray13);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray24, intArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray19, intArray26);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray26);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("", intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("", intArray26, intArray36);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) intArray26);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("", intArray44, intArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray26, intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) intArray26);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5634");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj1, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest2.analysisService = analysisService8;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray14, intArray16);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray22, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("", intArray30, intArray32);
        org.junit.Assert.assertArrayEquals(intArray22, intArray30);
        org.junit.Assert.assertArrayEquals(intArray16, intArray30);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray47, intArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray42, intArray49);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray60, intArray62);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray55, intArray62);
        org.junit.Assert.assertArrayEquals("", intArray42, intArray62);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("", intArray70, intArray72);
        org.junit.Assert.assertArrayEquals("", intArray62, intArray72);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) intArray62);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("", intArray80, intArray82);
        org.junit.Assert.assertArrayEquals(intArray62, intArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray16, intArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5635");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray10);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) charArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5636");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.analysisService = analysisService10;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest12.logger;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest12.assertFieldsEquals("random", indexReader17, fields18, fields19, true);
        synonymsAnalysisTest12.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest23.analysisService;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest23.assertFieldsEquals("random", indexReader34, fields35, fields36, true);
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("", indexReader42, (int) (byte) 100, postingsEnum44, postingsEnum45, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest23.analysisService;
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest23.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5637");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, false);
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        java.lang.String str19 = synonymsAnalysisTest7.getTestName();
        synonymsAnalysisTest7.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest7.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest7);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService24);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 1, (float) 10, (float) (byte) -1);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5639");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("", charArray6, charArray13);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray6);
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        org.junit.Assert.assertArrayEquals(charArray3, charArray20);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray29);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray45);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray35, charArray38);
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertArrayEquals(charArray35, charArray52);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray61);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray61, charArray65);
        org.junit.Assert.assertArrayEquals(charArray3, charArray61);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest69, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger72 = synonymsAnalysisTest69.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = null;
        synonymsAnalysisTest69.setanalysisService(analysisService73);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        synonymsAnalysisTest69.assertDocsSkippingEquals("<unknown>", indexReader76, (-1), postingsEnum78, postingsEnum79, true);
        synonymsAnalysisTest69.overrideTestDefaultQueryCache();
        synonymsAnalysisTest69.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger84 = synonymsAnalysisTest69.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService85 = null;
        synonymsAnalysisTest69.analysisService = analysisService85;
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        synonymsAnalysisTest69.assertTermsEquals("tests.failfast", indexReader88, terms89, terms90, true);
        synonymsAnalysisTest69.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray61, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5640");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.slow", indexReader4, terms5, terms6, true);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest10.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest10.logger;
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        synonymsAnalysisTest10.assertTermsEquals("", indexReader24, terms25, terms26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) eSLogger9, (java.lang.Object) terms26);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5641");
        short[] shortArray1 = null;
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
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray9, shortArray38);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray67);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray77);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray82);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray87, shortArray88);
        short[] shortArray91 = new short[] {};
        short[] shortArray92 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray91, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray88, shortArray91);
        org.junit.Assert.assertArrayEquals("random", shortArray77, shortArray91);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray1, shortArray67);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (-1), (double) 100.0f);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) 5, (float) 3);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) '#', (double) 0L);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5645");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray6, obj17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray22, (java.lang.Object) (-1.0f));
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray22);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
        java.lang.Object obj49 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray38, obj49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray54, (java.lang.Object) (-1.0f));
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray54);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 'a');
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 10, (long) 2);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5648");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
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
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest34.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest34.setanalysisService(analysisService36);
        synonymsAnalysisTest34.setUp();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest34.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("hi!", indexReader43, 0, postingsEnum45, postingsEnum46, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest40);
        synonymsAnalysisTest40.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) testRule39, (java.lang.Object) synonymsAnalysisTest40);
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = null;
        synonymsAnalysisTest40.setanalysisService(analysisService56);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest58.setUp();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest58.assertDocsSkippingEquals("hi!", indexReader61, 0, postingsEnum63, postingsEnum64, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService67 = synonymsAnalysisTest58.analysisService;
        synonymsAnalysisTest58.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest58.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger71 = synonymsAnalysisTest58.logger;
        synonymsAnalysisTest58.setUp();
        synonymsAnalysisTest58.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain75 = synonymsAnalysisTest58.failureAndSuccessEvents;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain75;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain75);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5649");
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
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.badapples", (int) (short) 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0d, (double) 0.0f);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) '#', (float) 1L);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5652");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) testRule9);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5653");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray11);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray26);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray31, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray2);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5654");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray19, throttlingArray20, throttlingArray21, throttlingArray22, throttlingArray23, throttlingArray24 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray26, throttlingArray27, throttlingArray28, throttlingArray29, throttlingArray30, throttlingArray31 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray37 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray38 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray33, throttlingArray34, throttlingArray35, throttlingArray36, throttlingArray37, throttlingArray38 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray40, throttlingArray41, throttlingArray42, throttlingArray43, throttlingArray44, throttlingArray45 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray50 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray51 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray47, throttlingArray48, throttlingArray49, throttlingArray50, throttlingArray51, throttlingArray52 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][][] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][][] { throttlingArray25, throttlingArray32, throttlingArray39, throttlingArray46, throttlingArray53 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][]> throttlingArrayList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, throttlingArray54);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][]> throttlingArrayList56 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) throttlingArray54);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) (byte) 10);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (byte) 0);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5657");
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
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5658");
        java.lang.Class[][][][][] classArray2 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray3 = (java.lang.Class<?>[][][][][]) classArray2;
        java.util.List<java.lang.Class<?>[][][][]> wildcardClassArrayList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, wildcardClassArray3);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray8, (java.lang.Object) (-1.0f));
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray21, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.lang.Object obj27 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray16, obj27);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray16);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray3, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) (byte) 10);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5660");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet5 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray4);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray15, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray27, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray4, (java.lang.Object[]) executorServiceArray15);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5661");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) (byte) -1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 'a', (double) 100L);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5663");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray1, throttlingArray2, throttlingArray3 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray5, throttlingArray6, throttlingArray7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray12 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray9, throttlingArray10, throttlingArray11 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray13, throttlingArray14, throttlingArray15 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray17, throttlingArray18, throttlingArray19 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][][] { throttlingArray4, throttlingArray8, throttlingArray12, throttlingArray16, throttlingArray20 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][]> throttlingArrayList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, throttlingArray21);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][]> throttlingArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray21);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][]> throttlingArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray21);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][]> throttlingArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray21);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 100, (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5665");
        int[] intArray0 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray10);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray16, intArray23);
        org.junit.Assert.assertArrayEquals("", intArray3, intArray23);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray33, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("", intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray35, intArray43);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray50, intArray52);
        org.junit.Assert.assertArrayEquals("hi!", intArray43, intArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest57.setUp();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        synonymsAnalysisTest57.assertDocsSkippingEquals("hi!", indexReader60, 0, postingsEnum62, postingsEnum63, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = synonymsAnalysisTest57.analysisService;
        synonymsAnalysisTest57.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest57.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger70 = synonymsAnalysisTest57.logger;
        synonymsAnalysisTest57.setUp();
        synonymsAnalysisTest57.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest57.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService75 = synonymsAnalysisTest57.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = null;
        synonymsAnalysisTest57.analysisService = analysisService76;
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray43, (java.lang.Object) synonymsAnalysisTest57);
        org.junit.Assert.assertArrayEquals(intArray3, intArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray43);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5666");
        java.util.Locale[][] localeArray0 = new java.util.Locale[][] {};
        java.util.Locale[][][] localeArray1 = new java.util.Locale[][][] { localeArray0 };
        java.util.Locale[][] localeArray2 = new java.util.Locale[][] {};
        java.util.Locale[][][] localeArray3 = new java.util.Locale[][][] { localeArray2 };
        java.util.Locale[][][][] localeArray4 = new java.util.Locale[][][][] { localeArray1, localeArray3 };
        java.util.Set<java.util.Locale[][][]> localeArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray4);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray10, (java.lang.Object) (-1.0f));
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
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
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray22);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
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
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray4, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5667");
        byte[] byteArray0 = null;
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
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray40, byteArray41);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0.0f, (double) 5);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5669");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '#', (long) '4');
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 2, (double) (byte) 10);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5671");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 0L, (double) 4);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5672");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest9.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.nightly", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest9.analysisService = analysisService17;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest9.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest22.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest22.getanalysisService();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) analysisService26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest9.setanalysisService(analysisService28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5673");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 2, (double) '4');
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5674");
        java.lang.Object obj2 = null;
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotSame("tests.awaitsfix", obj2, (java.lang.Object) executorServiceArray21);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray33, strArray37, strArray41, strArray45, strArray49 };
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.badapples", "tests.badapples", "tests.nightly" };
        java.lang.String[][] strArray71 = new java.lang.String[][] { strArray54, strArray58, strArray62, strArray66, strArray70 };
        java.lang.String[][][] strArray72 = new java.lang.String[][][] { strArray50, strArray71 };
        java.util.Set<java.lang.String[][]> strArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) strArray72);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5675");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray57);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray20);
        org.elasticsearch.index.analysis.AnalysisService analysisService80 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService80);
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum83, postingsEnum84);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5676");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 'a', (float) (short) 0);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5677");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) (-1), (long) (-1));
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5678");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest1.analysisService = analysisService4;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest6.getanalysisService();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService25);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest1.analysisService = analysisService27;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.weekly", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest38.setUp();
        synonymsAnalysisTest38.ensureCheckIndexPassed();
        synonymsAnalysisTest38.ensureCleanedUp();
        synonymsAnalysisTest38.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest38.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) ruleChain43);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5679");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest0.ruleChain;
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule17, obj18);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5680");
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
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray18, obj29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray18);
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
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray69, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray69);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str76 = synonymsAnalysisTest75.getTestName();
        synonymsAnalysisTest75.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService78 = synonymsAnalysisTest75.analysisService;
        synonymsAnalysisTest75.ensureCleanedUp();
        synonymsAnalysisTest75.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest81 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService82 = synonymsAnalysisTest81.getanalysisService();
        synonymsAnalysisTest81.overrideTestDefaultQueryCache();
        synonymsAnalysisTest81.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService85 = synonymsAnalysisTest81.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest75, (java.lang.Object) synonymsAnalysisTest81);
        org.elasticsearch.common.logging.ESLogger eSLogger87 = synonymsAnalysisTest81.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray48, (java.lang.Object) synonymsAnalysisTest81);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray48);
        java.lang.Object[] objArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, objArray90);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5681");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, false);
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        java.lang.String str19 = synonymsAnalysisTest7.getTestName();
        synonymsAnalysisTest7.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest7.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest7);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) 1);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", 100L, (long) 100);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5684");
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
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray22);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray27);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        org.junit.Assert.assertArrayEquals("random", shortArray22, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest43.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = null;
        synonymsAnalysisTest43.setanalysisService(analysisService45);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) shortArray12, (java.lang.Object) analysisService45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray50);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray50, shortArray60);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest63.getanalysisService();
        synonymsAnalysisTest63.overrideTestDefaultQueryCache();
        synonymsAnalysisTest63.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger67 = synonymsAnalysisTest63.logger;
        synonymsAnalysisTest63.ensureAllSearchContextsReleased();
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray70, shortArray71);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray74, shortArray75);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest63, (java.lang.Object) shortArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray50, shortArray71);
        short[] shortArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray85);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5685");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService8);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest1.analysisService = analysisService10;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14, false);
        java.lang.String str17 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest20.logger;
        java.lang.Object obj23 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.getanalysisService();
        synonymsAnalysisTest24.overrideTestDefaultQueryCache();
        synonymsAnalysisTest24.overrideTestDefaultQueryCache();
        synonymsAnalysisTest24.setUp();
        org.junit.Assert.assertNotEquals(obj23, (java.lang.Object) synonymsAnalysisTest24);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest24.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest24.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) eSLogger31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest20.assertTermsEquals("<unknown>", indexReader34, terms35, terms36, false);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest20);
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
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest40.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest59.setUp();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        synonymsAnalysisTest59.assertDocsSkippingEquals("hi!", indexReader62, 0, postingsEnum64, postingsEnum65, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = synonymsAnalysisTest59.analysisService;
        org.junit.rules.RuleChain ruleChain69 = synonymsAnalysisTest59.failureAndSuccessEvents;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain69;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain69);
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain69;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain69;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain69);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5686");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService6);
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest2.analysisService = analysisService9;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest13.getanalysisService();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.maxfailures", indexReader22, (int) '#', postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest13.assertTermsEquals("tests.monster", indexReader29, terms30, terms31, false);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) terms31);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocValuesEquals("tests.awaitsfix", (-1), numericDocValues37, numericDocValues38);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 100L, (double) 100L);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5688");
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
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.tearDown();
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest29, obj33);
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest29.analysisService = analysisService36;
        synonymsAnalysisTest29.setUp();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest29);
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.slow", (int) (byte) 100, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5689");
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray68, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray68);
        java.lang.Object obj74 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray63, obj74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray79, (java.lang.Object) (-1.0f));
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray63);
        java.lang.Object[] objArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray63, objArray87);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5690");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("hi!", indexReader13, 0, postingsEnum15, postingsEnum16, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest10.analysisService = analysisService23;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest10.assertTermsEquals("enwiki.random.lines.txt", indexReader29, terms30, terms31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.maxfailures", postingsEnum35, postingsEnum36, true);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) true);
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 5, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 100L, 0.0d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5692");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService17);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest1.getlogger();
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertPathHasBeenCleared("");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1L), 0L);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5694");
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
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5695");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet2 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray13);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest37, (java.lang.Object) 100.0f);
        synonymsAnalysisTest37.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest37);
        synonymsAnalysisTest37.ensureAllSearchContextsReleased();
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
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest37, (java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) annotatedElementArray1, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5696");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5697");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 10L);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5698");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray33, (java.lang.Object) (-1.0f));
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray74, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray82, (java.lang.Object) (-1.0f));
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray82, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray45);
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.lang.Object[] objArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, objArray94);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5699");
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
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) (byte) 1);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5701");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest24.getlogger();
        java.lang.String str32 = synonymsAnalysisTest24.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) str32);
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest2.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5703");
        short[] shortArray0 = null;
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
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray38);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        org.junit.Assert.assertArrayEquals("random", shortArray38, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray38);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray60);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray69, shortArray70);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray28, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray28);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray85, shortArray86);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray12);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10L, (-1.0d));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5705");
        java.lang.Object[] objArray0 = null;
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
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        java.lang.Object obj68 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray57, obj68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray57);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5706");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, false);
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.failfast", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService28);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        synonymsAnalysisTest21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest21.assertTermsEquals("", indexReader33, terms34, terms35, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) ' ', (double) (short) -1);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5708");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray2 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray2);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray2);
        java.lang.Object[] objArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, objArray5);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5709");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum8, postingsEnum9, true);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) 100.0f);
        synonymsAnalysisTest13.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService18);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest13.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.badapples", indexReader22, 1, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest13.logger;
        synonymsAnalysisTest13.tearDown();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger12, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5710");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray6, obj17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray26, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray26);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray26);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest49.getanalysisService();
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        synonymsAnalysisTest49.tearDown();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest49.analysisService;
        synonymsAnalysisTest49.ensureCheckIndexPassed();
        synonymsAnalysisTest49.setUp();
        java.lang.String str57 = synonymsAnalysisTest49.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean48, (java.lang.Object) str57);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5711");
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
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray22, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
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
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray48, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray42, (double) 10.0f);
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) 0L);
        double[] doubleArray67 = new double[] {};
        double[] doubleArray68 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray67, doubleArray68, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray63, doubleArray68, (double) (-1));
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) 0L);
        double[] doubleArray78 = new double[] {};
        double[] doubleArray79 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray79, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray74, doubleArray79, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray74, (double) 4);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray42, doubleArray74, (double) ' ');
        org.junit.Assert.assertArrayEquals("random", doubleArray6, doubleArray74, 0.0d);
        double[] doubleArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray90, (double) (byte) 0);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5712");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5713");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray13);
        org.junit.Assert.assertArrayEquals(longArray5, longArray13);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray22, longArray23);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        org.junit.Assert.assertArrayEquals(longArray23, longArray27);
        org.junit.Assert.assertArrayEquals(longArray19, longArray23);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray23);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray44, longArray45);
        org.junit.Assert.assertArrayEquals("", longArray36, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray49, longArray50);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray53, longArray54);
        org.junit.Assert.assertArrayEquals(longArray49, longArray53);
        org.junit.Assert.assertArrayEquals("", longArray45, longArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray23, longArray45);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray61, longArray62);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray66);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray70, longArray71);
        org.junit.Assert.assertArrayEquals("", longArray62, longArray71);
        org.junit.Assert.assertArrayEquals(longArray45, longArray71);
        long[] longArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray45, longArray75);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5714");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        short[][] shortArray8 = new short[][] { shortArray2, shortArray3, shortArray4, shortArray5, shortArray6, shortArray7 };
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[][] shortArray15 = new short[][] { shortArray9, shortArray10, shortArray11, shortArray12, shortArray13, shortArray14 };
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[][] shortArray22 = new short[][] { shortArray16, shortArray17, shortArray18, shortArray19, shortArray20, shortArray21 };
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[][] shortArray29 = new short[][] { shortArray23, shortArray24, shortArray25, shortArray26, shortArray27, shortArray28 };
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        short[][] shortArray36 = new short[][] { shortArray30, shortArray31, shortArray32, shortArray33, shortArray34, shortArray35 };
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[][] shortArray43 = new short[][] { shortArray37, shortArray38, shortArray39, shortArray40, shortArray41, shortArray42 };
        short[][][] shortArray44 = new short[][][] { shortArray8, shortArray15, shortArray22, shortArray29, shortArray36, shortArray43 };
        java.util.List<short[][]> shortArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray44);
        java.util.Set<short[][]> shortArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray44);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        long[][] longArray50 = new long[][] { longArray47, longArray48, longArray49 };
        java.util.Set<long[]> longArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(longArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) shortArray44, (java.lang.Object[]) longArray50);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 10, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5716");
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
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.awaitsfix", indexReader26, (int) (byte) 100, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", 4, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5717");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest24.getlogger();
        java.lang.String str32 = synonymsAnalysisTest24.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) str32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("<unknown>", indexReader35, 5, postingsEnum37, postingsEnum38, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest2.getanalysisService();
        synonymsAnalysisTest2.tearDown();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("random", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5718");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService4);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader7, (-1), postingsEnum9, postingsEnum10, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.analysisService = analysisService16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, true);
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest0.logger;
        java.lang.Object obj25 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) eSLogger24, obj25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest27.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest30.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest33.assertDocsSkippingEquals("hi!", indexReader36, 0, postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest33.analysisService;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain43;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest30, (java.lang.Object) synonymsAnalysisTest45);
        synonymsAnalysisTest30.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest27, (java.lang.Object) synonymsAnalysisTest30);
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule67 = synonymsAnalysisTest30.ruleChain;
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain70 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        synonymsAnalysisTest30.assertTermsEquals("europarl.lines.txt.gz", indexReader72, terms73, terms74, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(obj25, (java.lang.Object) terms74);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5719");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) 0L);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 0L);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray12, (double) (-1));
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 0L);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray18, doubleArray23, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray18, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray12, (double) 10.0f);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) 0L);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) 0L);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray38, doubleArray43, (double) (-1));
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) 0L);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray49, doubleArray54, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray54, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("random", doubleArray34, doubleArray38, (double) '4');
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray12, doubleArray34, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray12, (double) 10);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 0.0d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) (byte) 10, (float) (byte) 1);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 'a', (long) (byte) 10);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5723");
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
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest22.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest22.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest22.analysisService = analysisService30;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("hi!", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        synonymsAnalysisTest32.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest32.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest32.logger;
        synonymsAnalysisTest32.setUp();
        synonymsAnalysisTest32.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain49;
        synonymsAnalysisTest22.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest22.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) boolean21, (java.lang.Object) synonymsAnalysisTest22);
        synonymsAnalysisTest22.setIndexWriterMaxDocs(10);
        java.lang.Object obj56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest22, obj56);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5724");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest9.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain22;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest24.assertDocsSkippingEquals("hi!", indexReader27, 0, postingsEnum29, postingsEnum30, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest24.analysisService;
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest24.assertPositionsSkippingEquals("tests.badapples", indexReader36, (int) (short) 10, postingsEnum38, postingsEnum39);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest9, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest9.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) synonymsAnalysisTest9);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain45;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 1, numericDocValues52, numericDocValues53);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5725");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        synonymsAnalysisTest5.setUp();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest5.ruleChain;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest5.failureAndSuccessEvents;
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
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) ruleChain34);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain34;
        synonymsAnalysisTest0.tearDown();
        java.lang.Object obj38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, obj38);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5726");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain28;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        synonymsAnalysisTest30.ensureCheckIndexPassed();
        synonymsAnalysisTest30.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest30.analysisService;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.weekly", indexReader36, fields37, fields38, false);
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        java.lang.String str42 = synonymsAnalysisTest30.getTestName();
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest30);
        synonymsAnalysisTest30.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("<unknown>", indexReader49, (int) (byte) 10, postingsEnum51, postingsEnum52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum51);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5727");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.getanalysisService();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) 100.0f);
        synonymsAnalysisTest18.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService23);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest18.analysisService;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest27.analysisService;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest27.assertFieldsEquals("tests.weekly", indexReader33, fields34, fields35, false);
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        java.lang.String str39 = synonymsAnalysisTest27.getTestName();
        synonymsAnalysisTest27.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest27.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        synonymsAnalysisTest43.ensureCheckIndexPassed();
        synonymsAnalysisTest43.ensureCleanedUp();
        synonymsAnalysisTest43.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest43.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain48;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain48;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain48;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("random", postingsEnum56, postingsEnum57);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) '#', (double) 1.0f);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5729");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest18);
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest18.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest18.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5730");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest3.getlogger();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest3.assertTermsEquals("tests.nightly", indexReader12, terms13, terms14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest3.getanalysisService();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest20.ruleChain;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) testRule28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest30.logger;
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest30.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5731");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
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
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest3);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest3.assertTermsEquals("hi!", indexReader40, terms41, terms42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.maxfailures", indexReader46, fields47, fields48, true);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest3.assertDocsEnumEquals("tests.slow", postingsEnum52, postingsEnum53, true);
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues59 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocValuesEquals("<unknown>", (int) (byte) -1, numericDocValues59, numericDocValues60);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5732");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.failfast", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService25);
        java.lang.String str27 = synonymsAnalysisTest18.getTestName();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest30.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest30.analysisService = analysisService33;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest35.getanalysisService();
        synonymsAnalysisTest35.overrideTestDefaultQueryCache();
        synonymsAnalysisTest35.tearDown();
        java.lang.Object obj39 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest35, obj39);
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest35.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = null;
        synonymsAnalysisTest35.analysisService = analysisService42;
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest35.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest62.setUp();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        synonymsAnalysisTest62.assertDocsSkippingEquals("hi!", indexReader65, 0, postingsEnum67, postingsEnum68, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = synonymsAnalysisTest62.analysisService;
        org.junit.rules.RuleChain ruleChain72 = synonymsAnalysisTest62.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain72;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain72;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain72;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain72;
        org.elasticsearch.common.logging.ESLogger eSLogger77 = synonymsAnalysisTest18.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest78 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest78.setUp();
        synonymsAnalysisTest78.ensureCheckIndexPassed();
        synonymsAnalysisTest78.ensureCleanedUp();
        synonymsAnalysisTest78.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService83 = synonymsAnalysisTest78.getanalysisService();
        synonymsAnalysisTest78.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule85 = synonymsAnalysisTest78.ruleChain;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) testRule85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5733");
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.lang.Object[] objArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) localeArray1, objArray4);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5734");
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
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader28, fields29, fields30, true);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5735");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest2.assertFieldsEquals("random", indexReader13, fields14, fields15, true);
        java.lang.String str18 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader21, (int) (short) 10, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader27, terms28, terms29, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest32, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest32.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest32.setanalysisService(analysisService36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("<unknown>", indexReader39, (-1), postingsEnum41, postingsEnum42, true);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest32.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest32.ruleChain;
        synonymsAnalysisTest32.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) terms29, (java.lang.Object) synonymsAnalysisTest32);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.monster", indexReader50, fields51, fields52, true);
        synonymsAnalysisTest32.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest32.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest32);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5736");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
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
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest3);
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest3.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues43, numericDocValues44);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1L, (long) (short) 10);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5738");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.awaitsfix", indexReader12, terms13, terms14, true);
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader19, (int) '4', postingsEnum21, postingsEnum22, true);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest27.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("hi!", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest32.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest32.assertPositionsSkippingEquals("tests.badapples", indexReader44, (int) (short) 10, postingsEnum46, postingsEnum47);
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain49;
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = null;
        synonymsAnalysisTest27.analysisService = analysisService52;
        synonymsAnalysisTest27.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger59 = synonymsAnalysisTest56.getlogger();
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest56.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        synonymsAnalysisTest56.assertFieldsEquals("tests.awaitsfix", indexReader62, fields63, fields64, false);
        synonymsAnalysisTest56.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest56);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = synonymsAnalysisTest56.getanalysisService();
        synonymsAnalysisTest56.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) eSLogger25, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5739");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService6);
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest2.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) genericDeclarationArray0, (java.lang.Object) synonymsAnalysisTest2);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest13.getlogger();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.Class<?> wildcardClass21 = synonymsAnalysisTest13.getClass();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray29);
        java.lang.Class<?> wildcardClass31 = charSequenceArray29.getClass();
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) wildcardClass31, obj32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest34.assertDocsEnumEquals("tests.nightly", postingsEnum37, postingsEnum38, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest34.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = null;
        synonymsAnalysisTest34.analysisService = analysisService42;
        java.lang.Class<?> wildcardClass44 = synonymsAnalysisTest34.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray45 = new java.lang.reflect.GenericDeclaration[] { wildcardClass21, wildcardClass31, wildcardClass44 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, genericDeclarationArray45);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray0, (java.lang.Object[]) genericDeclarationArray45);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) (short) 0, (long) (byte) 0);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5741");
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
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray73 = new java.util.concurrent.ExecutorService[][] { executorServiceArray67, executorServiceArray68, executorServiceArray69, executorServiceArray70, executorServiceArray71, executorServiceArray72 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray73);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5742");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5743");
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
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("hi!", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest31.analysisService;
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest31.assertPositionsSkippingEquals("tests.badapples", indexReader43, (int) (short) 10, postingsEnum45, postingsEnum46);
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest16, (java.lang.Object) synonymsAnalysisTest31);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5744");
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
        org.junit.Assert.assertArrayEquals(longArray26, longArray30);
        org.junit.Assert.assertArrayEquals(longArray13, longArray30);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray41);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray13);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray48, longArray49);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray48, longArray52);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray57, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray61, longArray62);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray65, longArray66);
        org.junit.Assert.assertArrayEquals(longArray62, longArray66);
        org.junit.Assert.assertArrayEquals(longArray58, longArray66);
        long[] longArray71 = new long[] {};
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray71, longArray72);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray75, longArray76);
        org.junit.Assert.assertArrayEquals(longArray71, longArray75);
        org.junit.Assert.assertArrayEquals(longArray58, longArray75);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray48, longArray58);
        org.junit.Assert.assertArrayEquals(longArray13, longArray58);
        long[] longArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray58, longArray82);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1L), (double) 10, (-1.0d));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5746");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest21.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("<unknown>", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest21.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest21.analysisService = analysisService37;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest21.assertTermsEquals("tests.failfast", indexReader40, terms41, terms42, true);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest21.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest21.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = null;
        synonymsAnalysisTest21.analysisService = analysisService47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService47);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5747");
        java.lang.Object obj1 = null;
        java.util.Locale[][] localeArray2 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        java.util.Set<java.util.Locale[]> localeArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", obj1, (java.lang.Object) localeArraySet4);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", 10L, (long) (byte) 10);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5749");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 3, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1, (double) 10, (double) (short) -1);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1.0d), (double) 0.0f);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5752");
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
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray21, (java.lang.Object) executorServiceArray32);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
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
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray73, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray61);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray61);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling84 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling87 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling88 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray89 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling83, throttling84, throttling85, throttling86, throttling87, throttling88 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet90 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) throttlingArray89);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 4);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0L, (long) ' ');
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5755");
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray10 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray14 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray15 = new short[][] { shortArray6, shortArray10, shortArray14 };
        java.util.List<short[]> shortArrayList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray15);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray15);
        java.util.List<short[]> shortArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, shortArray15);
        java.util.Set<short[]> shortArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest21.assertDocsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24, true);
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        synonymsAnalysisTest21.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("hi!", indexReader34, 0, postingsEnum36, postingsEnum37, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = null;
        synonymsAnalysisTest31.setanalysisService(analysisService40);
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest31.logger;
        java.lang.Object obj43 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest31, obj43);
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest31.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest46.logger;
        synonymsAnalysisTest46.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest21, synonymsAnalysisTest31, synonymsAnalysisTest46 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet51 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray50);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet52 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray50);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet53 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray50);
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray50);
        java.util.Set<org.junit.Assert> assertSet55 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) synonymsAnalysisTestArray50);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) shortArray15, (java.lang.Object[]) synonymsAnalysisTestArray50);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) '#');
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 10, (double) 10L);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5758");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5759");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5760");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) genericDeclarationArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray11);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray39, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
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
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray64, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray52);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray34, (java.lang.Object) (-1));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 0.0f, (float) (-1));
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, 10L);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5763");
        java.util.concurrent.ExecutorService[][][] executorServiceArray1 = new java.util.concurrent.ExecutorService[][][] {};
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest4.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest4.setanalysisService(analysisService8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("<unknown>", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest4.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.setUp();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest19.ruleChain;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest33.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("hi!", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest36.analysisService;
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain46;
        org.junit.rules.TestRule[] testRuleArray48 = new org.junit.rules.TestRule[] { testRule18, ruleChain31, ruleChain46 };
        org.junit.rules.TestRule[][] testRuleArray49 = new org.junit.rules.TestRule[][] { testRuleArray48 };
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray49);
        java.util.List<org.junit.rules.TestRule[]> testRuleArrayList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, testRuleArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) testRuleArray49);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5764");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest0.failureAndSuccessEvents;
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
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.monster", indexReader32, (int) (byte) 10, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader38, (int) '#', postingsEnum40, postingsEnum41);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) ' ', numericDocValues46, numericDocValues47);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5765");
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
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray27, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str34 = synonymsAnalysisTest33.getTestName();
        synonymsAnalysisTest33.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest33.analysisService;
        synonymsAnalysisTest33.ensureCleanedUp();
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest39.getanalysisService();
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest39.analysisService;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest33, (java.lang.Object) synonymsAnalysisTest39);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest39.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest39);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5766");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures15, testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures20 };
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray32 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures23, testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures26, testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures31 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures37);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures39);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures41);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray43 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures36, testRuleIgnoreAfterMaxFailures37, testRuleIgnoreAfterMaxFailures39, testRuleIgnoreAfterMaxFailures42 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray44 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray21, testRuleIgnoreAfterMaxFailuresArray32, testRuleIgnoreAfterMaxFailuresArray43 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray45 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray44 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray45);
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
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray62, (java.lang.Object) (-1.0f));
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray62, (java.lang.Object) (byte) 0);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray45, (java.lang.Object[]) executorServiceArray62);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5767");
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
        org.elasticsearch.common.logging.ESLogger eSLogger83 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues87 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 100, numericDocValues87, numericDocValues88);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5768");
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
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum19, postingsEnum20, true);
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5769");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService11);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5770");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.analysisService = analysisService2;
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader6, terms7, terms8, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest21.assertFieldsEquals("random", indexReader32, fields33, fields34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        synonymsAnalysisTest21.assertTermsEquals("tests.weekly", indexReader38, terms39, terms40, false);
        synonymsAnalysisTest21.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("tests.badapples", indexReader57, (int) (short) 10, postingsEnum59, postingsEnum60);
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain62;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) ruleChain62);
        synonymsAnalysisTest11.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest66 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService67 = synonymsAnalysisTest66.getanalysisService();
        synonymsAnalysisTest66.overrideTestDefaultQueryCache();
        synonymsAnalysisTest66.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) synonymsAnalysisTest66);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str72 = synonymsAnalysisTest71.getTestName();
        synonymsAnalysisTest71.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService74 = synonymsAnalysisTest71.analysisService;
        synonymsAnalysisTest71.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = synonymsAnalysisTest71.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        synonymsAnalysisTest71.assertDocsEnumEquals("tests.awaitsfix", postingsEnum78, postingsEnum79, true);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) synonymsAnalysisTest71);
        synonymsAnalysisTest71.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest85 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest85.setUp();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum91 = null;
        synonymsAnalysisTest85.assertDocsSkippingEquals("hi!", indexReader88, 0, postingsEnum90, postingsEnum91, true);
        org.junit.rules.TestRule testRule94 = synonymsAnalysisTest85.ruleChain;
        synonymsAnalysisTest85.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest85.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest71, (java.lang.Object) synonymsAnalysisTest85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms8, (java.lang.Object) synonymsAnalysisTest85);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (-1), (long) 5);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 0.0d, 0.0d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5773");
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
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray61, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray69, (java.lang.Object) (-1.0f));
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray69);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest77.setUp();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        synonymsAnalysisTest77.assertDocsSkippingEquals("hi!", indexReader80, 0, postingsEnum82, postingsEnum83, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest77.analysisService;
        synonymsAnalysisTest77.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest77.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger90 = synonymsAnalysisTest77.logger;
        synonymsAnalysisTest77.setUp();
        synonymsAnalysisTest77.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain93 = synonymsAnalysisTest77.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) "hi!", (java.lang.Object) synonymsAnalysisTest77);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5774");
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
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest0.getlogger();
        java.lang.Object obj41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, obj41);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 1L, (float) (short) 1);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, 10L);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5777");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj1, (java.lang.Object) synonymsAnalysisTest2);
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest2.analysisService = analysisService9;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        synonymsAnalysisTest15.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest15);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray30, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray43, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray43);
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray56);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) executorServiceArray56);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest80 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest80.setUp();
        synonymsAnalysisTest80.ensureCheckIndexPassed();
        synonymsAnalysisTest80.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService84 = synonymsAnalysisTest80.analysisService;
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        org.apache.lucene.index.Fields fields88 = null;
        synonymsAnalysisTest80.assertFieldsEquals("tests.weekly", indexReader86, fields87, fields88, false);
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.Terms terms93 = null;
        org.apache.lucene.index.Terms terms94 = null;
        synonymsAnalysisTest80.assertTermsEquals("europarl.lines.txt.gz", indexReader92, terms93, terms94, false);
        org.junit.rules.RuleChain ruleChain97 = synonymsAnalysisTest80.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain97;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService12, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5778");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray10);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0f), (float) (short) 10, (float) 10);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) -1, (-1L));
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5781");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.slow", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest1.tearDown();
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5782");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        synonymsAnalysisTest5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest5.assertFieldsEquals("", indexReader11, fields12, fields13, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) longArray2, (java.lang.Object) indexReader11);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5783");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5784");
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
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest33.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest33.assertDocsEnumEquals("tests.nightly", postingsEnum36, postingsEnum37, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest33.setanalysisService(analysisService41);
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest33.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger44);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5785");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray19, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray11, byteArray16);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray36, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray40, byteArray41);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray46);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray11, byteArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray37);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5786");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", obj1, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.ensureCheckIndexPassed();
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest9.analysisService;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.weekly", indexReader15, fields16, fields17, false);
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        java.lang.String str21 = synonymsAnalysisTest9.getTestName();
        synonymsAnalysisTest9.setIndexWriterMaxDocs((int) '4');
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest9.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, true);
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest9.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) eSLogger31);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5787");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
        org.junit.Assert.assertArrayEquals(longArray2, longArray10);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray19);
        org.junit.Assert.assertArrayEquals(longArray2, longArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray19, (java.lang.Object) 100.0d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5788");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (byte) -1);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5789");
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
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.weekly", indexReader20, fields21, fields22, false);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        java.lang.String str26 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        synonymsAnalysisTest29.ensureCheckIndexPassed();
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest29.analysisService;
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
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain51;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain51);
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (short) 10, (double) 10);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5791");
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
        synonymsAnalysisTest0.tearDown();
        java.lang.String str13 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5792");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest22.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest25.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain35;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest37.assertDocsSkippingEquals("hi!", indexReader40, 0, postingsEnum42, postingsEnum43, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest37.analysisService;
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest37.assertPositionsSkippingEquals("tests.badapples", indexReader49, (int) (short) 10, postingsEnum51, postingsEnum52);
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) synonymsAnalysisTest37);
        synonymsAnalysisTest37.setUp();
        synonymsAnalysisTest37.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRule20, (java.lang.Object) synonymsAnalysisTest37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) testRule20);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5793");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.analysisService = analysisService9;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (byte) 10, (float) (byte) 100, (float) '4');
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5795");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest7.analysisService = analysisService9;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.getanalysisService();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest7);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest7.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest14.logger;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest14.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        synonymsAnalysisTest14.setUp();
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
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("", indexReader44, (int) (byte) 100, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest25.analysisService;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest25.failureAndSuccessEvents;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain51;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest53.getanalysisService();
        synonymsAnalysisTest53.overrideTestDefaultQueryCache();
        synonymsAnalysisTest53.tearDown();
        java.lang.Object obj57 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest53, obj57);
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest53.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = null;
        synonymsAnalysisTest53.analysisService = analysisService60;
        org.elasticsearch.index.analysis.AnalysisService analysisService62 = synonymsAnalysisTest53.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest63.setUp();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        synonymsAnalysisTest63.assertDocsSkippingEquals("hi!", indexReader66, 0, postingsEnum68, postingsEnum69, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService72 = synonymsAnalysisTest63.analysisService;
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest63.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        synonymsAnalysisTest63.assertPositionsSkippingEquals("tests.badapples", indexReader75, (int) (short) 10, postingsEnum77, postingsEnum78);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest80 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest80.setUp();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest80.assertDocsSkippingEquals("hi!", indexReader83, 0, postingsEnum85, postingsEnum86, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = synonymsAnalysisTest80.analysisService;
        org.junit.rules.RuleChain ruleChain90 = synonymsAnalysisTest80.failureAndSuccessEvents;
        synonymsAnalysisTest63.failureAndSuccessEvents = ruleChain90;
        synonymsAnalysisTest53.failureAndSuccessEvents = ruleChain90;
        org.junit.rules.RuleChain ruleChain93 = synonymsAnalysisTest53.failureAndSuccessEvents;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain93;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) synonymsAnalysisTest14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 1.0d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5797");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest3.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest8.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("tests.badapples", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23);
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest8.failureAndSuccessEvents;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain25;
        java.lang.Class<?> wildcardClass27 = ruleChain25.getClass();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) wildcardClass27);
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass27;
        java.util.List<java.lang.Class<?>> wildcardClassList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, wildcardClassArray31);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray31);
        java.util.Set<java.lang.Class<?>> wildcardClassSet36 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray31);
        java.util.Set<java.lang.Class<?>> wildcardClassSet37 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray31);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray31);
        java.lang.Object[] objArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) wildcardClassArray31, objArray39);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 100, (long) 4);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5799");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        synonymsAnalysisTest16.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest16.analysisService;
        synonymsAnalysisTest16.ensureCleanedUp();
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5800");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertNotSame("tests.awaitsfix", obj1, (java.lang.Object) executorServiceArray20);
        short[] shortArray30 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray33 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray36 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray39 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray42 = new short[] { (short) 0, (byte) 0 };
        short[][] shortArray43 = new short[][] { shortArray30, shortArray33, shortArray36, shortArray39, shortArray42 };
        short[] shortArray46 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray49 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray52 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray55 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray58 = new short[] { (short) 0, (byte) 0 };
        short[][] shortArray59 = new short[][] { shortArray46, shortArray49, shortArray52, shortArray55, shortArray58 };
        short[] shortArray62 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray65 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray68 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray71 = new short[] { (short) 0, (byte) 0 };
        short[] shortArray74 = new short[] { (short) 0, (byte) 0 };
        short[][] shortArray75 = new short[][] { shortArray62, shortArray65, shortArray68, shortArray71, shortArray74 };
        short[][][] shortArray76 = new short[][][] { shortArray43, shortArray59, shortArray75 };
        short[][][][] shortArray77 = new short[][][][] { shortArray76 };
        java.util.Set<short[][][]> shortArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray77);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) shortArray77);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5801");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader11, terms12, terms13, true);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5802");
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
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader20, 1, postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5803");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
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
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest3);
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest3.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger39);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5804");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader20, (int) (short) -1, postingsEnum22, postingsEnum23);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5805");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray9);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray2, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals(intArray9, intArray15);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray20, intArray22);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray28, intArray30);
        org.junit.Assert.assertArrayEquals(intArray20, intArray30);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray37, intArray39);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("", intArray45, intArray47);
        org.junit.Assert.assertArrayEquals(intArray37, intArray47);
        org.junit.Assert.assertArrayEquals(intArray30, intArray37);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray30, intArray53);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray64, intArray66);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray59, intArray66);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray77, intArray79);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray72, intArray79);
        org.junit.Assert.assertArrayEquals("", intArray59, intArray79);
        org.junit.Assert.assertArrayEquals(intArray30, intArray79);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        org.junit.Assert.assertArrayEquals("", intArray88, intArray90);
        org.junit.Assert.assertArrayEquals(intArray30, intArray90);
        org.junit.Assert.assertArrayEquals(intArray9, intArray30);
        java.lang.Object obj96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) intArray9, obj96);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5806");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.failfast", indexReader18, (int) '4', postingsEnum20, postingsEnum21, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest24.assertDocsSkippingEquals("hi!", indexReader27, 0, postingsEnum29, postingsEnum30, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest24.analysisService;
        synonymsAnalysisTest24.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest24.tearDown();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.badapples", indexReader41, fields42, fields43, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest46.getanalysisService();
        synonymsAnalysisTest46.overrideTestDefaultQueryCache();
        synonymsAnalysisTest46.tearDown();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain50;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain50;
        org.elasticsearch.common.logging.ESLogger eSLogger53 = synonymsAnalysisTest24.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger54 = synonymsAnalysisTest24.getlogger();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) postingsEnum20, (java.lang.Object) synonymsAnalysisTest24);
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest24.getanalysisService();
        java.lang.Object obj57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) analysisService56, obj57);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5807");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals(intArray5, intArray15);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray29);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray35, intArray42);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray15);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, 1.0d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 100L, (double) 100, 1.0d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) '#', 0.0f);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 'a', 1L);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (-1));
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5813");
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
        java.util.Set<org.junit.Assert> assertSet37 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) synonymsAnalysisTestArray32);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTestArray32);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet39 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray32);
        java.lang.Object[] objArray40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) synonymsAnalysisTestArray32, objArray40);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) '#');
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5815");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest13.assertPositionsSkippingEquals("tests.weekly", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25);
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest13.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 3, (float) (byte) 10, (float) 1L);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5817");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("hi!", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest3.setanalysisService(analysisService12);
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest3.logger;
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest3, obj15);
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest19.logger;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) eSLogger30);
        synonymsAnalysisTest3.tearDown();
        java.lang.Class<?> wildcardClass33 = synonymsAnalysisTest3.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5818");
        double[][] doubleArray1 = new double[][] {};
        java.util.Set<double[]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        java.util.Set<double[]> doubleArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        java.util.List<double[]> doubleArrayList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray1);
        java.util.Set<double[]> doubleArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray27);
        org.junit.Assert.assertArrayEquals("random", shortArray13, shortArray27);
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
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray13, shortArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArraySet5, (java.lang.Object) shortArray42);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5819");
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
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5820");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray30);
        java.util.Collection[] collectionArray33 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray34 = (java.util.Collection<java.lang.CharSequence>[]) collectionArray33;
        charSequenceCollectionArray34[0] = charSequenceList7;
        charSequenceCollectionArray34[1] = charSequenceList15;
        charSequenceCollectionArray34[2] = charSequenceList23;
        charSequenceCollectionArray34[3] = charSequenceList31;
        java.util.Set<java.util.Collection<java.lang.CharSequence>> charSequenceCollectionSet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceCollectionArray34);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray55, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray55);
        java.lang.Object obj61 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray50, obj61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray74, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray86, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceCollectionArray34, (java.lang.Object[]) executorServiceArray66);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5821");
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
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5822");
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
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.ensureCleanedUp();
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest18.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "<unknown>", (java.lang.Object) eSLogger31);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 0L, (float) 2, (float) 0);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) ' ');
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (short) 10, (double) (-1L));
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5826");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.failfast", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        java.lang.String str23 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) (short) 10, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5827");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertNotSame("tests.awaitsfix", obj1, (java.lang.Object) executorServiceArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest29.analysisService;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest29.assertFieldsEquals("random", indexReader40, fields41, fields42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest29.assertPositionsSkippingEquals("tests.maxfailures", indexReader46, 0, postingsEnum48, postingsEnum49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest51.assertDocsEnumEquals("tests.badapples", postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest51.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest51.getlogger();
        java.lang.String str59 = synonymsAnalysisTest51.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest29, (java.lang.Object) str59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("<unknown>", indexReader62, 5, postingsEnum64, postingsEnum65, false);
        org.elasticsearch.common.logging.ESLogger eSLogger68 = synonymsAnalysisTest29.getlogger();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        synonymsAnalysisTest29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader71, (int) '#', postingsEnum73, postingsEnum74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        synonymsAnalysisTest29.assertFieldsEquals("random", indexReader77, fields78, fields79, true);
        synonymsAnalysisTest29.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger83 = synonymsAnalysisTest29.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest29);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5828");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader2, fields3, fields4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13, true);
        java.lang.String str16 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5829");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray4, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray11, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray37);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray37);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) executorServiceArray37);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5830");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest1.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest10.analysisService;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.weekly", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        synonymsAnalysisTest10.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, false);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray32, charArray36);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray40, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals("", charArray40, charArray47);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
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
        org.junit.Assert.assertArrayEquals(charArray60, charArray64);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray64, charArray77);
        org.junit.Assert.assertArrayEquals(charArray53, charArray64);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("", charArray64, charArray82);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray36, charArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) "<unknown>");
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Terms terms89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        synonymsAnalysisTest10.assertTermsEquals("hi!", indexReader88, terms89, terms90, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) terms89);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5831");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        synonymsAnalysisTest18.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest18.analysisService;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.weekly", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        synonymsAnalysisTest18.assertTermsEquals("europarl.lines.txt.gz", indexReader30, terms31, terms32, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService35);
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain37;
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("random", (int) 'a', numericDocValues45, numericDocValues46);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) (short) 0);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5833");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray5, (java.lang.Object) (-1.0f));
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray12, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray20);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5834");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest23.analysisService;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("tests.badapples", indexReader35, (int) (short) 10, postingsEnum37, postingsEnum38);
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest23.assertDocsSkippingEquals("tests.maxfailures", indexReader42, (int) (short) -1, postingsEnum44, postingsEnum45, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum44);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5835");
        java.lang.Object obj0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray10);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray15, charArray19);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("", charArray15, charArray22);
        org.junit.Assert.assertArrayEquals(charArray10, charArray15);
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
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("", charArray41, charArray48);
        org.junit.Assert.assertArrayEquals(charArray36, charArray41);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray36, charArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray15, charArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) charArray36);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) ' ', (double) 2);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5837");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.analysisService = analysisService17;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 'a', (float) (-1), (float) (byte) -1);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, 0.0f, (-1.0f));
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5840");
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
        synonymsAnalysisTest0.analysisService = analysisService25;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) 10, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5841");
        java.lang.Object[] objArray0 = null;
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
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray32, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray21, (java.lang.Object) executorServiceArray32);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5842");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0d, (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5843");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest5.assertDocsSkippingEquals("hi!", indexReader8, 0, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain15;
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
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest17);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("<unknown>", indexReader40, (int) (short) 10, postingsEnum42, postingsEnum43, false);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService48);
        synonymsAnalysisTest2.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest51.setUp();
        synonymsAnalysisTest51.ensureCheckIndexPassed();
        synonymsAnalysisTest51.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest51.analysisService;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        synonymsAnalysisTest51.assertFieldsEquals("tests.weekly", indexReader57, fields58, fields59, false);
        synonymsAnalysisTest51.overrideTestDefaultQueryCache();
        java.lang.String str63 = synonymsAnalysisTest51.getTestName();
        synonymsAnalysisTest51.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest51.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest51.assertPositionsSkippingEquals("tests.monster", indexReader69, (int) (byte) -1, postingsEnum71, postingsEnum72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5844");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.monster", indexReader6, 1, postingsEnum8, postingsEnum9, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest14.ruleChain;
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("", charArray26, charArray33);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray26, charArray39);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) charArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray26);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5845");
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
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest0.analysisService = analysisService28;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5846");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1.0f, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test5848");
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
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray3);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
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
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray39, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray39);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray39);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.failfast", "<unknown>", "tests.maxfailures" };
        java.lang.String[][] strArray84 = new java.lang.String[][] { strArray67, strArray71, strArray75, strArray79, strArray83 };
        java.util.Set<java.lang.String[]> strArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        java.util.List<java.lang.CharSequence[]> charSequenceArrayList86 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, (java.lang.CharSequence[][]) strArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) strArray84);
    }
}

