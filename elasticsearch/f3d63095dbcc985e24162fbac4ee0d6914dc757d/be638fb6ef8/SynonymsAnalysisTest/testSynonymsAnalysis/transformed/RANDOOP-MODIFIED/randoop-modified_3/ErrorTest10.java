import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5001");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("random", indexReader12, (-1), postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '#', (long) (byte) 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5003");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (byte) 1, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest14.getlogger();
        java.lang.String str17 = synonymsAnalysisTest14.getTestName();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain18;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain18, (java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest22.assertDocValuesEquals("tests.awaitsfix", (int) '#', numericDocValues40, numericDocValues41);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5004");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray15, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest35.analysisService = analysisService36;
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        synonymsAnalysisTest35.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray32, (java.lang.Object) synonymsAnalysisTest35);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray4);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1L));
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5006");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest26.assertFieldsEquals("tests.nightly", indexReader28, fields29, fields30, false);
        java.lang.String str33 = synonymsAnalysisTest26.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest26.analysisService;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest26.assertDocsSkippingEquals("tests.nightly", indexReader36, (int) '#', postingsEnum38, postingsEnum39, true);
        synonymsAnalysisTest26.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest26.setUp();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) synonymsAnalysisTest26);
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) intArray4, (java.lang.Object) ruleChain46);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray51, intArray52);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray52, intArray56);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray52, intArray60);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray68, intArray71);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray68, intArray77);
        int[] intArray81 = new int[] {};
        int[] intArray82 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray81, intArray82);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray85, intArray86);
        org.junit.Assert.assertArrayEquals(intArray82, intArray85);
        org.junit.Assert.assertArrayEquals(intArray68, intArray85);
        int[] intArray91 = new int[] {};
        int[] intArray92 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray91, intArray92);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray68, intArray91);
        org.junit.Assert.assertArrayEquals("", intArray60, intArray68);
        org.junit.Assert.assertArrayEquals(intArray4, intArray60);
        java.lang.Object obj97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray60, obj97);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5007");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader13, terms14, terms15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest1.getanalysisService();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling0, (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest28.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest28.setanalysisService(analysisService30);
        synonymsAnalysisTest28.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest28.assertFieldsEquals("tests.awaitsfix", indexReader34, fields35, fields36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest28.assertTermsEquals("random", indexReader40, terms41, terms42, true);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest28.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum46, postingsEnum47, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest28.getanalysisService();
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest28.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling27, (java.lang.Object) synonymsAnalysisTest28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling26, throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        java.util.Set<java.io.Serializable> serializableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray53);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) ' ', (double) ' ');
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4');
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5010");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray10, (-1.0f));
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest19.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest19.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray15, (java.lang.Object) synonymsAnalysisTest19);
        float[] floatArray23 = new float[] {};
        float[] floatArray24 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray24, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray24, (-1.0f));
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) '4');
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) '4');
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray38, (float) 100);
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals(objArray44, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray34, (java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray34, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray30, (float) ' ');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest53.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger55 = synonymsAnalysisTest53.getlogger();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray30, (java.lang.Object) synonymsAnalysisTest53);
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray30, (float) (short) 0);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) '4');
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) '4');
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray67, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray63, 0.0f);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = synonymsAnalysisTest75.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = null;
        synonymsAnalysisTest75.setanalysisService(analysisService77);
        synonymsAnalysisTest75.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        synonymsAnalysisTest75.assertFieldsEquals("tests.awaitsfix", indexReader81, fields82, fields83, false);
        synonymsAnalysisTest75.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger87 = synonymsAnalysisTest75.logger;
        synonymsAnalysisTest75.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest75.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray59, (java.lang.Object) synonymsAnalysisTest75);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray59, (float) (short) -1);
        float[] floatArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray59, floatArray93, (float) 1);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5011");
        float[] floatArray6 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray7 = new float[][] { floatArray6 };
        float[][][] floatArray8 = new float[][][] { floatArray7 };
        float[] floatArray15 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray16 = new float[][] { floatArray15 };
        float[][][] floatArray17 = new float[][][] { floatArray16 };
        float[] floatArray24 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray25 = new float[][] { floatArray24 };
        float[][][] floatArray26 = new float[][][] { floatArray25 };
        float[] floatArray33 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray34 = new float[][] { floatArray33 };
        float[][][] floatArray35 = new float[][][] { floatArray34 };
        float[] floatArray42 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray43 = new float[][] { floatArray42 };
        float[][][] floatArray44 = new float[][][] { floatArray43 };
        float[] floatArray51 = new float[] { 10L, 2, (byte) 1, (-1L), (byte) 10, (byte) 10 };
        float[][] floatArray52 = new float[][] { floatArray51 };
        float[][][] floatArray53 = new float[][][] { floatArray52 };
        float[][][][] floatArray54 = new float[][][][] { floatArray8, floatArray17, floatArray26, floatArray35, floatArray44, floatArray53 };
        java.util.Set<float[][][]> floatArraySet55 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray54);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 100, (long) (short) -1);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5013");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5014");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader23, terms24, terms25, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5015");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray26 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) annotatedElementArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) annotatedElementArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray32 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray31, throttlingArray32, throttlingArray33, throttlingArray34 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, throttlingArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray26, (java.lang.Object[]) throttlingArray35);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5016");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest10);
        synonymsAnalysisTest10.setIndexWriterMaxDocs(1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest18.analysisService = analysisService19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.weekly", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29, false);
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest34.assertFieldsEquals("tests.nightly", indexReader36, fields37, fields38, false);
        java.lang.String str41 = synonymsAnalysisTest34.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest34.analysisService;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("tests.nightly", indexReader44, (int) '#', postingsEnum46, postingsEnum47, true);
        synonymsAnalysisTest34.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest34.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = null;
        synonymsAnalysisTest34.analysisService = analysisService53;
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain55;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain55;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain55;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain55;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = null;
        synonymsAnalysisTest62.analysisService = analysisService63;
        org.junit.rules.RuleChain ruleChain65 = synonymsAnalysisTest62.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest62.analysisService = analysisService66;
        synonymsAnalysisTest62.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger61, (java.lang.Object) synonymsAnalysisTest62);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5017");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray28);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray41, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray41);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) byteArray53);
        byte[] byteArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray58);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 'a', (double) 10L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5019");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader13, (int) '#', postingsEnum15, postingsEnum16, false);
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest21.getlogger();
        synonymsAnalysisTest21.tearDown();
        synonymsAnalysisTest21.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest21.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest21);
        synonymsAnalysisTest21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.slow", indexReader29, fields30, fields31, true);
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest21.assertDocValuesEquals("", (int) '4', numericDocValues36, numericDocValues37);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5020");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.analysisService = analysisService4;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5021");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) queryCachingPolicy5);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest11.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest11.getlogger();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest11.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain9, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5022");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest14.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest14.logger;
        synonymsAnalysisTest14.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.junit.rules.RuleChain ruleChain20 = null;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest18.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) synonymsAnalysisTest18);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService25);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest18);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest18.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, true);
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest18.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        java.lang.String str43 = synonymsAnalysisTest36.getTestName();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest36.resetCheckIndexStatus();
        synonymsAnalysisTest36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.failfast", indexReader50, fields51, fields52, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) eSLogger35, (java.lang.Object) synonymsAnalysisTest36);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5023");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals(objArray23, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray34);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest72.setUp();
        org.junit.rules.RuleChain ruleChain74 = null;
        synonymsAnalysisTest72.failureAndSuccessEvents = ruleChain74;
        synonymsAnalysisTest72.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        synonymsAnalysisTest72.assertFieldsEquals("", indexReader78, fields79, fields80, true);
        org.junit.rules.RuleChain ruleChain83 = synonymsAnalysisTest72.failureAndSuccessEvents;
        synonymsAnalysisTest72.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray24, (java.lang.Object) synonymsAnalysisTest72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray24);
        java.util.Locale[][][][] localeArray88 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][] localeArray89 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][] localeArray90 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][] localeArray91 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][] localeArray92 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][] localeArray93 = new java.util.Locale[][][][] {};
        java.util.Locale[][][][][] localeArray94 = new java.util.Locale[][][][][] { localeArray88, localeArray89, localeArray90, localeArray91, localeArray92, localeArray93 };
        java.util.List<java.util.Locale[][][][]> localeArrayList95 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, localeArray94);
        java.util.Set<java.util.Locale[][][][]> localeArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) localeArray94);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5024");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService27);
        synonymsAnalysisTest25.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService30);
        synonymsAnalysisTest25.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "hi!");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest35.analysisService = analysisService36;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest35.assertFieldsEquals("tests.weekly", indexReader39, fields40, fields41, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest35.analysisService;
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest35.getlogger();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest35.assertDocsSkippingEquals("hi!", indexReader48, (int) '#', postingsEnum50, postingsEnum51, false);
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger55 = synonymsAnalysisTest35.getlogger();
        synonymsAnalysisTest35.assertPathHasBeenCleared("random");
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest35);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum60, postingsEnum61);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 0, (float) (byte) 10, 0.0f);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5026");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray3, (java.lang.Object) 0L);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest22.analysisService = analysisService23;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest22.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest22.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest22.setanalysisService(analysisService33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest22.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, false);
        synonymsAnalysisTest22.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray20, (java.lang.Object) (short) 10);
        java.util.Set<java.lang.Object[]> objArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) annotatedElementArray20);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) annotatedElementArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.nightly", indexReader48, fields49, fields50, false);
        java.lang.String str53 = synonymsAnalysisTest46.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest46.analysisService;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("tests.nightly", indexReader56, (int) '#', postingsEnum58, postingsEnum59, true);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("tests.monster", indexReader63, (int) (byte) 0, postingsEnum65, postingsEnum66, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = synonymsAnalysisTest46.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest70 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        synonymsAnalysisTest70.assertFieldsEquals("tests.nightly", indexReader72, fields73, fields74, false);
        java.lang.String str77 = synonymsAnalysisTest70.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService78 = synonymsAnalysisTest70.analysisService;
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        synonymsAnalysisTest70.assertDocsSkippingEquals("tests.nightly", indexReader80, (int) '#', postingsEnum82, postingsEnum83, true);
        synonymsAnalysisTest70.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest70.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = null;
        synonymsAnalysisTest70.analysisService = analysisService89;
        org.junit.rules.RuleChain ruleChain91 = synonymsAnalysisTest70.failureAndSuccessEvents;
        synonymsAnalysisTest46.failureAndSuccessEvents = ruleChain91;
        synonymsAnalysisTest46.setIndexWriterMaxDocs((int) (byte) 0);
        synonymsAnalysisTest46.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) executorServiceArray3, (java.lang.Object) synonymsAnalysisTest46);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (-1));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5028");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray3);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) '#', (float) (short) 1, (float) 3);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5030");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.logger;
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) eSLogger17, (java.lang.Object) "tests.weekly");
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray21, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.weekly", (java.lang.Object) synonymsAnalysisTest25);
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest25.assertDocValuesEquals("<unknown>", 2, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5031");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) queryCachingPolicy5);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5032");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, obj16);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5033");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 100);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 100, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5034");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest13.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest13.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) '#', postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService33);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest13.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.lang.Class<?> wildcardClass47 = executorServiceArray36.getClass();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) wildcardClass47);
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        synonymsAnalysisTest51.assertFieldsEquals("tests.nightly", indexReader53, fields54, fields55, false);
        java.lang.String str58 = synonymsAnalysisTest51.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest51.analysisService;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest51.assertDocsSkippingEquals("tests.nightly", indexReader61, (int) '#', postingsEnum63, postingsEnum64, true);
        synonymsAnalysisTest51.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = null;
        synonymsAnalysisTest51.analysisService = analysisService69;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        synonymsAnalysisTest51.assertTermsEquals("", indexReader72, terms73, terms74, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = null;
        synonymsAnalysisTest51.setanalysisService(analysisService77);
        org.junit.rules.RuleChain ruleChain79 = synonymsAnalysisTest51.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule80 = synonymsAnalysisTest51.ruleChain;
        synonymsAnalysisTest51.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest51);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 100.0f);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5036");
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray7, 100.0d);
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray15 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray13, doubleArray15, 100.0d);
        double[] doubleArray20 = new double[] { 100L };
        double[] doubleArray22 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray22, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray13, doubleArray20, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray5, doubleArray20, (double) 1L);
        double[] doubleArray33 = new double[] { 100L };
        double[] doubleArray35 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray35, 100.0d);
        double[] doubleArray40 = new double[] { 100L };
        double[] doubleArray42 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray40, doubleArray42, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray33, doubleArray40, (double) (-1L));
        double[] doubleArray50 = new double[] { 100L };
        double[] doubleArray52 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray50, doubleArray52, 100.0d);
        double[] doubleArray58 = new double[] { 100L };
        double[] doubleArray60 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray58, doubleArray60, 100.0d);
        double[] doubleArray65 = new double[] { 100L };
        double[] doubleArray67 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray67, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray58, doubleArray65, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray50, doubleArray65, (double) 1L);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray40, doubleArray50, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray40, (double) (byte) 100);
        double[] doubleArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray5, doubleArray78, (double) 10L);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (-1));
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5038");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        synonymsAnalysisTest5.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest5.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        java.lang.String str11 = synonymsAnalysisTest5.getTestName();
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5039");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.awaitsfix", indexReader16, 2, postingsEnum18, postingsEnum19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader25, fields26, fields27, true);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) '4', numericDocValues32, numericDocValues33);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 3, (-1L));
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5041");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) executorServiceArray14);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals(objArray17, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals(objArray32, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray33, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals(objArray61, (java.lang.Object[]) executorServiceArray62);
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals(objArray65, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray66);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray9, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5042");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService19);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5043");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 10.0d, (-1.0d), 0.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5046");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest4.analysisService = analysisService5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest4.assertFieldsEquals("tests.weekly", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest4.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.nightly", indexReader18, fields19, fields20, false);
        java.lang.String str23 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest16.analysisService;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) '#', postingsEnum28, postingsEnum29, true);
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest16.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) synonymsAnalysisTest16);
        synonymsAnalysisTest4.overrideTestDefaultQueryCache();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest4.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, true);
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 2, (double) 3);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5048");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str19 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5049");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader11, fields12, fields13, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest16.analysisService = analysisService17;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.weekly", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        synonymsAnalysisTest16.setUp();
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest16.logger;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest16.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain29, (java.lang.Object) executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.badapples", (java.lang.Object) executorServiceArray35);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5050");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.junit.rules.RuleChain ruleChain21 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest19.assertFieldsEquals("", indexReader25, fields26, fields27, true);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields27, (java.lang.Object) shortArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest39.setUp();
        org.junit.rules.RuleChain ruleChain41 = null;
        synonymsAnalysisTest39.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        synonymsAnalysisTest39.assertFieldsEquals("", indexReader45, fields46, fields47, true);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray54);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields47, (java.lang.Object) shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray54);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray67);
        org.junit.Assert.assertArrayEquals("random", shortArray54, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray60);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray76);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray84);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray88);
        short[] shortArray90 = new short[] {};
        short[] shortArray91 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray90, shortArray91);
        org.junit.Assert.assertArrayEquals(shortArray88, shortArray91);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray88);
        org.junit.Assert.assertArrayEquals("random", shortArray76, shortArray81);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray76);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5051");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray10);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray23);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray23);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5052");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) (short) 10, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5053");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest4.assertFieldsEquals("tests.nightly", indexReader6, fields7, fields8, false);
        java.lang.String str11 = synonymsAnalysisTest4.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest4.analysisService;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("tests.nightly", indexReader14, (int) '#', postingsEnum16, postingsEnum17, true);
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        synonymsAnalysisTest4.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest4.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray31 = new java.util.concurrent.ExecutorService[][] { executorServiceArray28, executorServiceArray29, executorServiceArray30 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray37 = new java.util.concurrent.ExecutorService[][] { executorServiceArray34, executorServiceArray35, executorServiceArray36 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray37);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule25, (java.lang.Object) executorServiceArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.nightly", indexReader44, fields45, fields46, false);
        java.lang.String str49 = synonymsAnalysisTest42.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest42.analysisService;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest42.assertDocsSkippingEquals("tests.nightly", indexReader52, (int) '#', postingsEnum54, postingsEnum55, true);
        synonymsAnalysisTest42.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest42.resetCheckIndexStatus();
        synonymsAnalysisTest42.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule63 = synonymsAnalysisTest42.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray69 = new java.util.concurrent.ExecutorService[][] { executorServiceArray66, executorServiceArray67, executorServiceArray68 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray75 = new java.util.concurrent.ExecutorService[][] { executorServiceArray72, executorServiceArray73, executorServiceArray74 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray75);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule63, (java.lang.Object) executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray84 = new java.util.concurrent.ExecutorService[][] { executorServiceArray81, executorServiceArray82, executorServiceArray83 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray84);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray84);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest87 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = synonymsAnalysisTest87.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = null;
        synonymsAnalysisTest87.setanalysisService(analysisService89);
        org.elasticsearch.index.analysis.AnalysisService analysisService91 = synonymsAnalysisTest87.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray84, (java.lang.Object) analysisService91);
        java.util.Set<java.lang.Object[]> objArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) executorServiceArray84);
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList94 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, executorServiceArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray84);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5054");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService26);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = null;
        synonymsAnalysisTest48.analysisService = analysisService49;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest48.assertFieldsEquals("tests.weekly", indexReader52, fields53, fields54, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest48.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest48.analysisService;
        synonymsAnalysisTest48.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = null;
        synonymsAnalysisTest48.setanalysisService(analysisService61);
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest48.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray70);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService63, (java.lang.Object) executorServiceArray68);
        java.lang.Object[] objArray81 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals(objArray81, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray82);
        java.lang.Object[] objArray86 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertEquals(objArray86, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray87);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray87);
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) boolean93);
        org.apache.lucene.index.NumericDocValues numericDocValues97 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) -1, numericDocValues97, numericDocValues98);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5055");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest3.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) -1, (java.lang.Object) testRule12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.awaitsfix", indexReader17, fields18, fields19, false);
        synonymsAnalysisTest15.setUp();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) (byte) -1, (java.lang.Object) synonymsAnalysisTest15);
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest15.logger;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.failfast", indexReader33, fields34, fields35, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest15.setanalysisService(analysisService38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest40.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest40.logger;
        java.lang.String str43 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = null;
        synonymsAnalysisTest44.analysisService = analysisService45;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        synonymsAnalysisTest44.assertFieldsEquals("tests.weekly", indexReader48, fields49, fields50, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest44.analysisService;
        synonymsAnalysisTest44.setUp();
        synonymsAnalysisTest44.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest44.assertDocsEnumEquals("tests.monster", postingsEnum57, postingsEnum58, true);
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest44.logger;
        synonymsAnalysisTest44.ensureCheckIndexPassed();
        synonymsAnalysisTest44.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest64.setUp();
        org.junit.rules.RuleChain ruleChain66 = null;
        synonymsAnalysisTest64.failureAndSuccessEvents = ruleChain66;
        org.elasticsearch.common.logging.ESLogger eSLogger68 = synonymsAnalysisTest64.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest69.setUp();
        synonymsAnalysisTest69.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest69.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest69.overrideTestDefaultQueryCache();
        java.lang.String str75 = synonymsAnalysisTest69.getTestName();
        synonymsAnalysisTest69.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest69.failureAndSuccessEvents;
        synonymsAnalysisTest64.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest44.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain77;
        org.elasticsearch.common.logging.ESLogger eSLogger81 = synonymsAnalysisTest40.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger82 = synonymsAnalysisTest40.getlogger();
        synonymsAnalysisTest40.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) analysisService38, (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 0.0f);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5057");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        synonymsAnalysisTest12.setUp();
        java.lang.String str33 = synonymsAnalysisTest12.getTestName();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest12.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5058");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.getanalysisService();
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (short) 100, 100.0d, (double) 1.0f);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 10, 0.0f, (float) (-1));
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 100);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 100, (double) 0L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5063");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5064");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.analysisService = analysisService11;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader15, (int) (short) -1, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        java.lang.String str28 = synonymsAnalysisTest21.getTestName();
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest21.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest21.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.monster", indexReader34, (int) (byte) -1, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest21.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest21.analysisService;
        synonymsAnalysisTest21.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) indexReader15, (java.lang.Object) analysisService43);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) ' ', (float) (short) -1, (float) (byte) 10);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5066");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str6 = synonymsAnalysisTest1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 100L, (float) (short) 10, (float) (byte) 10);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5068");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest13.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest13.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) '#', postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest1.analysisService = analysisService34;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest41.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest41.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray37, (java.lang.Object) synonymsAnalysisTest41);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray46, (-1.0f));
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) '4');
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) '4');
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray60, (float) 100);
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals(objArray66, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray56, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray56, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray52, (float) ' ');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest75.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger77 = synonymsAnalysisTest75.getlogger();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray52, (java.lang.Object) synonymsAnalysisTest75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest75);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5069");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        java.lang.Object[] objArray60 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals(objArray60, (java.lang.Object[]) executorServiceArray61);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals(objArray64, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray65);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray75);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray73);
        org.junit.rules.RuleChain[][][] ruleChainArray90 = new org.junit.rules.RuleChain[][][] {};
        java.util.Set<org.junit.rules.RuleChain[][]> ruleChainArraySet91 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray90);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) ruleChainArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray42);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5070");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (short) 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5071");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("tests.nightly", indexReader15, (int) (byte) 1, postingsEnum17, postingsEnum18);
        synonymsAnalysisTest12.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.weekly", 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) -1, (double) 1.0f, (double) (-1L));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5073");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) '4', (double) 0.0f);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, 10L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5075");
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray13);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray5, longArray24);
        long[] longArray34 = new long[] { (byte) 10 };
        long[] longArray36 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray34, longArray36);
        long[] longArray40 = new long[] { (byte) 10 };
        long[] longArray42 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("random", longArray34, longArray42);
        long[] longArray47 = new long[] { (byte) 10 };
        long[] longArray49 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray47, longArray49);
        long[] longArray53 = new long[] { (byte) 10 };
        long[] longArray55 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray53, longArray55);
        org.junit.Assert.assertArrayEquals(longArray49, longArray53);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray34, longArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray53);
        long[] longArray62 = new long[] { (byte) 10 };
        long[] longArray64 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray62, longArray64);
        long[] longArray68 = new long[] { (byte) 10 };
        long[] longArray70 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray68, longArray70);
        org.junit.Assert.assertArrayEquals(longArray64, longArray68);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest73 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        synonymsAnalysisTest73.assertFieldsEquals("tests.nightly", indexReader75, fields76, fields77, false);
        java.lang.String str80 = synonymsAnalysisTest73.getTestName();
        synonymsAnalysisTest73.ensureAllSearchContextsReleased();
        synonymsAnalysisTest73.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        synonymsAnalysisTest73.assertFieldsEquals("tests.awaitsfix", indexReader84, fields85, fields86, false);
        synonymsAnalysisTest73.setIndexWriterMaxDocs((int) ' ');
        org.elasticsearch.index.analysis.AnalysisService analysisService91 = synonymsAnalysisTest73.getanalysisService();
        synonymsAnalysisTest73.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) longArray68, (java.lang.Object) synonymsAnalysisTest73);
        org.junit.Assert.assertArrayEquals(longArray53, longArray68);
        long[] longArray95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray53, longArray95);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) (short) 1, 1.0d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5077");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, false);
        synonymsAnalysisTest4.ensureCheckIndexPassed();
        synonymsAnalysisTest4.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest4.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5078");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("random", indexReader12, terms13, terms14, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.slow", indexReader19, terms20, terms21, true);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (byte) 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5079");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 10, postingsEnum13, postingsEnum14);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest18.assertFieldsEquals("tests.nightly", indexReader20, fields21, fields22, false);
        java.lang.String str25 = synonymsAnalysisTest18.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService28);
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest18.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = null;
        synonymsAnalysisTest33.setanalysisService(analysisService35);
        synonymsAnalysisTest33.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest33.assertFieldsEquals("tests.awaitsfix", indexReader39, fields40, fields41, false);
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest33.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        synonymsAnalysisTest33.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain49;
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest55.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray51, (java.lang.Object) synonymsAnalysisTest55);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest55.assertDocsEnumEquals("tests.slow", postingsEnum60, postingsEnum61, false);
        synonymsAnalysisTest55.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest55.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        synonymsAnalysisTest55.assertTermsEquals("enwiki.random.lines.txt", indexReader67, terms68, terms69, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = null;
        synonymsAnalysisTest72.analysisService = analysisService73;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        synonymsAnalysisTest72.assertFieldsEquals("tests.weekly", indexReader76, fields77, fields78, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService81 = synonymsAnalysisTest72.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService82 = synonymsAnalysisTest72.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService83 = null;
        synonymsAnalysisTest72.setanalysisService(analysisService83);
        synonymsAnalysisTest72.ensureCheckIndexPassed();
        synonymsAnalysisTest72.ensureAllSearchContextsReleased();
        synonymsAnalysisTest72.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = null;
        synonymsAnalysisTest72.analysisService = analysisService88;
        synonymsAnalysisTest72.tearDown();
        org.junit.rules.RuleChain ruleChain91 = synonymsAnalysisTest72.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain92 = synonymsAnalysisTest72.failureAndSuccessEvents;
        synonymsAnalysisTest55.failureAndSuccessEvents = ruleChain92;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain92;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain92;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger17, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0d, (double) ' ');
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) '4', (double) (byte) 10);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 1.0f, (float) '4', (float) (short) 10);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) '4', (-1.0f), (float) (short) -1);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5084");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, true);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5085");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 100);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5086");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100, (double) 10);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 10, 0L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (-1L), (double) 100L);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5090");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.junit.rules.RuleChain ruleChain29 = null;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain29;
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest27.assertFieldsEquals("", indexReader33, fields34, fields35, true);
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest27.analysisService = analysisService39;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray16, (java.lang.Object) synonymsAnalysisTest27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest42.setUp();
        synonymsAnalysisTest42.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest42.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        java.lang.String str48 = synonymsAnalysisTest42.getTestName();
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger50 = synonymsAnalysisTest42.logger;
        synonymsAnalysisTest42.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest42.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        synonymsAnalysisTest53.assertFieldsEquals("tests.nightly", indexReader55, fields56, fields57, false);
        java.lang.String str60 = synonymsAnalysisTest53.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest53.analysisService;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        synonymsAnalysisTest53.assertDocsSkippingEquals("tests.nightly", indexReader63, (int) '#', postingsEnum65, postingsEnum66, true);
        synonymsAnalysisTest53.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = null;
        synonymsAnalysisTest53.analysisService = analysisService71;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        synonymsAnalysisTest53.assertTermsEquals("", indexReader74, terms75, terms76, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = null;
        synonymsAnalysisTest53.setanalysisService(analysisService79);
        org.junit.rules.RuleChain ruleChain81 = synonymsAnalysisTest53.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService82 = synonymsAnalysisTest53.getanalysisService();
        org.junit.rules.TestRule testRule83 = synonymsAnalysisTest53.ruleChain;
        synonymsAnalysisTest53.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService85 = null;
        synonymsAnalysisTest53.analysisService = analysisService85;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain52, (java.lang.Object) analysisService85);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest27, (java.lang.Object) ruleChain52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) intArray8, (java.lang.Object) ruleChain52);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5091");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray2 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray3 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray4 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray5 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray6 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray7 = new org.junit.rules.RuleChain[][] { ruleChainArray1, ruleChainArray2, ruleChainArray3, ruleChainArray4, ruleChainArray5, ruleChainArray6 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray7);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) ruleChainArray7, objArray9);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5092");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("<unknown>", indexReader7, fields8, fields9, true);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16, throttling17 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet19 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) throttlingArray18);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader25, 3, postingsEnum27, postingsEnum28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 3);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5093");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setIndexWriterMaxDocs(10);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest0.analysisService = analysisService25;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) analysisService25);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 1);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (-1.0f), (double) 100.0f);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5096");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.nightly", indexReader10, fields11, fields12, false);
        java.lang.String str15 = synonymsAnalysisTest8.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest8.analysisService;
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest8.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest8.getanalysisService();
        synonymsAnalysisTest8.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest8.setanalysisService(analysisService21);
        synonymsAnalysisTest8.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest8);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest8.getanalysisService();
        synonymsAnalysisTest8.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest8.assertDocValuesEquals("tests.failfast", 10, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 0L, (float) (byte) 100, (float) ' ');
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5098");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest23.analysisService = analysisService29;
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain41;
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray47, charArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray55, charArray59);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray66, charArray70);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals(charArray74, charArray78);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("", charArray74, charArray81);
        org.junit.Assert.assertArrayEquals(charArray70, charArray74);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray86, charArray87);
        org.junit.Assert.assertArrayEquals(charArray74, charArray87);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray64, charArray87);
        org.junit.Assert.assertArrayEquals(charArray55, charArray64);
        org.junit.Assert.assertArrayEquals(charArray51, charArray55);
        long[] longArray95 = new long[] { (byte) 10 };
        long[] longArray97 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray95, longArray97);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray55, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5099");
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
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray34, charArray38);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray34, charArray41);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        org.junit.Assert.assertArrayEquals(charArray30, charArray46);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray46, charArray54);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals(charArray59, charArray63);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals("", charArray59, charArray66);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray74, charArray75);
        org.junit.Assert.assertArrayEquals(charArray71, charArray75);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray78, charArray79);
        org.junit.Assert.assertArrayEquals("", charArray71, charArray78);
        org.junit.Assert.assertArrayEquals(charArray66, charArray71);
        org.junit.Assert.assertArrayEquals(charArray46, charArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray22, charArray71);
        char[] charArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray71, charArray85);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5100");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray11, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, 0.0f);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest23.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest23.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray19, (java.lang.Object) synonymsAnalysisTest23);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray28, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray3, floatArray28, (float) '#');
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) floatArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest36.analysisService = analysisService37;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.weekly", indexReader40, fields41, fields42, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest36.analysisService;
        synonymsAnalysisTest36.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest36.logger;
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest53.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger55 = synonymsAnalysisTest53.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray49, (java.lang.Object) synonymsAnalysisTest53);
        org.junit.rules.RuleChain ruleChain57 = synonymsAnalysisTest53.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain57;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain57);
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain57;
        synonymsAnalysisTest36.setUp();
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain63 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.setIndexWriterMaxDocs(3);
        synonymsAnalysisTest36.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) floatArray3, (java.lang.Object) synonymsAnalysisTest36);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) '#');
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) 1.0f, (double) 100.0f);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5103");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService2);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest5.analysisService = analysisService6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.weekly", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest5.analysisService;
        synonymsAnalysisTest5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest5);
        synonymsAnalysisTest5.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest5.assertDocValuesEquals("tests.failfast", (int) '#', numericDocValues27, numericDocValues28);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5104");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader23, (int) 'a', postingsEnum25, postingsEnum26, true);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest33.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray29, (java.lang.Object) synonymsAnalysisTest33);
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        synonymsAnalysisTest33.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest33.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest33.logger;
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest33.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest33.getlogger();
        synonymsAnalysisTest33.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest33);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 1, (long) (byte) 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (double) 100L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5107");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        org.junit.Assert.assertArrayEquals(charArray7, charArray11);
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray31);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        org.junit.Assert.assertArrayEquals(charArray20, charArray36);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) charArray20);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals(charArray20, charArray46);
        org.junit.Assert.assertArrayEquals(charArray4, charArray20);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray61, charArray65);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals("", charArray61, charArray68);
        org.junit.Assert.assertArrayEquals(charArray57, charArray61);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        org.junit.Assert.assertArrayEquals(charArray61, charArray74);
        org.junit.Assert.assertArrayEquals(charArray50, charArray74);
        org.junit.Assert.assertArrayEquals(charArray20, charArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest79 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService80 = null;
        synonymsAnalysisTest79.analysisService = analysisService80;
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        synonymsAnalysisTest79.assertFieldsEquals("tests.weekly", indexReader83, fields84, fields85, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = synonymsAnalysisTest79.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService89 = synonymsAnalysisTest79.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = null;
        synonymsAnalysisTest79.setanalysisService(analysisService90);
        synonymsAnalysisTest79.ensureCheckIndexPassed();
        synonymsAnalysisTest79.ensureAllSearchContextsReleased();
        synonymsAnalysisTest79.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService95 = null;
        synonymsAnalysisTest79.analysisService = analysisService95;
        synonymsAnalysisTest79.tearDown();
        org.junit.rules.RuleChain ruleChain98 = synonymsAnalysisTest79.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray50, (java.lang.Object) synonymsAnalysisTest79);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5108");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5109");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals(objArray6, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray13);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals(objArray52, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray53, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray70);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.rules.TestRule testRule77 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule77;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) executorServiceArray42, (java.lang.Object) testRule77);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray42);
        java.lang.Object[] objArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray2, objArray82);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5110");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertPositionsSkippingEquals("tests.nightly", indexReader16, (int) (byte) 1, postingsEnum18, postingsEnum19);
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        synonymsAnalysisTest13.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5111");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray13);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray10, byteArray26);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray10, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray50, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray50);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray62);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) byteArray62);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray76);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray72);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5112");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100.0d, (double) 10.0f);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5114");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain22);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService29);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(100);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        java.lang.String str43 = synonymsAnalysisTest36.getTestName();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest36.ruleChain;
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest36.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest36.logger;
        synonymsAnalysisTest36.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "<unknown>", (java.lang.Object) synonymsAnalysisTest36);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) '#', (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5116");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest15.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest15.setanalysisService(analysisService26);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest15.analysisService = analysisService28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.awaitsfix", indexReader31, (int) (byte) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest15.assertTermsEquals("tests.monster", indexReader37, terms38, terms39, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest42.analysisService = analysisService43;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.weekly", indexReader46, fields47, fields48, false);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest42.assertDocsEnumEquals("tests.nightly", postingsEnum52, postingsEnum53, false);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest60.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger62 = synonymsAnalysisTest60.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray56, (java.lang.Object) synonymsAnalysisTest60);
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest60);
        synonymsAnalysisTest60.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest42.failureAndSuccessEvents = ruleChain68;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain68;
        synonymsAnalysisTest15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray12, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) 100);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 2, (long) (short) 10);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 100L, (long) (short) 100);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 1, 0L);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5121");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray22, intArray23);
        org.junit.Assert.assertArrayEquals(intArray19, intArray22);
        org.junit.Assert.assertArrayEquals(intArray5, intArray22);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray5, intArray28);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray33, intArray34);
        org.junit.Assert.assertArrayEquals(intArray5, intArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest37.setanalysisService(analysisService39);
        synonymsAnalysisTest37.resetCheckIndexStatus();
        java.lang.String str42 = synonymsAnalysisTest37.getTestName();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest37.assertFieldsEquals("tests.slow", indexReader44, fields45, fields46, true);
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest37.ruleChain;
        synonymsAnalysisTest37.setUp();
        synonymsAnalysisTest37.ensureCleanedUp();
        synonymsAnalysisTest37.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) intArray34, (java.lang.Object) synonymsAnalysisTest37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest55.logger;
        synonymsAnalysisTest55.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest59.setUp();
        org.junit.rules.RuleChain ruleChain61 = null;
        synonymsAnalysisTest59.failureAndSuccessEvents = ruleChain61;
        synonymsAnalysisTest59.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule64 = synonymsAnalysisTest59.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest55, (java.lang.Object) synonymsAnalysisTest59);
        synonymsAnalysisTest55.setUp();
        synonymsAnalysisTest55.ensureCheckIndexPassed();
        synonymsAnalysisTest55.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest37, (java.lang.Object) synonymsAnalysisTest55);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5122");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.junit.rules.RuleChain ruleChain12 = null;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain12;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields18, (java.lang.Object) shortArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.junit.rules.RuleChain ruleChain32 = null;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain32;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest30.assertFieldsEquals("", indexReader36, fields37, fields38, true);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields38, (java.lang.Object) shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray45);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray50);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray63);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray2, shortArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest67 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = null;
        synonymsAnalysisTest67.analysisService = analysisService68;
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        synonymsAnalysisTest67.assertFieldsEquals("tests.weekly", indexReader71, fields72, fields73, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = synonymsAnalysisTest67.analysisService;
        synonymsAnalysisTest67.setUp();
        synonymsAnalysisTest67.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        synonymsAnalysisTest67.assertDocsEnumEquals("tests.monster", postingsEnum80, postingsEnum81, true);
        org.elasticsearch.common.logging.ESLogger eSLogger84 = synonymsAnalysisTest67.logger;
        java.lang.String str85 = synonymsAnalysisTest67.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest67.getanalysisService();
        org.junit.rules.RuleChain ruleChain87 = synonymsAnalysisTest67.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray2, (java.lang.Object) synonymsAnalysisTest67);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 1L);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5124");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest25.analysisService = analysisService26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.weekly", indexReader29, fields30, fields31, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest25.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService36);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest25.analysisService;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest25.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass41 = ruleChain40.getClass();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) wildcardClass41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        org.junit.rules.RuleChain ruleChain45 = null;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain45;
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest43.logger;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        synonymsAnalysisTest43.assertFieldsEquals("<unknown>", indexReader49, fields50, fields51, true);
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest43.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger55 = synonymsAnalysisTest43.getlogger();
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest43.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest43.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest43.assertDocsEnumEquals("tests.monster", postingsEnum59, postingsEnum60, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5125");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(obj0, obj1);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5127");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray7, 100.0d);
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray15 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray13, doubleArray15, 100.0d);
        double[] doubleArray20 = new double[] { 100L };
        double[] doubleArray22 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray22, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray13, doubleArray20, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray5, doubleArray20, (double) 1L);
        double[] doubleArray33 = new double[] { 100L };
        double[] doubleArray35 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray35, 100.0d);
        double[] doubleArray40 = new double[] { 100L };
        double[] doubleArray42 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray40, doubleArray42, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray33, doubleArray40, (double) (-1L));
        double[] doubleArray50 = new double[] { 100L };
        double[] doubleArray52 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray50, doubleArray52, 100.0d);
        double[] doubleArray58 = new double[] { 100L };
        double[] doubleArray60 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray58, doubleArray60, 100.0d);
        double[] doubleArray65 = new double[] { 100L };
        double[] doubleArray67 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray67, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray58, doubleArray65, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray50, doubleArray65, (double) 1L);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray40, doubleArray50, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray40, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0L, (double) (byte) 100);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 100, 10.0d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 100L, (long) (-1));
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5131");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (byte) 1, postingsEnum6, postingsEnum7);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        java.lang.String str17 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("hi!", 100, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5132");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) 100);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) '4');
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray22, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray18, 0.0f);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest34.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray30, (java.lang.Object) synonymsAnalysisTest34);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray39, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray14, floatArray39, (float) '#');
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray39, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray1, floatArray7, (float) 100);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5133");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        java.lang.String str17 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest10.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest10.getanalysisService();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain23;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.nightly", indexReader27, fields28, fields29, false);
        java.lang.String str32 = synonymsAnalysisTest25.getTestName();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.awaitsfix", indexReader36, fields37, fields38, false);
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest25.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 0, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5136");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray7, 100.0d);
        double[] doubleArray12 = new double[] { 100L };
        double[] doubleArray14 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray14, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray5, doubleArray12, (double) (-1L));
        double[] doubleArray22 = new double[] { 100L };
        double[] doubleArray24 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray24, 100.0d);
        double[] doubleArray30 = new double[] { 100L };
        double[] doubleArray32 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray30, doubleArray32, 100.0d);
        double[] doubleArray37 = new double[] { 100L };
        double[] doubleArray39 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray37, doubleArray39, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray30, doubleArray37, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray22, doubleArray37, (double) 1L);
        double[] doubleArray49 = new double[] { 100L };
        double[] doubleArray51 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray49, doubleArray51, 100.0d);
        double[] doubleArray56 = new double[] { 100L };
        double[] doubleArray58 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray58, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray49, doubleArray56, (double) (-1L));
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray49, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray49, (double) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray12, (double) 1);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10L, (-1.0d));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5138");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.weekly", postingsEnum16, postingsEnum17, false);
        java.lang.Object obj20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("", (java.lang.Object) postingsEnum17, obj20);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, 10.0f, (float) (byte) 10);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 10L);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (byte) 10, (double) 100L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5142");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("", charArray21, charArray28);
        org.junit.Assert.assertArrayEquals(charArray17, charArray21);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray21, charArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray11, charArray34);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals("", charArray34, charArray39);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray1, charArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5143");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.failfast", "hi!", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest21.analysisService = analysisService22;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest21.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray18, (java.lang.Object) synonymsAnalysisTest21);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray29 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) annotatedElementArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray44);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals(objArray48, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) annotatedElementArray29, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) annotatedElementArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) annotatedElementArray29);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 0.0d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) (byte) 100, (double) 100, (double) (short) -1);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5146");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule11;
        org.junit.Assert.assertNotSame((java.lang.Object) (byte) -1, (java.lang.Object) testRule11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        synonymsAnalysisTest14.setUp();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) (byte) -1, (java.lang.Object) synonymsAnalysisTest14);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest26.assertFieldsEquals("tests.nightly", indexReader28, fields29, fields30, false);
        java.lang.String str33 = synonymsAnalysisTest26.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest26.analysisService;
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest26.assertPositionsSkippingEquals("", indexReader37, (int) (byte) 0, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        synonymsAnalysisTest26.assertTermsEquals("tests.badapples", indexReader43, terms44, terms45, true);
        synonymsAnalysisTest26.setUp();
        synonymsAnalysisTest26.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest26.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        synonymsAnalysisTest26.assertTermsEquals("tests.awaitsfix", indexReader53, terms54, terms55, false);
        double[] doubleArray62 = new double[] { 100L };
        double[] doubleArray64 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray62, doubleArray64, 100.0d);
        double[] doubleArray69 = new double[] { 100L };
        double[] doubleArray71 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray69, doubleArray71, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray62, doubleArray69, (double) 10);
        double[] doubleArray79 = new double[] { 100L };
        double[] doubleArray81 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray79, doubleArray81, 100.0d);
        double[] doubleArray86 = new double[] { 100L };
        double[] doubleArray88 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray86, doubleArray88, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray79, doubleArray86, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray62, doubleArray86, (double) (byte) 10);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) false, (java.lang.Object) doubleArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) false);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5147");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals(objArray16, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray23);
        float[] floatArray67 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray72 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray77 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray82 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray87 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray88 = new float[][] { floatArray67, floatArray72, floatArray77, floatArray82, floatArray87 };
        java.util.Set<float[]> floatArraySet89 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray88);
        java.util.Set<java.lang.Cloneable> cloneableSet90 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray88);
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) floatArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) floatArray88);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5148");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest10.analysisService = analysisService11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest10.logger;
        synonymsAnalysisTest10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.weekly", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) indexReader24);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5149");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        java.lang.String str28 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest21.analysisService;
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        synonymsAnalysisTest21.assertPathHasBeenCleared("hi!");
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest21.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest21.logger;
        synonymsAnalysisTest21.resetCheckIndexStatus();
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest38.analysisService = analysisService39;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest38.assertFieldsEquals("tests.weekly", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest38.analysisService;
        synonymsAnalysisTest38.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest38.logger;
        synonymsAnalysisTest38.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        synonymsAnalysisTest51.assertFieldsEquals("tests.nightly", indexReader53, fields54, fields55, false);
        java.lang.String str58 = synonymsAnalysisTest51.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest51.analysisService;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest51.assertDocsSkippingEquals("tests.nightly", indexReader61, (int) '#', postingsEnum63, postingsEnum64, true);
        synonymsAnalysisTest51.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest38, (java.lang.Object) synonymsAnalysisTest51);
        synonymsAnalysisTest51.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        synonymsAnalysisTest71.assertFieldsEquals("tests.nightly", indexReader73, fields74, fields75, false);
        java.lang.String str78 = synonymsAnalysisTest71.getTestName();
        org.junit.rules.RuleChain ruleChain79 = synonymsAnalysisTest71.failureAndSuccessEvents;
        synonymsAnalysisTest51.failureAndSuccessEvents = ruleChain79;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain79;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain79;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain79;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5150");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5151");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray10);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        org.junit.rules.RuleChain ruleChain28 = null;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest26.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest26.getanalysisService();
        org.junit.Assert.assertNotEquals((java.lang.Object) byteArray7, (java.lang.Object) synonymsAnalysisTest26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.junit.rules.RuleChain ruleChain35 = null;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest33.resetCheckIndexStatus();
        synonymsAnalysisTest33.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest26, (java.lang.Object) synonymsAnalysisTest33);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, (double) 100.0f);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5153");
        org.junit.rules.RuleChain[][] ruleChainArray1 = new org.junit.rules.RuleChain[][] {};
        org.junit.rules.RuleChain[][][] ruleChainArray2 = new org.junit.rules.RuleChain[][][] { ruleChainArray1 };
        org.junit.rules.RuleChain[][] ruleChainArray3 = new org.junit.rules.RuleChain[][] {};
        org.junit.rules.RuleChain[][][] ruleChainArray4 = new org.junit.rules.RuleChain[][][] { ruleChainArray3 };
        org.junit.rules.RuleChain[][] ruleChainArray5 = new org.junit.rules.RuleChain[][] {};
        org.junit.rules.RuleChain[][][] ruleChainArray6 = new org.junit.rules.RuleChain[][][] { ruleChainArray5 };
        org.junit.rules.RuleChain[][] ruleChainArray7 = new org.junit.rules.RuleChain[][] {};
        org.junit.rules.RuleChain[][][] ruleChainArray8 = new org.junit.rules.RuleChain[][][] { ruleChainArray7 };
        org.junit.rules.RuleChain[][][][] ruleChainArray9 = new org.junit.rules.RuleChain[][][][] { ruleChainArray2, ruleChainArray4, ruleChainArray6, ruleChainArray8 };
        java.util.Set<org.junit.rules.RuleChain[][][]> ruleChainArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray25);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals(objArray29, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray36);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale47 };
        java.util.List<java.util.Locale> localeList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, localeArray48);
        java.util.Set<java.util.Locale> localeSet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray16, (java.lang.Object) localeArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals(objArray59, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray60, (java.lang.Object) 0L);
        java.lang.Object[] objArray75 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertEquals(objArray75, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray76);
        java.lang.Object[] objArray82 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals(objArray82, (java.lang.Object[]) executorServiceArray83);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) ruleChainArray9, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5154");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader13, terms14, terms15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.tearDown();
        java.lang.Class<?> wildcardClass25 = synonymsAnalysisTest1.getClass();
        java.lang.Object obj26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) wildcardClass25, obj26);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), 0L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5156");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        synonymsAnalysisTest15.assertPathHasBeenCleared("random");
        java.lang.String str36 = synonymsAnalysisTest15.getTestName();
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest42.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray38, (java.lang.Object) synonymsAnalysisTest42);
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest42.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain46);
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain46;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.slow", indexReader52, fields53, fields54, true);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader59, (int) (short) 1, postingsEnum61, postingsEnum62);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 0, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5157");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray10);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray23);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray45, byteArray48);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray60);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray45, byteArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray37, byteArray60);
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray60);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray73);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray77);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray73, byteArray76);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        byte[] byteArray87 = new byte[] {};
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray87, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) byteArray88);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5158");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) (short) 10, (long) (byte) 10);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 100L, (double) 100.0f);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 1.0d, (double) (short) 100);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5161");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.logger;
        java.lang.String str18 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest21.analysisService = analysisService22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.weekly", indexReader25, fields26, fields27, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest21.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService32);
        synonymsAnalysisTest21.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService35);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService35);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("random", postingsEnum40, postingsEnum41, true);
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.failfast", 3, numericDocValues46, numericDocValues47);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5162");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray15);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest23.analysisService = analysisService24;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest23.failureAndSuccessEvents;
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray20, (java.lang.Object) synonymsAnalysisTest23);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest36.analysisService = analysisService37;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray33, (java.lang.Object) synonymsAnalysisTest36);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) annotatedElementArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals(objArray63, (java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) annotatedElementArray44, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray84 = new java.util.concurrent.ExecutorService[][] { executorServiceArray83 };
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray86 = new java.util.concurrent.ExecutorService[][] { executorServiceArray85 };
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray88 = new java.util.concurrent.ExecutorService[][] { executorServiceArray87 };
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray90 = new java.util.concurrent.ExecutorService[][] { executorServiceArray89 };
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray92 = new java.util.concurrent.ExecutorService[][] { executorServiceArray91 };
        java.util.concurrent.ExecutorService[] executorServiceArray93 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray94 = new java.util.concurrent.ExecutorService[][] { executorServiceArray93 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray95 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray84, executorServiceArray86, executorServiceArray88, executorServiceArray90, executorServiceArray92, executorServiceArray94 };
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList96 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, executorServiceArray95);
        java.util.List<java.util.concurrent.ExecutorService[][]> executorServiceArrayList97 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, executorServiceArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray95);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5163");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "tests.weekly");
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) 'a', numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (short) 100, (double) '4');
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5165");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) '#', numericDocValues29, numericDocValues30);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 1, (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5167");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.weekly", indexReader24, terms25, terms26, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest1.analysisService = analysisService30;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("tests.nightly", indexReader37, (int) (byte) 1, postingsEnum39, postingsEnum40);
        synonymsAnalysisTest34.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        synonymsAnalysisTest43.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest47.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest47.getlogger();
        java.lang.String str50 = synonymsAnalysisTest47.getTestName();
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain51;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain51;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        synonymsAnalysisTest55.assertFieldsEquals("tests.nightly", indexReader57, fields58, fields59, false);
        java.lang.String str62 = synonymsAnalysisTest55.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = synonymsAnalysisTest55.analysisService;
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest55.getanalysisService();
        synonymsAnalysisTest55.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain51, (java.lang.Object) synonymsAnalysisTest55);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5168");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) '#', postingsEnum29, postingsEnum30, true);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest17.resetCheckIndexStatus();
        synonymsAnalysisTest17.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.awaitsfix", indexReader39, terms40, terms41, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest17);
        synonymsAnalysisTest17.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest17.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest17.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum48, postingsEnum49);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5169");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain21);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader28, (int) (byte) -1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService33);
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest0.logger;
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5170");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 100);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5171");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 100L };
        double[] doubleArray8 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray8, 100.0d);
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray15 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray13, doubleArray15, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray6, doubleArray13, (double) 10);
        double[] doubleArray23 = new double[] { 100L };
        double[] doubleArray25 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray25, 100.0d);
        double[] doubleArray30 = new double[] { 100L };
        double[] doubleArray32 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray30, doubleArray32, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray23, doubleArray30, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray6, doubleArray30, (double) (byte) 10);
        double[] doubleArray41 = new double[] { 100L };
        double[] doubleArray43 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray43, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray41, (double) (byte) 1);
        double[] doubleArray51 = new double[] { 100L };
        double[] doubleArray53 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray53, 100.0d);
        double[] doubleArray58 = new double[] { 100L };
        double[] doubleArray60 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray58, doubleArray60, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray51, doubleArray58, (double) (-1L));
        double[] doubleArray68 = new double[] { 100L };
        double[] doubleArray70 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray68, doubleArray70, 100.0d);
        double[] doubleArray75 = new double[] { 100L };
        double[] doubleArray77 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray75, doubleArray77, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray68, doubleArray75, (double) (-1L));
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray68, (double) 0);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray6, doubleArray68, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray68, 0.0d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5172");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.nightly", indexReader18, fields19, fields20, false);
        java.lang.String str23 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest16.analysisService;
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest16.assertPositionsSkippingEquals("", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest16.logger;
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest16.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5173");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals(objArray26, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) executorServiceArray2);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 100.0f);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (-1.0f), (float) ' ');
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 2, (double) ' ');
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5177");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray11, charArray18);
        org.junit.Assert.assertArrayEquals(charArray7, charArray11);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray11, charArray24);
        org.junit.Assert.assertArrayEquals(charArray0, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray44, charArray51);
        org.junit.Assert.assertArrayEquals(charArray40, charArray44);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray44, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray64, charArray68);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals(charArray72, charArray76);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals("", charArray72, charArray79);
        org.junit.Assert.assertArrayEquals(charArray68, charArray72);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        org.junit.Assert.assertArrayEquals(charArray72, charArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray62, charArray85);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray44, charArray62);
        org.junit.Assert.assertArrayEquals(charArray28, charArray44);
        org.junit.Assert.assertArrayEquals(charArray0, charArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray44);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5178");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray14);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals(objArray20, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) executorServiceArray21);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest27.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest27.setanalysisService(analysisService29);
        synonymsAnalysisTest27.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest27.assertFieldsEquals("tests.awaitsfix", indexReader33, fields34, fields35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest27.assertTermsEquals("random", indexReader39, terms40, terms41, true);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest27.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum45, postingsEnum46, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest27.getanalysisService();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray51 = new org.junit.rules.RuleChain[] { ruleChain50 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, ruleChainArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) ruleChainArray51);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5179");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest0.analysisService = analysisService6;
        java.lang.String str8 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5180");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) -1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5181");
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
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.junit.rules.RuleChain ruleChain31 = null;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain31;
        synonymsAnalysisTest29.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest29.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) synonymsAnalysisTest29);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray16, (java.lang.Object) synonymsAnalysisTest29);
        synonymsAnalysisTest29.resetCheckIndexStatus();
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals(objArray39, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest43.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = null;
        synonymsAnalysisTest43.setanalysisService(analysisService45);
        synonymsAnalysisTest43.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        synonymsAnalysisTest43.assertFieldsEquals("tests.awaitsfix", indexReader49, fields50, fields51, false);
        synonymsAnalysisTest43.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray39, (java.lang.Object) synonymsAnalysisTest43);
        java.lang.String str56 = synonymsAnalysisTest43.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest43.analysisService;
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest43.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest29, (java.lang.Object) synonymsAnalysisTest43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest29.assertPathHasBeenCleared("");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5182");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) ruleChain5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest8.analysisService = analysisService9;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.weekly", indexReader12, fields13, fields14, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        synonymsAnalysisTest8.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest8.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest20.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest20.analysisService;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("tests.nightly", indexReader30, (int) '#', postingsEnum32, postingsEnum33, true);
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest20.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) synonymsAnalysisTest20);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = null;
        synonymsAnalysisTest8.setanalysisService(analysisService40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest8.assertFieldsEquals("random", indexReader43, fields44, fields45, false);
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest8.ruleChain;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest8);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5183");
        java.lang.Object obj0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray8, intArray16);
        org.junit.Assert.assertArrayEquals(intArray3, intArray16);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray23, intArray24);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray24, intArray28);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray35, intArray39);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray49);
        org.junit.Assert.assertArrayEquals(intArray45, intArray48);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray45, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray59, intArray62);
        org.junit.Assert.assertArrayEquals(intArray45, intArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray39, intArray62);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray70, intArray71);
        int[] intArray74 = new int[] {};
        int[] intArray75 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray74, intArray75);
        org.junit.Assert.assertArrayEquals(intArray71, intArray74);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray71, intArray79);
        org.junit.Assert.assertArrayEquals(intArray39, intArray79);
        org.junit.Assert.assertArrayEquals(intArray24, intArray79);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray87, intArray88);
        int[] intArray91 = new int[] {};
        int[] intArray92 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray91, intArray92);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray88, intArray92);
        org.junit.Assert.assertArrayEquals(intArray24, intArray88);
        org.junit.Assert.assertArrayEquals(intArray3, intArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) intArray88);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5184");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader13, terms14, terms15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest1.getanalysisService();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling0, (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService27);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5185");
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray7, longArray13);
        long[] longArray19 = new long[] { (byte) 10 };
        long[] longArray21 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray19, longArray21);
        long[] longArray25 = new long[] { (byte) 10 };
        long[] longArray27 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray25, longArray27);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        long[] longArray32 = new long[] { (byte) 10 };
        long[] longArray34 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray32, longArray34);
        long[] longArray38 = new long[] { (byte) 10 };
        long[] longArray40 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray38, longArray40);
        org.junit.Assert.assertArrayEquals(longArray34, longArray38);
        org.junit.Assert.assertArrayEquals("", longArray21, longArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray7, longArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) longArray7);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 1, (double) '4', 10.0d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5187");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1L, (long) '4');
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5188");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.nightly", indexReader24, (int) '#', postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.nightly", indexReader34, 0, postingsEnum36, postingsEnum37, false);
        synonymsAnalysisTest14.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest14.logger;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("", indexReader43, 1, postingsEnum45, postingsEnum46);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest14.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5189");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.monster", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader25, (int) 'a', postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5190");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest12.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, true);
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest37.analysisService = analysisService38;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest37.assertFieldsEquals("tests.weekly", indexReader41, fields42, fields43, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest37.analysisService;
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = null;
        synonymsAnalysisTest49.analysisService = analysisService50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        synonymsAnalysisTest49.assertFieldsEquals("tests.weekly", indexReader53, fields54, fields55, false);
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest49.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest59.setUp();
        synonymsAnalysisTest59.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest59.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest59.overrideTestDefaultQueryCache();
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService70 = synonymsAnalysisTest69.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger71 = synonymsAnalysisTest69.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray65, (java.lang.Object) synonymsAnalysisTest69);
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest69.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain73;
        synonymsAnalysisTest59.failureAndSuccessEvents = ruleChain73;
        org.elasticsearch.common.logging.ESLogger eSLogger76 = synonymsAnalysisTest59.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger77 = synonymsAnalysisTest59.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger58, (java.lang.Object) synonymsAnalysisTest59);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) ruleChain48, (java.lang.Object) eSLogger58);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain35, (java.lang.Object) "random");
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain35);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain35);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5191");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (byte) 1, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest14.getlogger();
        java.lang.String str17 = synonymsAnalysisTest14.getTestName();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain18;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain18, (java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest22.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest41.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest41.setanalysisService(analysisService43);
        synonymsAnalysisTest41.ensureAllSearchContextsReleased();
        synonymsAnalysisTest41.resetCheckIndexStatus();
        synonymsAnalysisTest41.assertPathHasBeenCleared("random");
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest41.logger;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.badapples", indexReader51, fields52, fields53, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest41.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService40, (java.lang.Object) synonymsAnalysisTest41);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5192");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum7, postingsEnum8, true);
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        synonymsAnalysisTest15.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest25.analysisService = analysisService26;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.weekly", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest25.assertDocsEnumEquals("tests.maxfailures", postingsEnum35, postingsEnum36, false);
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest25.ruleChain;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) synonymsAnalysisTest25);
        java.lang.String str41 = synonymsAnalysisTest25.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5193");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][] doubleArray5 = new double[][] {};
        double[][][] doubleArray6 = new double[][][] { doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        double[][] doubleArray7 = new double[][] {};
        double[][] doubleArray8 = new double[][] {};
        double[][] doubleArray9 = new double[][] {};
        double[][] doubleArray10 = new double[][] {};
        double[][] doubleArray11 = new double[][] {};
        double[][][] doubleArray12 = new double[][][] { doubleArray7, doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        double[][] doubleArray13 = new double[][] {};
        double[][] doubleArray14 = new double[][] {};
        double[][] doubleArray15 = new double[][] {};
        double[][] doubleArray16 = new double[][] {};
        double[][] doubleArray17 = new double[][] {};
        double[][][] doubleArray18 = new double[][][] { doubleArray13, doubleArray14, doubleArray15, doubleArray16, doubleArray17 };
        double[][] doubleArray19 = new double[][] {};
        double[][] doubleArray20 = new double[][] {};
        double[][] doubleArray21 = new double[][] {};
        double[][] doubleArray22 = new double[][] {};
        double[][] doubleArray23 = new double[][] {};
        double[][][] doubleArray24 = new double[][][] { doubleArray19, doubleArray20, doubleArray21, doubleArray22, doubleArray23 };
        double[][] doubleArray25 = new double[][] {};
        double[][] doubleArray26 = new double[][] {};
        double[][] doubleArray27 = new double[][] {};
        double[][] doubleArray28 = new double[][] {};
        double[][] doubleArray29 = new double[][] {};
        double[][][] doubleArray30 = new double[][][] { doubleArray25, doubleArray26, doubleArray27, doubleArray28, doubleArray29 };
        double[][][][] doubleArray31 = new double[][][][] { doubleArray6, doubleArray12, doubleArray18, doubleArray24, doubleArray30 };
        java.util.List<double[][][]> doubleArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, doubleArray31);
        java.util.Set<double[][][]> doubleArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest34.setanalysisService(analysisService36);
        synonymsAnalysisTest34.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest34.assertFieldsEquals("tests.awaitsfix", indexReader40, fields41, fields42, false);
        synonymsAnalysisTest34.ensureAllSearchContextsReleased();
        synonymsAnalysisTest34.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest34.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = null;
        synonymsAnalysisTest48.analysisService = analysisService49;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest48.failureAndSuccessEvents;
        synonymsAnalysisTest48.ensureCleanedUp();
        synonymsAnalysisTest48.ensureCheckIndexPassed();
        synonymsAnalysisTest48.setIndexWriterMaxDocs(0);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest60.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger62 = synonymsAnalysisTest60.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray56, (java.lang.Object) synonymsAnalysisTest60);
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain65 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest48.failureAndSuccessEvents = ruleChain65;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain65;
        synonymsAnalysisTest34.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray31, (java.lang.Object) synonymsAnalysisTest34);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) 10.0f, (double) (short) 10, 0.0d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5195");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService10);
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, obj12);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertPositionsSkippingEquals("tests.nightly", indexReader20, (int) (byte) 1, postingsEnum22, postingsEnum23);
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest26.setUp();
        synonymsAnalysisTest26.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest30.getlogger();
        java.lang.String str33 = synonymsAnalysisTest30.getTestName();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain34;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain34;
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest17.logger;
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("random", indexReader41, (int) '4', postingsEnum43, postingsEnum44, true);
        org.junit.rules.TestRule testRule47 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = null;
        synonymsAnalysisTest17.analysisService = analysisService49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService49);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5196");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray5, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray20, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray25);
        org.junit.Assert.assertArrayEquals(intArray21, intArray24);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray21, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray38, intArray39);
        org.junit.Assert.assertArrayEquals(intArray35, intArray38);
        org.junit.Assert.assertArrayEquals(intArray21, intArray38);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray21, intArray44);
        org.junit.Assert.assertArrayEquals("", intArray13, intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray13);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5197");
        int[] intArray2 = new int[] { '#' };
        int[][] intArray3 = new int[][] { intArray2 };
        int[] intArray5 = new int[] { '#' };
        int[][] intArray6 = new int[][] { intArray5 };
        int[] intArray8 = new int[] { '#' };
        int[][] intArray9 = new int[][] { intArray8 };
        int[] intArray11 = new int[] { '#' };
        int[][] intArray12 = new int[][] { intArray11 };
        int[] intArray14 = new int[] { '#' };
        int[][] intArray15 = new int[][] { intArray14 };
        int[][][] intArray16 = new int[][][] { intArray3, intArray6, intArray9, intArray12, intArray15 };
        java.util.Set<int[][]> intArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(intArray16);
        java.util.List<int[][]> intArrayList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, intArray16);
        java.lang.Object[] objArray19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray16, objArray19);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5198");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest0.analysisService = analysisService33;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader38, 10, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest43.analysisService = analysisService44;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest43.assertFieldsEquals("tests.weekly", indexReader47, fields48, fields49, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest43.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest43.analysisService;
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest43.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain54;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum57, postingsEnum58);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 10.0d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 100.0f);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5201");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) (short) 1, 1.0f);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5203");
        java.lang.Object obj2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertNotEquals("tests.monster", obj2, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray16 = new java.util.concurrent.ExecutorService[][] { executorServiceArray13, executorServiceArray14, executorServiceArray15 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray22 = new java.util.concurrent.ExecutorService[][] { executorServiceArray19, executorServiceArray20, executorServiceArray21 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray28 = new java.util.concurrent.ExecutorService[][] { executorServiceArray25, executorServiceArray26, executorServiceArray27 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList29 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray28);
        java.lang.Iterable[] iterableArray31 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.concurrent.ExecutorService[]>[] executorServiceArrayIterableArray32 = (java.lang.Iterable<java.util.concurrent.ExecutorService[]>[]) iterableArray31;
        executorServiceArrayIterableArray32[0] = executorServiceArrayList17;
        executorServiceArrayIterableArray32[1] = executorServiceArrayList23;
        executorServiceArrayIterableArray32[2] = executorServiceArrayList29;
        java.lang.Iterable[][] iterableArray40 = new java.lang.Iterable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.concurrent.ExecutorService[]>[][] executorServiceArrayIterableArray41 = (java.lang.Iterable<java.util.concurrent.ExecutorService[]>[][]) iterableArray40;
        executorServiceArrayIterableArray41[0] = executorServiceArrayIterableArray32;
        java.util.Set<java.lang.Iterable<java.util.concurrent.ExecutorService[]>[]> executorServiceArrayIterableArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArrayIterableArray41);
        java.util.Set<java.lang.Iterable<java.util.concurrent.ExecutorService[]>[]> executorServiceArrayIterableArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArrayIterableArray41);
        java.util.List<java.lang.Iterable<java.util.concurrent.ExecutorService[]>[]> executorServiceArrayIterableArrayList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArrayIterableArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArrayIterableArray41);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5204");
        long[] longArray4 = new long[] { (byte) 10 };
        long[] longArray6 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 10 };
        long[] longArray12 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, false);
        java.lang.String str36 = synonymsAnalysisTest29.getTestName();
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.awaitsfix", indexReader40, fields41, fields42, false);
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) ' ');
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) longArray24, (java.lang.Object) synonymsAnalysisTest29);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) longArray24);
        org.junit.Assert.assertArrayEquals(longArray10, longArray24);
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray24);
        long[] longArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray24, longArray53);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5205");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.nightly", indexReader7, terms8, terms9, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5206");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
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
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray15);
        short[] shortArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray23);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5207");
        double[] doubleArray2 = new double[] { 100L };
        double[] doubleArray4 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray4, 100.0d);
        double[] doubleArray10 = new double[] { 100L };
        double[] doubleArray12 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray10, doubleArray12, 100.0d);
        double[] doubleArray18 = new double[] { 100L };
        double[] doubleArray20 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray18, doubleArray20, 100.0d);
        double[] doubleArray26 = new double[] { 100L };
        double[] doubleArray28 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray26, doubleArray28, 100.0d);
        double[] doubleArray33 = new double[] { 100L };
        double[] doubleArray35 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray35, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray26, doubleArray33, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray18, doubleArray33, (double) 1L);
        double[] doubleArray45 = new double[] { 100L };
        double[] doubleArray47 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray45, doubleArray47, 100.0d);
        double[] doubleArray52 = new double[] { 100L };
        double[] doubleArray54 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray54, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray45, doubleArray52, (double) (-1L));
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray45, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray10, doubleArray33, (double) (short) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray33, 0.0d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5208");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest15.assertTermsEquals("", indexReader36, terms37, terms38, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("", indexReader44, 100, postingsEnum46, postingsEnum47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest50.analysisService = analysisService51;
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.weekly", indexReader54, fields55, fields56, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
        synonymsAnalysisTest50.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest50.logger;
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest67 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = synonymsAnalysisTest67.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger69 = synonymsAnalysisTest67.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray63, (java.lang.Object) synonymsAnalysisTest67);
        org.junit.rules.RuleChain ruleChain71 = synonymsAnalysisTest67.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain71;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain71);
        synonymsAnalysisTest50.failureAndSuccessEvents = ruleChain71;
        synonymsAnalysisTest50.setUp();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest50, (java.lang.Object) "tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) postingsEnum46, (java.lang.Object) synonymsAnalysisTest50);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1.0d, (double) 2);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) -1, (long) (short) 10);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5212");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.nightly", indexReader10, fields11, fields12, false);
        java.lang.String str15 = synonymsAnalysisTest8.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest8.analysisService;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) '#', postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest8.resetCheckIndexStatus();
        synonymsAnalysisTest8.assertPathHasBeenCleared("random");
        synonymsAnalysisTest8.assertPathHasBeenCleared("random");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        synonymsAnalysisTest31.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest31.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest31.analysisService = analysisService37;
        synonymsAnalysisTest31.ensureAllSearchContextsReleased();
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest45.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest45.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray41, (java.lang.Object) synonymsAnalysisTest45);
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain49);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain49;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain49;
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray55, charArray59);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) charArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 10, 10L);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5214");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) testRuleIgnoreAfterMaxFailuresArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals(objArray34, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray35, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray24);
        double[] doubleArray56 = new double[] { 100L };
        double[] doubleArray58 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray58, 100.0d);
        double[] doubleArray64 = new double[] { 100L };
        double[] doubleArray66 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray66, 100.0d);
        double[] doubleArray71 = new double[] { 100L };
        double[] doubleArray73 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray71, doubleArray73, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray64, doubleArray71, (double) 10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray56, doubleArray71, (double) 1L);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray24, (java.lang.Object) 1L);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 1);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1, (double) 0L);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 100.0d, 0.0d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5218");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.maxfailures", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService17);
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest2.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest22.analysisService = analysisService23;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.weekly", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest22.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest34.assertFieldsEquals("tests.nightly", indexReader36, fields37, fields38, false);
        java.lang.String str41 = synonymsAnalysisTest34.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest34.analysisService;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("tests.nightly", indexReader44, (int) '#', postingsEnum46, postingsEnum47, true);
        synonymsAnalysisTest34.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest34.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) synonymsAnalysisTest34);
        synonymsAnalysisTest34.setUp();
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5219");
        long[] longArray6 = new long[] { (byte) 10 };
        long[] longArray8 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray8);
        long[] longArray12 = new long[] { (byte) 10 };
        long[] longArray14 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray12, longArray14);
        org.junit.Assert.assertArrayEquals(longArray8, longArray12);
        long[] longArray19 = new long[] { (byte) 10 };
        long[] longArray21 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray19, longArray21);
        long[] longArray25 = new long[] { (byte) 10 };
        long[] longArray27 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray25, longArray27);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        org.junit.Assert.assertArrayEquals("", longArray8, longArray21);
        long[] longArray34 = new long[] { (byte) 10 };
        long[] longArray36 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray34, longArray36);
        long[] longArray40 = new long[] { (byte) 10 };
        long[] longArray42 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray40, longArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray36, longArray42);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray21, longArray42);
        long[] longArray49 = new long[] { (byte) 10 };
        long[] longArray51 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray49, longArray51);
        long[] longArray55 = new long[] { (byte) 10 };
        long[] longArray57 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray55, longArray57);
        org.junit.Assert.assertArrayEquals(longArray51, longArray55);
        long[] longArray62 = new long[] { (byte) 10 };
        long[] longArray64 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray62, longArray64);
        long[] longArray68 = new long[] { (byte) 10 };
        long[] longArray70 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray68, longArray70);
        org.junit.Assert.assertArrayEquals(longArray64, longArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray55, longArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray55);
        long[] longArray79 = new long[] { (byte) 10 };
        long[] longArray81 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray79, longArray81);
        long[] longArray85 = new long[] { (byte) 10 };
        long[] longArray87 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray85, longArray87);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray81, longArray87);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) longArray87);
        org.junit.Assert.assertArrayEquals(longArray21, longArray87);
        long[] longArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray21, longArray92);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5220");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader6, fields7, fields8, true);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.maxfailures");
        synonymsAnalysisTest0.setUp();
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1L, 0.0d, (double) (short) 100);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (-1), 1.0d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5223");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) -1, (float) 100, (float) 10L);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5225");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService27);
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.resetCheckIndexStatus();
        synonymsAnalysisTest25.assertPathHasBeenCleared("random");
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest25.logger;
        java.lang.String str34 = synonymsAnalysisTest25.getTestName();
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray37, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray37, charArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest48.setUp();
        synonymsAnalysisTest48.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest48.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        java.lang.String str54 = synonymsAnalysisTest48.getTestName();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger56 = synonymsAnalysisTest48.logger;
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest48.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain58;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) "", (java.lang.Object) ruleChain58);
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain58;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain58);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5226");
        int[] intArray1 = null;
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray8, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals(intArray8, intArray25);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray8, intArray31);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray38, intArray47);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray38);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray53, intArray54);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray57, intArray58);
        org.junit.Assert.assertArrayEquals(intArray54, intArray57);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray63, intArray64);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray67, intArray68);
        org.junit.Assert.assertArrayEquals(intArray64, intArray67);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray64, intArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray54, intArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray38, intArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray72);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5227");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.logger;
        java.lang.String str18 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest1.assertTermsEquals("<unknown>", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader32, terms33, terms34, false);
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        synonymsAnalysisTest38.assertFieldsEquals("tests.nightly", indexReader40, fields41, fields42, false);
        java.lang.String str45 = synonymsAnalysisTest38.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest38.analysisService;
        synonymsAnalysisTest38.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest38.assertPositionsSkippingEquals("", indexReader49, (int) (byte) 0, postingsEnum51, postingsEnum52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        synonymsAnalysisTest38.assertTermsEquals("tests.badapples", indexReader55, terms56, terms57, true);
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.slow", (int) (byte) 0, numericDocValues64, numericDocValues65);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5228");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5229");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        synonymsAnalysisTest24.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest24.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest24.analysisService = analysisService30;
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest38.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest38.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray34, (java.lang.Object) synonymsAnalysisTest38);
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest38.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain42);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain42;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain42;
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray48, charArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) charArray52);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5230");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest14.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule21;
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) testRule21);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService24);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.maxfailures", (int) (byte) 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5231");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray11, (-1.0f));
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray2, floatArray20, 0.0f);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray33, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray32, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray28, (float) 'a');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest40.analysisService = analysisService41;
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy44 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) queryCachingPolicy44);
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest40.assertPathHasBeenCleared("tests.failfast");
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest40.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) 'a', (java.lang.Object) testRule50);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5232");
        int[][] intArray1 = new int[][] {};
        int[][] intArray2 = new int[][] {};
        int[][] intArray3 = new int[][] {};
        int[][][] intArray4 = new int[][][] { intArray1, intArray2, intArray3 };
        int[][] intArray5 = new int[][] {};
        int[][] intArray6 = new int[][] {};
        int[][] intArray7 = new int[][] {};
        int[][][] intArray8 = new int[][][] { intArray5, intArray6, intArray7 };
        int[][] intArray9 = new int[][] {};
        int[][] intArray10 = new int[][] {};
        int[][] intArray11 = new int[][] {};
        int[][][] intArray12 = new int[][][] { intArray9, intArray10, intArray11 };
        int[][][][] intArray13 = new int[][][][] { intArray4, intArray8, intArray12 };
        java.util.List<int[][][]> intArrayList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, intArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray23);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray36);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray13, (java.lang.Object[]) executorServiceArray48);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 100, (float) (-1), (float) 10);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 3, 10.0f, (float) (short) 0);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5235");
        org.elasticsearch.common.logging.ESLogger[][][][] eSLoggerArray0 = new org.elasticsearch.common.logging.ESLogger[][][][] {};
        org.elasticsearch.common.logging.ESLogger[][][][] eSLoggerArray1 = new org.elasticsearch.common.logging.ESLogger[][][][] {};
        org.elasticsearch.common.logging.ESLogger[][][][][] eSLoggerArray2 = new org.elasticsearch.common.logging.ESLogger[][][][][] { eSLoggerArray0, eSLoggerArray1 };
        org.elasticsearch.common.logging.ESLogger[][][][][][] eSLoggerArray3 = new org.elasticsearch.common.logging.ESLogger[][][][][][] { eSLoggerArray2 };
        java.util.Set<org.elasticsearch.common.logging.ESLogger[][][][][]> eSLoggerArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(eSLoggerArray3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray6, testRuleIgnoreAfterMaxFailuresArray7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray9, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray11 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray14 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray15 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray16 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray14, testRuleIgnoreAfterMaxFailuresArray15 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray19 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray17, testRuleIgnoreAfterMaxFailuresArray18, testRuleIgnoreAfterMaxFailuresArray19 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray22 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray23 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray24 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray21, testRuleIgnoreAfterMaxFailuresArray22, testRuleIgnoreAfterMaxFailuresArray23 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray25 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray8, testRuleIgnoreAfterMaxFailuresArray12, testRuleIgnoreAfterMaxFailuresArray16, testRuleIgnoreAfterMaxFailuresArray20, testRuleIgnoreAfterMaxFailuresArray24 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][]> testRuleIgnoreAfterMaxFailuresArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSLoggerArray3, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray25);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) 1, 10.0d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (-1));
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5238");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService12);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum7, (java.lang.Object) synonymsAnalysisTest10);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest10.assertFieldsEquals("", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest10.assertFieldsEquals("random", indexReader33, fields34, fields35, true);
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest10.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest39.assertFieldsEquals("tests.nightly", indexReader41, fields42, fields43, false);
        java.lang.String str46 = synonymsAnalysisTest39.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest39.analysisService;
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest39.getanalysisService();
        synonymsAnalysisTest39.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest39.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest39.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        synonymsAnalysisTest39.assertTermsEquals("tests.monster", indexReader55, terms56, terms57, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger38, (java.lang.Object) terms57);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 0L);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5240");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals(objArray15, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray5, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) (short) 10);
        float[] floatArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray22, (float) (byte) 1);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5241");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray11);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray24);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray48);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray48);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray61);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) byteArray60);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5242");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest1.analysisService = analysisService19;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.nightly", indexReader24, (int) (byte) 1, postingsEnum26, postingsEnum27);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.nightly");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest1.analysisService = analysisService33;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader36, 0, postingsEnum38, postingsEnum39);
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest43.analysisService = analysisService44;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest43.assertFieldsEquals("tests.weekly", indexReader47, fields48, fields49, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest43.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest43.analysisService;
        synonymsAnalysisTest43.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        synonymsAnalysisTest56.assertFieldsEquals("tests.nightly", indexReader58, fields59, fields60, false);
        org.junit.rules.TestRule testRule63 = synonymsAnalysisTest56.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule63;
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) synonymsAnalysisTest43, (java.lang.Object) testRule63);
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest43.setanalysisService(analysisService66);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService66);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        java.lang.Object obj71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.monster", obj71);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5243");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 3, (double) (-1), (double) 1L);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5244");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        java.lang.String str7 = synonymsAnalysisTest2.getTestName();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest2.ruleChain;
        org.junit.Assert.assertNotEquals("tests.badapples", obj1, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("<unknown>", indexReader11, (int) (short) 100, postingsEnum13, postingsEnum14, false);
        java.lang.String str17 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5245");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.analysisService = analysisService14;
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5246");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader23, (int) (byte) 10, postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.nightly", indexReader32, fields33, fields34, false);
        java.lang.String str37 = synonymsAnalysisTest30.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest30.analysisService;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("", indexReader41, (int) (byte) 0, postingsEnum43, postingsEnum44);
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        synonymsAnalysisTest30.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest30.logger;
        synonymsAnalysisTest30.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.nightly", indexReader52, fields53, fields54, false);
        java.lang.String str57 = synonymsAnalysisTest50.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest50.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.getanalysisService();
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray65);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray69);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray72);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray65, byteArray68);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest50, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest50);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest30, (java.lang.Object) synonymsAnalysisTest50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5248");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5249");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray16);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray6, shortArray20);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray44);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray48, shortArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray34, shortArray48);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray57);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray60);
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        org.junit.Assert.assertArrayEquals("hi!", shortArray48, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray63);
        short[] shortArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray20, shortArray67);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5250");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        java.util.List[] listArray14 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.concurrent.ExecutorService[]>[] executorServiceArrayListArray15 = (java.util.List<java.util.concurrent.ExecutorService[]>[]) listArray14;
        executorServiceArrayListArray15[0] = executorServiceArrayList6;
        executorServiceArrayListArray15[1] = executorServiceArrayList12;
        java.util.Set<java.util.List<java.util.concurrent.ExecutorService[]>> executorServiceArrayListSet20 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArrayListArray15);
        java.util.Set<java.lang.Iterable<java.util.concurrent.ExecutorService[]>> executorServiceArrayIterableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.util.concurrent.ExecutorService[]>[]) executorServiceArrayListArray15);
        java.util.Set<java.util.Collection<java.util.concurrent.ExecutorService[]>> executorServiceArrayCollectionSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.util.concurrent.ExecutorService[]>[]) executorServiceArrayListArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) executorServiceArrayListArray15);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5251");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray1, throttlingArray2, throttlingArray3, throttlingArray4 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, throttlingArray5);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals(objArray9, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray10, (java.lang.Object) 0L);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray35);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5252");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (-1), numericDocValues21, numericDocValues22);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5253");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("hi!", indexReader19, (int) (short) 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5255");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("<unknown>", indexReader7, fields8, fields9, true);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.failfast", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest20.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService22);
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        synonymsAnalysisTest20.resetCheckIndexStatus();
        synonymsAnalysisTest20.assertPathHasBeenCleared("random");
        synonymsAnalysisTest20.resetCheckIndexStatus();
        java.lang.String str29 = synonymsAnalysisTest20.getTestName();
        synonymsAnalysisTest20.setUp();
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (byte) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest20.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) ' ');
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 1.0f, 0.0d, (double) 100);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (short) 10, 0.0f, (float) 1L);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5259");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
        byte[] byteArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray20);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (short) 1, 0.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5262");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 'a');
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5263");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals(objArray25, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray26);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray17);
        java.lang.Object[] objArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, objArray32);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 'a', 10.0f, (-1.0f));
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5265");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray20);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray13, charArray26);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray3, charArray26);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals("", charArray31, charArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray26, charArray38);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals(charArray54, charArray58);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray61);
        org.junit.Assert.assertArrayEquals(charArray50, charArray54);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        org.junit.Assert.assertArrayEquals(charArray54, charArray67);
        org.junit.Assert.assertArrayEquals(charArray43, charArray67);
        org.junit.Assert.assertArrayEquals(charArray26, charArray43);
        char[] charArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray26, charArray72);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5266");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) 'a', (java.lang.Object) synonymsAnalysisTest1);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader23);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5267");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService13);
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.badapples", indexReader19, (int) '4', postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) synonymsAnalysisTest2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "hi!");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5268");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.awaitsfix", indexReader16, terms17, terms18, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
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
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray35, charArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray25, charArray48);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray53, charArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray48, charArray60);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals(charArray68, charArray72);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        char[] charArray79 = new char[] {};
        char[] charArray80 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray79, charArray80);
        org.junit.Assert.assertArrayEquals(charArray76, charArray80);
        char[] charArray83 = new char[] {};
        char[] charArray84 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray83, charArray84);
        org.junit.Assert.assertArrayEquals("", charArray76, charArray83);
        org.junit.Assert.assertArrayEquals(charArray72, charArray76);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        org.junit.Assert.assertArrayEquals(charArray76, charArray89);
        org.junit.Assert.assertArrayEquals(charArray65, charArray89);
        org.junit.Assert.assertArrayEquals(charArray48, charArray65);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertPathHasBeenCleared("");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5269");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("tests.nightly", indexReader15, (int) (byte) 1, postingsEnum17, postingsEnum18);
        synonymsAnalysisTest12.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str26 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.slow", indexReader28, 3, postingsEnum30, postingsEnum31, true);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5270");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader13, terms14, terms15, true);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray44);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray42);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals(objArray53, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray28, objArray53);
        org.junit.Assert.assertNotSame("", (java.lang.Object) terms15, (java.lang.Object) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = null;
        synonymsAnalysisTest60.setanalysisService(analysisService61);
        synonymsAnalysisTest60.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = null;
        synonymsAnalysisTest64.analysisService = analysisService65;
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        synonymsAnalysisTest64.assertFieldsEquals("tests.weekly", indexReader68, fields69, fields70, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest64.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService74 = synonymsAnalysisTest64.analysisService;
        org.junit.rules.RuleChain ruleChain75 = synonymsAnalysisTest64.failureAndSuccessEvents;
        synonymsAnalysisTest64.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.analysis.AnalysisService analysisService78 = synonymsAnalysisTest64.analysisService;
        synonymsAnalysisTest64.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) synonymsAnalysisTest60, (java.lang.Object) synonymsAnalysisTest64);
        synonymsAnalysisTest64.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger82 = synonymsAnalysisTest64.logger;
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("tests.failfast", indexReader84, (int) '4', postingsEnum86, postingsEnum87, false);
        org.elasticsearch.common.logging.ESLogger eSLogger90 = synonymsAnalysisTest64.getlogger();
        org.apache.lucene.index.IndexReader indexReader92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum95 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("", indexReader92, (int) (byte) 0, postingsEnum94, postingsEnum95, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) false);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5271");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest15.getlogger();
        java.lang.String str18 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest19.analysisService;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("tests.nightly", indexReader29, (int) '#', postingsEnum31, postingsEnum32, true);
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest19.resetCheckIndexStatus();
        synonymsAnalysisTest19.assertPathHasBeenCleared("random");
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain40;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest15);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest15);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.badapples", (int) '4', numericDocValues48, numericDocValues49);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5272");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader13, (-1), postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest20.getTestName();
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService29);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest20.analysisService = analysisService31;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest33.analysisService = analysisService34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest33.assertFieldsEquals("tests.weekly", indexReader37, fields38, fields39, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest33.analysisService;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) synonymsAnalysisTest33);
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest33.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) testRule19, (java.lang.Object) testRule45);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5273");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader14, terms15, terms16, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest19.logger;
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain39 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) false, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5274");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("", indexReader8, fields9, fields10, true);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields10, (java.lang.Object) shortArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.junit.rules.RuleChain ruleChain24 = null;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain24;
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest22.assertFieldsEquals("", indexReader28, fields29, fields30, true);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray37);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields30, (java.lang.Object) shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray37);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray50);
        org.junit.Assert.assertArrayEquals("random", shortArray37, shortArray43);
        short[] shortArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray58);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5275");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray28, intArray32);
        org.junit.Assert.assertArrayEquals(intArray18, intArray32);
        org.junit.Assert.assertArrayEquals(intArray4, intArray32);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray40, intArray41);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray44, intArray45);
        org.junit.Assert.assertArrayEquals(intArray41, intArray44);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray50, intArray51);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray54, intArray55);
        org.junit.Assert.assertArrayEquals(intArray51, intArray54);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray51, intArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray41, intArray59);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray65, intArray66);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray69, intArray70);
        org.junit.Assert.assertArrayEquals(intArray66, intArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray32, intArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = null;
        synonymsAnalysisTest75.analysisService = analysisService76;
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Fields fields80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        synonymsAnalysisTest75.assertFieldsEquals("tests.weekly", indexReader79, fields80, fields81, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService84 = synonymsAnalysisTest75.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService85 = synonymsAnalysisTest75.analysisService;
        synonymsAnalysisTest75.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = synonymsAnalysisTest75.analysisService;
        synonymsAnalysisTest75.overrideTestDefaultQueryCache();
        synonymsAnalysisTest75.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.AnalysisService analysisService92 = synonymsAnalysisTest75.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) analysisService92);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5276");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray22);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray37 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray38 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray39 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray40 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray37, testRuleIgnoreAfterMaxFailuresArray38, testRuleIgnoreAfterMaxFailuresArray39 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArrayList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, testRuleIgnoreAfterMaxFailuresArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray40);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5277");
        int[][] intArray1 = new int[][] {};
        int[][] intArray2 = new int[][] {};
        int[][] intArray3 = new int[][] {};
        int[][][] intArray4 = new int[][][] { intArray1, intArray2, intArray3 };
        int[][] intArray5 = new int[][] {};
        int[][] intArray6 = new int[][] {};
        int[][] intArray7 = new int[][] {};
        int[][][] intArray8 = new int[][][] { intArray5, intArray6, intArray7 };
        int[][] intArray9 = new int[][] {};
        int[][] intArray10 = new int[][] {};
        int[][] intArray11 = new int[][] {};
        int[][][] intArray12 = new int[][][] { intArray9, intArray10, intArray11 };
        int[][][][] intArray13 = new int[][][][] { intArray4, intArray8, intArray12 };
        java.util.List<int[][][]> intArrayList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, intArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals(objArray29, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray36);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray13, (java.lang.Object[]) executorServiceArray36);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0f, (float) (short) 100, (-1.0f));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5279");
        int[] intArray3 = new int[] { 0, (byte) -1 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray8, intArray12);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray18, intArray27);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray32, intArray35);
        org.junit.Assert.assertArrayEquals(intArray18, intArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray12, intArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray12);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) (byte) 10, (double) (byte) 10, (double) 10);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5281");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.getlogger();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest5.analysisService = analysisService6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.weekly", indexReader9, fields10, fields11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        synonymsAnalysisTest5.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest5.getlogger();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.nightly", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        synonymsAnalysisTest27.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest31.getlogger();
        java.lang.String str34 = synonymsAnalysisTest31.getTestName();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest31.failureAndSuccessEvents;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain35;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest18.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest18.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5282");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray2 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray3 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray4 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray5 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray6 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray7 = new org.junit.rules.RuleChain[][] { ruleChainArray1, ruleChainArray2, ruleChainArray3, ruleChainArray4, ruleChainArray5, ruleChainArray6 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray7);
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest12.analysisService = analysisService13;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.weekly", indexReader16, fields17, fields18, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest12.logger;
        synonymsAnalysisTest12.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.nightly", indexReader27, fields28, fields29, false);
        java.lang.String str32 = synonymsAnalysisTest25.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest25.analysisService;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("tests.nightly", indexReader35, (int) '#', postingsEnum37, postingsEnum38, true);
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) synonymsAnalysisTest25);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) executorServiceArray45);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) ruleChainArray7, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 0, (float) (byte) 10, 0.0f);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (byte) -1);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5285");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.nightly", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21);
        synonymsAnalysisTest15.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest24.getlogger();
        java.lang.String str27 = synonymsAnalysisTest24.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest28.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, false);
        java.lang.String str35 = synonymsAnalysisTest28.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest28.analysisService;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest28.assertDocsSkippingEquals("tests.nightly", indexReader38, (int) '#', postingsEnum40, postingsEnum41, true);
        synonymsAnalysisTest28.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest28.resetCheckIndexStatus();
        synonymsAnalysisTest28.assertPathHasBeenCleared("random");
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest28.failureAndSuccessEvents;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain49;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.setUp();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain53;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = null;
        synonymsAnalysisTest56.analysisService = analysisService57;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        synonymsAnalysisTest56.assertFieldsEquals("tests.weekly", indexReader60, fields61, fields62, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest56.analysisService;
        synonymsAnalysisTest56.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger67 = synonymsAnalysisTest56.logger;
        synonymsAnalysisTest56.ensureCleanedUp();
        synonymsAnalysisTest56.ensureCleanedUp();
        java.lang.Object obj70 = null;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest56, obj70);
        synonymsAnalysisTest56.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest73 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        synonymsAnalysisTest73.assertFieldsEquals("tests.nightly", indexReader75, fields76, fields77, false);
        java.lang.String str80 = synonymsAnalysisTest73.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService81 = synonymsAnalysisTest73.analysisService;
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest73.assertDocsSkippingEquals("tests.nightly", indexReader83, (int) '#', postingsEnum85, postingsEnum86, true);
        synonymsAnalysisTest73.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest73.resetCheckIndexStatus();
        synonymsAnalysisTest73.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule94 = synonymsAnalysisTest73.ruleChain;
        synonymsAnalysisTest73.setUp();
        org.junit.rules.RuleChain ruleChain96 = synonymsAnalysisTest73.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest56, (java.lang.Object) ruleChain96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain96);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5287");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest1.analysisService = analysisService19;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.nightly", indexReader24, (int) (byte) 1, postingsEnum26, postingsEnum27);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.nightly");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.monster", indexReader32, (int) (byte) 0, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) indexReader32);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5288");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals(objArray12, (java.lang.Object[]) executorServiceArray13);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals(objArray16, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray48);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        synonymsAnalysisTest55.assertFieldsEquals("tests.nightly", indexReader57, fields58, fields59, false);
        java.lang.String str62 = synonymsAnalysisTest55.getTestName();
        synonymsAnalysisTest55.ensureAllSearchContextsReleased();
        synonymsAnalysisTest55.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        synonymsAnalysisTest55.assertFieldsEquals("tests.awaitsfix", indexReader66, fields67, fields68, false);
        synonymsAnalysisTest55.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest55.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService74 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService75 = null;
        synonymsAnalysisTest55.setanalysisService(analysisService75);
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = synonymsAnalysisTest55.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger78 = synonymsAnalysisTest55.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) executorServiceArray48, (java.lang.Object) synonymsAnalysisTest55);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5289");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.badapples", indexReader5, (int) (short) 10, postingsEnum7, postingsEnum8, false);
        synonymsAnalysisTest0.setUp();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5290");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest3.setUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest3.logger;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest3.assertFieldsEquals("<unknown>", indexReader9, fields10, fields11, true);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest3.getlogger();
        org.junit.rules.RuleChain[][] ruleChainArray16 = new org.junit.rules.RuleChain[][] {};
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray16);
        org.junit.Assert.assertNotSame("", (java.lang.Object) eSLogger15, (java.lang.Object) ruleChainArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray28);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) executorServiceArray26);
        int[][][] intArray67 = new int[][][] {};
        java.util.Set<int[][]> intArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(intArray67);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) intArray67);
        java.util.List<java.lang.Object> objList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) ruleChainArray16, (java.lang.Object[]) executorServiceArray26);
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet72 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray16);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale74, locale76 };
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale79, locale81 };
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale84, locale86 };
        java.util.Locale locale89 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale91 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale89, locale91 };
        java.util.Locale[][] localeArray93 = new java.util.Locale[][] { localeArray77, localeArray82, localeArray87, localeArray92 };
        java.util.Set<java.util.Locale[]> localeArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) ruleChainArray16, (java.lang.Object[]) localeArray93);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5291");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader21, 100, postingsEnum23, postingsEnum24, false);
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest0.ruleChain;
        java.lang.Object obj28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule27, obj28);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5292");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.monster", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest15.logger;
        synonymsAnalysisTest15.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5294");
        java.lang.Object obj2 = null;
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray13, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray6, floatArray9, (float) 10);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray21, (java.lang.Object) synonymsAnalysisTest25);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray30, (-1.0f));
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) '4');
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) '4');
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray44, (float) 100);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals(objArray50, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray40, (java.lang.Object) executorServiceArray51);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray40, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray36, (float) ' ');
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray30, (float) 0);
        org.junit.Assert.assertNotSame("", obj2, (java.lang.Object) floatArray30);
        float[] floatArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray30, floatArray62, (float) (byte) 100);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5295");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray20);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5296");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest23.analysisService = analysisService24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.weekly", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest23.analysisService;
        synonymsAnalysisTest23.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest23.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest35.assertFieldsEquals("tests.nightly", indexReader37, fields38, fields39, false);
        java.lang.String str42 = synonymsAnalysisTest35.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest35.analysisService;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest35.assertDocsSkippingEquals("tests.nightly", indexReader45, (int) '#', postingsEnum47, postingsEnum48, true);
        synonymsAnalysisTest35.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest35.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) synonymsAnalysisTest35);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = null;
        synonymsAnalysisTest35.setanalysisService(analysisService55);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest35);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest35.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum59, postingsEnum60);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5297");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals(objArray16, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService62 = null;
        synonymsAnalysisTest61.analysisService = analysisService62;
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        synonymsAnalysisTest61.assertFieldsEquals("tests.weekly", indexReader65, fields66, fields67, false);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest61.assertDocsEnumEquals("tests.maxfailures", postingsEnum71, postingsEnum72, false);
        org.elasticsearch.common.logging.ESLogger eSLogger75 = synonymsAnalysisTest61.getlogger();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Fields fields78 = null;
        org.apache.lucene.index.Fields fields79 = null;
        synonymsAnalysisTest61.assertFieldsEquals("tests.nightly", indexReader77, fields78, fields79, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray50, (java.lang.Object) synonymsAnalysisTest61);
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest61.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues85, numericDocValues86);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5298");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray11, charArray18);
        org.junit.Assert.assertArrayEquals(charArray7, charArray11);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray11, charArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray11);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray11, charArray36);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("", charArray52, charArray59);
        org.junit.Assert.assertArrayEquals(charArray48, charArray52);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray52, charArray65);
        org.junit.Assert.assertArrayEquals(charArray41, charArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray11, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray11);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5299");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5301");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.weekly", postingsEnum14, postingsEnum15, false);
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader20, terms21, terms22, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertPositionsSkippingEquals("tests.nightly", indexReader28, (int) (byte) 1, postingsEnum30, postingsEnum31);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) terms22, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5302");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain4;
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet10 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray9);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRuleIgnoreAfterMaxFailuresSet10);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 2, (double) '4', (double) (byte) -1);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 100, (double) 10.0f);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5305");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.getanalysisService();
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) '4');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray17, 0.0f);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) floatArray13);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) '4');
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) '4');
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray39, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray32, floatArray35, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray13, floatArray35, (float) (short) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest50.analysisService = analysisService51;
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.weekly", indexReader54, fields55, fields56, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
        synonymsAnalysisTest50.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest50.logger;
        synonymsAnalysisTest50.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        synonymsAnalysisTest63.assertFieldsEquals("tests.nightly", indexReader65, fields66, fields67, false);
        java.lang.String str70 = synonymsAnalysisTest63.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService71 = synonymsAnalysisTest63.analysisService;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        synonymsAnalysisTest63.assertDocsSkippingEquals("tests.nightly", indexReader73, (int) '#', postingsEnum75, postingsEnum76, true);
        synonymsAnalysisTest63.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest50, (java.lang.Object) synonymsAnalysisTest63);
        synonymsAnalysisTest63.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        synonymsAnalysisTest63.assertTermsEquals("", indexReader84, terms85, terms86, true);
        synonymsAnalysisTest63.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.analysis.AnalysisService analysisService91 = null;
        synonymsAnalysisTest63.setanalysisService(analysisService91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 1, (java.lang.Object) synonymsAnalysisTest63);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5306");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest1.getanalysisService();
        java.lang.String str21 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest1.assertFieldsEquals("enwiki.random.lines.txt", indexReader26, fields27, fields28, true);
        java.lang.Object obj31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) fields28, obj31);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, 0.0f, (-1.0f));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5308");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5309");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray2, testRuleIgnoreAfterMaxFailuresArray3, testRuleIgnoreAfterMaxFailuresArray4, testRuleIgnoreAfterMaxFailuresArray5, testRuleIgnoreAfterMaxFailuresArray6, testRuleIgnoreAfterMaxFailuresArray7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray14 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray15 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray9, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray11, testRuleIgnoreAfterMaxFailuresArray12, testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray14 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray16 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray19 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray20 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray22 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray16, testRuleIgnoreAfterMaxFailuresArray17, testRuleIgnoreAfterMaxFailuresArray18, testRuleIgnoreAfterMaxFailuresArray19, testRuleIgnoreAfterMaxFailuresArray20, testRuleIgnoreAfterMaxFailuresArray21 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray23 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray24 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray25 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray26 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray27 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray28 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] {};
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray29 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray23, testRuleIgnoreAfterMaxFailuresArray24, testRuleIgnoreAfterMaxFailuresArray25, testRuleIgnoreAfterMaxFailuresArray26, testRuleIgnoreAfterMaxFailuresArray27, testRuleIgnoreAfterMaxFailuresArray28 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] testRuleIgnoreAfterMaxFailuresArray30 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][] { testRuleIgnoreAfterMaxFailuresArray8, testRuleIgnoreAfterMaxFailuresArray15, testRuleIgnoreAfterMaxFailuresArray22, testRuleIgnoreAfterMaxFailuresArray29 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][][] testRuleIgnoreAfterMaxFailuresArray31 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][][] { testRuleIgnoreAfterMaxFailuresArray30 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][][]> testRuleIgnoreAfterMaxFailuresArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5310");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain7;
        synonymsAnalysisTest5.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest5.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest5);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader13, (int) '#', postingsEnum15, postingsEnum16);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.maxfailures");
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        synonymsAnalysisTest22.ensureAllSearchContextsReleased();
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.awaitsfix", indexReader33, fields34, fields35, false);
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest22.getlogger();
        synonymsAnalysisTest22.setUp();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest22.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger21, (java.lang.Object) testRule40);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5311");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.monster", indexReader32, (int) (byte) 0, postingsEnum34, postingsEnum35, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest15.analysisService = analysisService38;
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum42, postingsEnum43, true);
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest15.getlogger();
        java.lang.String str47 = synonymsAnalysisTest15.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain14, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 10, (float) 1L);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5313");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray11);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray17);
        java.lang.Class<?> wildcardClass20 = shortArray8.getClass();
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest25.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray21, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, false);
        java.lang.String str36 = synonymsAnalysisTest29.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest29.analysisService;
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest29.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = null;
        synonymsAnalysisTest29.setanalysisService(analysisService42);
        synonymsAnalysisTest29.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray21, (java.lang.Object) synonymsAnalysisTest29);
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray8, (java.lang.Object) floatArray21);
        float[] floatArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray47, (float) '#');
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5314");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 0);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5315");
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray6, 100.0d);
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray13 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray13, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray4, doubleArray11, (double) 10);
        double[] doubleArray21 = new double[] { 100L };
        double[] doubleArray23 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray23, 100.0d);
        double[] doubleArray28 = new double[] { 100L };
        double[] doubleArray30 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray30, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray21, doubleArray28, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray21, (double) (byte) 10);
        double[] doubleArray40 = new double[] { 100L };
        double[] doubleArray42 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray40, doubleArray42, 100.0d);
        double[] doubleArray47 = new double[] { 100L };
        double[] doubleArray49 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray47, doubleArray49, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray40, doubleArray47, (double) (-1L));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray21, doubleArray47, (double) (-1.0f));
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest56.setUp();
        synonymsAnalysisTest56.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        synonymsAnalysisTest56.assertTermsEquals("tests.weekly", indexReader61, terms62, terms63, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray21, (java.lang.Object) terms62);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 2, (double) (-1.0f));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5317");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        synonymsAnalysisTest12.setUp();
        java.lang.String str33 = synonymsAnalysisTest12.getTestName();
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader36, 0, postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest12.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5318");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.monster", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest21.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest21.logger;
        synonymsAnalysisTest21.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.junit.rules.RuleChain ruleChain27 = null;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest25.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest25.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) synonymsAnalysisTest25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 10L, (long) 10);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5320");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        java.lang.Class<?> wildcardClass14 = assertArray12.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray15 = new java.lang.reflect.GenericDeclaration[] { wildcardClass14 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, genericDeclarationArray15);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet17 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals(objArray32, (java.lang.Object[]) executorServiceArray33);
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals(objArray36, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray47);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray45);
        org.junit.rules.RuleChain[][][] ruleChainArray62 = new org.junit.rules.RuleChain[][][] {};
        java.util.Set<org.junit.rules.RuleChain[][]> ruleChainArraySet63 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) ruleChainArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray71);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray69);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray15, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5321");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService7);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5322");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest2);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals(objArray20, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest24.setanalysisService(analysisService26);
        synonymsAnalysisTest24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, false);
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray20, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.assertPathHasBeenCleared("europarl.lines.txt.gz");
        java.lang.String str39 = synonymsAnalysisTest24.getTestName();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest24.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "tests.weekly", (java.lang.Object) testRule40);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5323");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService4);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.awaitsfix", indexReader7, (int) (short) 10, postingsEnum9, postingsEnum10, false);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5324");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals(objArray28, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray29, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray18);
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals(objArray49, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray50);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals(objArray54, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray55);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray50);
        java.lang.Object[] objArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, objArray61);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5325");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService12);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.badapples", indexReader18, (int) '4', postingsEnum20, postingsEnum21, true);
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("<unknown>", postingsEnum28, postingsEnum29, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 100, 0.0d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) -1);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5329");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100L);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100, 10.0d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 1, 100.0d, (double) 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5333");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        synonymsAnalysisTest3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest3.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray30 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray28, executorServiceArray29 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray33, executorServiceArray34, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule24, (java.lang.Object) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        java.lang.String str48 = synonymsAnalysisTest41.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest41.analysisService;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) '#', postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest41.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest41.resetCheckIndexStatus();
        synonymsAnalysisTest41.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest41.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray68 = new java.util.concurrent.ExecutorService[][] { executorServiceArray65, executorServiceArray66, executorServiceArray67 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][] { executorServiceArray71, executorServiceArray72, executorServiceArray73 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray74);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule62, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray83 = new java.util.concurrent.ExecutorService[][] { executorServiceArray80, executorServiceArray81, executorServiceArray82 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList84 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray83);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray83);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest86 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService87 = synonymsAnalysisTest86.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = null;
        synonymsAnalysisTest86.setanalysisService(analysisService88);
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = synonymsAnalysisTest86.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray83, (java.lang.Object) analysisService90);
        java.util.Set<java.lang.Object[]> objArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) executorServiceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) executorServiceArray83);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5334");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader35, 0, postingsEnum37, postingsEnum38, false);
        synonymsAnalysisTest15.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest15.getlogger();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("hi!", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        synonymsAnalysisTest49.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest49.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        java.lang.String str55 = synonymsAnalysisTest49.getTestName();
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest49.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) postingsEnum46, (java.lang.Object) eSLogger57);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5335");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) queryCachingPolicy4);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals(objArray11, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) executorServiceArray12);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) boolean16);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (byte) 10, (-1.0f));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5337");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0f), (float) (byte) 100, (float) 100L);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 'a', (double) 1);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5339");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        java.lang.String str7 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.slow", indexReader9, fields10, fields11, true);
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest2.ruleChain;
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest2.ruleChain;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) testRule15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) testRule15);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5340");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService13);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 0, (long) '#');
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5342");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest13.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest13.analysisService;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.nightly", indexReader23, (int) '#', postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader36, fields37, fields38, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest43.analysisService = analysisService44;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest43.assertFieldsEquals("tests.weekly", indexReader47, fields48, fields49, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest43.analysisService;
        synonymsAnalysisTest43.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger54 = synonymsAnalysisTest43.logger;
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest60.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger62 = synonymsAnalysisTest60.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray56, (java.lang.Object) synonymsAnalysisTest60);
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain64;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain64);
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain64;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain64;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService70 = null;
        synonymsAnalysisTest69.analysisService = analysisService70;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        synonymsAnalysisTest69.assertFieldsEquals("tests.weekly", indexReader73, fields74, fields75, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService78 = synonymsAnalysisTest69.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = synonymsAnalysisTest69.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService80 = null;
        synonymsAnalysisTest69.setanalysisService(analysisService80);
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        synonymsAnalysisTest69.assertTermsEquals("tests.weekly", indexReader83, terms84, terms85, false);
        synonymsAnalysisTest69.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest69.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) ' ', (float) (byte) -1, (float) (short) 1);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5344");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13, false);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5345");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray6, 100.0d);
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray13 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray13, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray4, doubleArray11, (double) (-1L));
        double[] doubleArray21 = new double[] { 100L };
        double[] doubleArray23 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray23, 100.0d);
        double[] doubleArray28 = new double[] { 100L };
        double[] doubleArray30 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray30, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray21, doubleArray28, (double) (-1L));
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray21, (double) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray11, (-1.0d));
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5346");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray15);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals(objArray24, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = null;
        synonymsAnalysisTest31.analysisService = analysisService32;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest31.assertFieldsEquals("tests.weekly", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest31.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest31.analysisService;
        synonymsAnalysisTest31.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest31.setanalysisService(analysisService44);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest31.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray53);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService46, (java.lang.Object) executorServiceArray51);
        java.lang.Object[] objArray64 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals(objArray64, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray65);
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals(objArray69, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray79);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray77);
        java.lang.Object[] objArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, objArray85);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, 10L);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5348");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader6, fields7, fields8, true);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        java.lang.String str13 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest15.getanalysisService();
        org.junit.Assert[] assertArray26 = new org.junit.Assert[] { synonymsAnalysisTest15 };
        java.util.Set<org.junit.Assert> assertSet27 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest28.assertFieldsEquals("tests.nightly", indexReader30, fields31, fields32, false);
        java.lang.String str35 = synonymsAnalysisTest28.getTestName();
        synonymsAnalysisTest28.ensureAllSearchContextsReleased();
        synonymsAnalysisTest28.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest28.assertFieldsEquals("tests.awaitsfix", indexReader39, fields40, fields41, false);
        synonymsAnalysisTest28.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest28.ensureCleanedUp();
        synonymsAnalysisTest28.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest28.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) assertSet27, (java.lang.Object) synonymsAnalysisTest28);
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest28.setanalysisService(analysisService51);
        synonymsAnalysisTest28.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        synonymsAnalysisTest28.assertTermsEquals("tests.weekly", indexReader55, terms56, terms57, false);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest28.assertDocsEnumEquals("tests.badapples", postingsEnum61, postingsEnum62, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest65 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest65.setUp();
        org.junit.rules.RuleChain ruleChain67 = null;
        synonymsAnalysisTest65.failureAndSuccessEvents = ruleChain67;
        synonymsAnalysisTest65.overrideTestDefaultQueryCache();
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService75 = synonymsAnalysisTest74.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger76 = synonymsAnalysisTest74.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray70, (java.lang.Object) synonymsAnalysisTest74);
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest74.failureAndSuccessEvents;
        synonymsAnalysisTest65.failureAndSuccessEvents = ruleChain78;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain78;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain78;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain78;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum85, postingsEnum86);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) 3);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5350");
        short[] shortArray4 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray8 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray12 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray16 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[][] shortArray17 = new short[][] { shortArray4, shortArray8, shortArray12, shortArray16 };
        short[] shortArray21 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray25 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray29 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[] shortArray33 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        short[][] shortArray34 = new short[][] { shortArray21, shortArray25, shortArray29, shortArray33 };
        short[][][] shortArray35 = new short[][][] { shortArray17, shortArray34 };
        java.util.Set<short[][]> shortArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray35);
        java.util.Set<short[][]> shortArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) shortArray35);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5351");
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
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray15);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray19, shortArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray19);
        int[][][][][][] intArray27 = new int[][][][][][] {};
        int[][][][][][] intArray28 = new int[][][][][][] {};
        int[][][][][][] intArray29 = new int[][][][][][] {};
        int[][][][][][] intArray30 = new int[][][][][][] {};
        int[][][][][][] intArray31 = new int[][][][][][] {};
        int[][][][][][] intArray32 = new int[][][][][][] {};
        int[][][][][][][] intArray33 = new int[][][][][][][] { intArray27, intArray28, intArray29, intArray30, intArray31, intArray32 };
        java.util.Set<int[][][][][][]> intArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) intArraySet34);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5352");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.nightly", indexReader11, fields12, fields13, false);
        java.lang.String str16 = synonymsAnalysisTest9.getTestName();
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.awaitsfix", indexReader20, fields21, fields22, false);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest9.getlogger();
        synonymsAnalysisTest9.setUp();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest9.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest9);
        synonymsAnalysisTest9.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5353");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 2, (float) (byte) -1, (float) 2);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5354");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray4 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray7, executorServiceArray8, executorServiceArray9 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray10);
        java.util.List[] listArray13 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.concurrent.ExecutorService[]>[] executorServiceArrayListArray14 = (java.util.List<java.util.concurrent.ExecutorService[]>[]) listArray13;
        executorServiceArrayListArray14[0] = executorServiceArrayList5;
        executorServiceArrayListArray14[1] = executorServiceArrayList11;
        java.util.Set<java.util.List<java.util.concurrent.ExecutorService[]>> executorServiceArrayListSet19 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArrayListArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArrayListSet19, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 100);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0d, (double) 100);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5357");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest2.getanalysisService();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray26 = new org.junit.rules.RuleChain[] { ruleChain25 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, ruleChainArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray35);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray43);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals(objArray50, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray57);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = null;
        synonymsAnalysisTest68.analysisService = analysisService69;
        org.junit.rules.RuleChain ruleChain71 = synonymsAnalysisTest68.failureAndSuccessEvents;
        synonymsAnalysisTest68.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray65, (java.lang.Object) synonymsAnalysisTest68);
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) ruleChainArray26, (java.lang.Object[]) executorServiceArray43);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5358");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.nightly", indexReader7, terms8, terms9, false);
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", 1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) '4');
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (short) -1, (float) (byte) -1);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5361");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass18 = synonymsAnalysisTest0.getClass();
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals(objArray30, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray31, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray48);
        java.lang.Object[] objArray55 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals(objArray55, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray56, (java.lang.Object) 0L);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray20, (java.lang.Object) "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass18, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5362");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest2.analysisService = analysisService9;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest2.logger;
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) synonymsAnalysisTest2);
        synonymsAnalysisTest2.setUp();
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals(charArray15, charArray19);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
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
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray35, charArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray25, charArray48);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray53, charArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray48, charArray60);
        org.junit.Assert.assertArrayEquals(charArray15, charArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) charArray60);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5363");
        double[] doubleArray3 = new double[] { 100L };
        double[] doubleArray5 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray5, 100.0d);
        double[] doubleArray10 = new double[] { 100L };
        double[] doubleArray12 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray10, doubleArray12, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray10, (double) 10);
        double[] doubleArray21 = new double[] { 100L };
        double[] doubleArray23 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray23, 100.0d);
        double[] doubleArray28 = new double[] { 100L };
        double[] doubleArray30 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray28, doubleArray30, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray21, doubleArray28, (double) (-1L));
        double[] doubleArray38 = new double[] { 100L };
        double[] doubleArray40 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray40, 100.0d);
        double[] doubleArray45 = new double[] { 100L };
        double[] doubleArray47 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray45, doubleArray47, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray38, doubleArray45, (double) (-1L));
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray21, doubleArray38, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray21, (double) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        synonymsAnalysisTest56.assertFieldsEquals("tests.nightly", indexReader58, fields59, fields60, false);
        java.lang.String str63 = synonymsAnalysisTest56.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest56.analysisService;
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        synonymsAnalysisTest56.assertDocsSkippingEquals("tests.nightly", indexReader66, (int) '#', postingsEnum68, postingsEnum69, true);
        synonymsAnalysisTest56.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService74 = null;
        synonymsAnalysisTest56.analysisService = analysisService74;
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest56.assertTermsEquals("", indexReader77, terms78, terms79, true);
        synonymsAnalysisTest56.setUp();
        org.junit.rules.TestRule testRule83 = synonymsAnalysisTest56.ruleChain;
        synonymsAnalysisTest56.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest56.getanalysisService();
        synonymsAnalysisTest56.ensureCheckIndexPassed();
        synonymsAnalysisTest56.tearDown();
        synonymsAnalysisTest56.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = null;
        synonymsAnalysisTest56.setanalysisService(analysisService90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray3, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5364");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.getlogger();
        java.lang.String str16 = synonymsAnalysisTest13.getTestName();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest0.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 10);
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService24);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum27, postingsEnum28, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5365");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain10);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.nightly", indexReader25, fields26, fields27, false);
        java.lang.String str30 = synonymsAnalysisTest23.getTestName();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest23.failureAndSuccessEvents;
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain[] ruleChainArray44 = new org.junit.rules.RuleChain[] { ruleChain10, ruleChain21, ruleChain31, ruleChain41 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet45 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray44);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChainArray44);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChainArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.lang.Object[] objArray62 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals(objArray62, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray63, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray83);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) ruleChainArray44, (java.lang.Object[]) executorServiceArray49);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5366");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) 100);
        java.lang.Object obj11 = null;
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray12, (java.lang.Object) synonymsAnalysisTest16);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray21, (-1.0f));
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) '4');
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) '4');
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray35, (float) 100);
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals(objArray41, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray31, (java.lang.Object) executorServiceArray42);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) ' ');
        org.junit.Assert.assertNotSame(obj11, (java.lang.Object) floatArray27);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest56.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest56.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray52, (java.lang.Object) synonymsAnalysisTest56);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray61, (-1.0f));
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) '4');
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray70, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray52, floatArray70, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray70, (float) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray27, (-1.0f));
        float[] floatArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray82, (float) (short) 10);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 2, (double) 10.0f);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) -1);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5369");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain22);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest26.analysisService = analysisService27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest26.assertFieldsEquals("tests.weekly", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest26.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest26.analysisService;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest26.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain22, (java.lang.Object) synonymsAnalysisTest26);
        synonymsAnalysisTest26.tearDown();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        synonymsAnalysisTest26.assertTermsEquals("tests.awaitsfix", indexReader41, terms42, terms43, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest26.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        synonymsAnalysisTest26.assertTermsEquals("hi!", indexReader48, terms49, terms50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        synonymsAnalysisTest26.assertTermsEquals("tests.monster", indexReader54, terms55, terms56, false);
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest26.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) testRule59);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5370");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.analysisService = analysisService15;
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((java.lang.Object) analysisService15, obj17);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5371");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Locale[][] localeArray14 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.Set<java.util.Locale[]> localeArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray38);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray44 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) annotatedElementArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) annotatedElementArray44);
        java.util.Locale[][] localeArray49 = new java.util.Locale[][] {};
        java.util.Set<java.util.Locale[]> localeArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.Set<java.util.Locale[]> localeArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.Set<java.util.Locale[]> localeArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Cloneable[]) localeArray49);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) localeArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray14, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) localeArray14);
        java.lang.Object[] objArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray14, objArray57);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5372");
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals(longArray7, longArray11);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray20);
        long[] longArray33 = new long[] { (byte) 10 };
        long[] longArray35 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray33, longArray35);
        long[] longArray39 = new long[] { (byte) 10 };
        long[] longArray41 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals(longArray35, longArray39);
        long[] longArray46 = new long[] { (byte) 10 };
        long[] longArray48 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray46, longArray48);
        long[] longArray52 = new long[] { (byte) 10 };
        long[] longArray54 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray52, longArray54);
        org.junit.Assert.assertArrayEquals(longArray48, longArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals(longArray11, longArray39);
        long[] longArray61 = new long[] { (byte) 10 };
        long[] longArray63 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray61, longArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray11, longArray61);
        long[] longArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray61, longArray66);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5373");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest5.analysisService = analysisService6;
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest5);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) '4');
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray16, (float) 100);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals(objArray22, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray12, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray23);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest30.analysisService = analysisService31;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.weekly", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest30.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest30.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest30.setanalysisService(analysisService41);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        synonymsAnalysisTest30.assertTermsEquals("tests.weekly", indexReader44, terms45, terms46, false);
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray28, (java.lang.Object) (short) 10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) annotatedElementArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", objArray1, (java.lang.Object[]) executorServiceArray23);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 100, (float) (byte) 0, 0.0f);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 100.0d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5376");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '#');
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, true);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest31.assertFieldsEquals("tests.nightly", indexReader33, fields34, fields35, false);
        java.lang.String str38 = synonymsAnalysisTest31.getTestName();
        synonymsAnalysisTest31.ensureAllSearchContextsReleased();
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest31.assertFieldsEquals("tests.awaitsfix", indexReader42, fields43, fields44, false);
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest31.getlogger();
        synonymsAnalysisTest31.setUp();
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest31.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest31.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest31.analysisService = analysisService51;
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        synonymsAnalysisTest54.assertFieldsEquals("tests.nightly", indexReader56, fields57, fields58, false);
        java.lang.String str61 = synonymsAnalysisTest54.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService62 = synonymsAnalysisTest54.analysisService;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        synonymsAnalysisTest54.assertDocsSkippingEquals("tests.nightly", indexReader64, (int) '#', postingsEnum66, postingsEnum67, true);
        synonymsAnalysisTest54.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest54.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest54.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) synonymsAnalysisTest31, (java.lang.Object) synonymsAnalysisTest54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest54);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5377");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray6);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray19);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray16, byteArray32);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray32, byteArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray44);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray55);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray55, byteArray58);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray55, byteArray70);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray75);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray74);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray83);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray85, byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray86);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5378");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (-1));
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) '4');
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0f), (float) '#', (float) (short) 0);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5381");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
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
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray14, charArray27);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray4, charArray27);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("", charArray27, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray44, charArray51);
        org.junit.Assert.assertArrayEquals(charArray40, charArray44);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        org.junit.Assert.assertArrayEquals(charArray40, charArray56);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray65, charArray69);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals(charArray73, charArray77);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals("", charArray73, charArray80);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        char[] charArray85 = new char[] {};
        char[] charArray86 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray85, charArray86);
        char[] charArray88 = new char[] {};
        char[] charArray89 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray88, charArray89);
        org.junit.Assert.assertArrayEquals(charArray85, charArray89);
        org.junit.Assert.assertArrayEquals(charArray69, charArray85);
        char[] charArray93 = new char[] {};
        char[] charArray94 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray93, charArray94);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray85, charArray93);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray40, charArray85);
        org.junit.Assert.assertArrayEquals(charArray27, charArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray27);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5382");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("tests.nightly", indexReader37, (int) (byte) 1, postingsEnum39, postingsEnum40);
        synonymsAnalysisTest34.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        synonymsAnalysisTest43.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest47.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest47.getlogger();
        java.lang.String str50 = synonymsAnalysisTest47.getTestName();
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain51;
        org.elasticsearch.common.logging.ESLogger eSLogger54 = synonymsAnalysisTest34.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = null;
        synonymsAnalysisTest55.analysisService = analysisService56;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        synonymsAnalysisTest55.assertFieldsEquals("tests.weekly", indexReader59, fields60, fields61, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService65 = synonymsAnalysisTest55.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest55.setanalysisService(analysisService66);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        synonymsAnalysisTest55.assertTermsEquals("tests.weekly", indexReader69, terms70, terms71, false);
        synonymsAnalysisTest55.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest34, (java.lang.Object) (short) 10);
        org.elasticsearch.index.analysis.AnalysisService analysisService77 = null;
        synonymsAnalysisTest34.analysisService = analysisService77;
        org.elasticsearch.common.logging.ESLogger eSLogger79 = synonymsAnalysisTest34.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        synonymsAnalysisTest34.assertDocsEnumEquals("random", postingsEnum81, postingsEnum82, false);
        synonymsAnalysisTest34.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest34);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5383");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        java.lang.Class<?> wildcardClass12 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService15);
        synonymsAnalysisTest13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.awaitsfix", indexReader19, fields20, fields21, false);
        java.lang.Class<?> wildcardClass24 = synonymsAnalysisTest13.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest25.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest25.setanalysisService(analysisService27);
        synonymsAnalysisTest25.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.awaitsfix", indexReader31, fields32, fields33, false);
        java.lang.Class<?> wildcardClass36 = synonymsAnalysisTest25.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest37.setanalysisService(analysisService39);
        synonymsAnalysisTest37.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest37.assertFieldsEquals("tests.awaitsfix", indexReader43, fields44, fields45, false);
        java.lang.Class<?> wildcardClass48 = synonymsAnalysisTest37.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass50 = throttling49.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass52 = throttling51.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray53 = new java.lang.reflect.AnnotatedElement[] { wildcardClass12, wildcardClass24, wildcardClass36, wildcardClass48, wildcardClass50, wildcardClass52 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet54 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray53);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest55.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = null;
        synonymsAnalysisTest55.setanalysisService(analysisService57);
        synonymsAnalysisTest55.ensureAllSearchContextsReleased();
        synonymsAnalysisTest55.resetCheckIndexStatus();
        synonymsAnalysisTest55.assertPathHasBeenCleared("random");
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) annotatedElementArray53, (java.lang.Object) synonymsAnalysisTest55);
        synonymsAnalysisTest55.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest55.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues67, numericDocValues68);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5384");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest11.assertFieldsEquals("tests.nightly", indexReader13, fields14, fields15, false);
        java.lang.String str18 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest11.analysisService;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("tests.nightly", indexReader21, (int) '#', postingsEnum23, postingsEnum24, true);
        synonymsAnalysisTest11.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest11.resetCheckIndexStatus();
        synonymsAnalysisTest11.assertPathHasBeenCleared("random");
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain32;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest35.analysisService = analysisService36;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest35.assertFieldsEquals("tests.weekly", indexReader39, fields40, fields41, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest35.analysisService;
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest35.logger;
        synonymsAnalysisTest35.ensureCleanedUp();
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        synonymsAnalysisTest49.assertFieldsEquals("tests.nightly", indexReader51, fields52, fields53, false);
        java.lang.String str56 = synonymsAnalysisTest49.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest49.analysisService;
        synonymsAnalysisTest49.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest49.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = null;
        synonymsAnalysisTest49.setanalysisService(analysisService60);
        org.elasticsearch.index.analysis.AnalysisService analysisService62 = null;
        synonymsAnalysisTest49.analysisService = analysisService62;
        synonymsAnalysisTest49.assertPathHasBeenCleared("tests.nightly");
        org.junit.Assert.assertNotSame("", (java.lang.Object) synonymsAnalysisTest35, (java.lang.Object) "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) ruleChain32, (java.lang.Object) "");
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), (double) ' ');
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 100, (double) (-1.0f));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5387");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest16.setanalysisService(analysisService18);
        synonymsAnalysisTest16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.awaitsfix", indexReader22, fields23, fields24, false);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest16.failureAndSuccessEvents;
        java.lang.String str28 = synonymsAnalysisTest16.getTestName();
        java.lang.String str29 = synonymsAnalysisTest16.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5388");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals(objArray25, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray32);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray32);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest65 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService66 = null;
        synonymsAnalysisTest65.analysisService = analysisService66;
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest65.failureAndSuccessEvents;
        synonymsAnalysisTest65.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray62, (java.lang.Object) synonymsAnalysisTest65);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.monster");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5389");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader4, (int) (byte) 1, postingsEnum6, postingsEnum7);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest14.getlogger();
        java.lang.String str17 = synonymsAnalysisTest14.getTestName();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain18;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest22.getanalysisService();
        synonymsAnalysisTest22.setIndexWriterMaxDocs(1);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain18, (java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest22.analysisService;
        synonymsAnalysisTest22.tearDown();
        synonymsAnalysisTest22.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest22.ensureAllSearchContextsReleased();
        synonymsAnalysisTest22.setIndexWriterMaxDocs((int) ' ');
        java.lang.String str43 = synonymsAnalysisTest22.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest22.assertDocValuesEquals("tests.nightly", (int) '4', numericDocValues46, numericDocValues47);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5390");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) 0L, (-1.0f));
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5391");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) (byte) -1, (float) 0L);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) 100, (double) (short) -1, (double) (-1L));
    }
}

