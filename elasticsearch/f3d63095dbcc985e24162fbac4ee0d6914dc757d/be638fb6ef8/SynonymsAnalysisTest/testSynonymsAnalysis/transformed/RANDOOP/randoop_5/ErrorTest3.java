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
        java.lang.Object obj1 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray6 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray3, genericDeclarationArray4, genericDeclarationArray5 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray6);
        java.util.List<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, genericDeclarationArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", obj1, (java.lang.Object) genericDeclarationArray6);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray7 = new int[] { (short) 0, 2, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.badapples", postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        synonymsAnalysisTest9.setIndexWriterMaxDocs((int) (short) 10);
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest34.logger;
        synonymsAnalysisTest34.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest9, synonymsAnalysisTest19, synonymsAnalysisTest34 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet39 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray38);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet40 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray38);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet41 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray38);
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) analysisService6, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest43.setUp();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest43.assertDocsSkippingEquals("hi!", indexReader46, 0, postingsEnum48, postingsEnum49, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = synonymsAnalysisTest43.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest43.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        synonymsAnalysisTest43.assertTermsEquals("tests.awaitsfix", indexReader55, terms56, terms57, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) terms57);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("", indexReader5, fields6, fields7, true);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest1.logger;
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
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest11);
        org.apache.lucene.index.NumericDocValues numericDocValues69 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.awaitsfix", 1, numericDocValues69, numericDocValues70);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 2, (double) 3, (double) '4');
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        long[] longArray1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray3);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) 0, (double) (byte) 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
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
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray17);
        org.junit.Assert.assertArrayEquals("", longArray9, longArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) ' ');
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader13, 5, postingsEnum15, postingsEnum16);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
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
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
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
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray41, (java.lang.Object) (-1.0f));
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray41);
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
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray63, (java.lang.Object) (-1.0f));
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray63, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray80, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray80);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray88, (java.lang.Object) (-1.0f));
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray41, (java.lang.Object) executorServiceArray80);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) boolean96);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.setUp();
        synonymsAnalysisTest6.ensureCleanedUp();
        synonymsAnalysisTest6.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("hi!", 0, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        double[][] doubleArray1 = new double[][] {};
        java.util.Set<double[]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) doubleArraySet2);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (-1), (long) (byte) -1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0d, (double) (short) 100, (double) (short) -1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) 5, (double) (short) 1, (double) 100);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
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
        char[] charArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray3, charArray28);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, (double) 0L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) 10, (float) 3);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.badapples", indexReader33, (int) (short) 10, postingsEnum35, postingsEnum36);
        java.lang.String str38 = synonymsAnalysisTest21.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
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
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest16);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.badapples", indexReader37, fields38, fields39, true);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest16.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCleanedUp();
        synonymsAnalysisTest7.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest7);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.ensureCheckIndexPassed();
        synonymsAnalysisTest23.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest23);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest23.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) synonymsAnalysisTest23);
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
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) (short) 0);
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray59, (float) 10);
        float[] floatArray64 = new float[] {};
        float[] floatArray65 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray65, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, (float) 5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger72 = synonymsAnalysisTest71.getlogger();
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) (short) 0);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray78, (float) 10);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) eSLogger72, (java.lang.Object) floatArray73);
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray73, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray42, floatArray64, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0, 1.0d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain14);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (double) 0, 10.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest16.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest16.logger;
        synonymsAnalysisTest16.setUp();
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest16.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) false, (java.lang.Object) analysisService34);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest6.assertFieldsEquals("<unknown>", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest6.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str27);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        char[] charArray2 = new char[] { ' ', 'a' };
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
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
        org.junit.Assert.assertArrayEquals("tests.monster", charArray6, charArray9);
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray23, charArray27);
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
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals(charArray31, charArray44);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray21, charArray31);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray48, charArray52);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray63);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertArrayEquals(charArray31, charArray52);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
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
        org.junit.Assert.assertArrayEquals("tests.monster", charArray71, charArray74);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray86, charArray87);
        char[] charArray89 = new char[] {};
        char[] charArray90 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray89, charArray90);
        org.junit.Assert.assertArrayEquals(charArray86, charArray90);
        org.junit.Assert.assertArrayEquals(charArray71, charArray86);
        org.junit.Assert.assertArrayEquals(charArray31, charArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray31);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 10L, (long) 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
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
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
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
        java.lang.Class<?> wildcardClass34 = synonymsAnalysisTest16.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) wildcardClass34);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.ensureCheckIndexPassed();
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest9.analysisService;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.weekly", indexReader15, fields16, fields17, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest9.analysisService;
        synonymsAnalysisTest9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, true);
        java.lang.Class<?> wildcardClass28 = synonymsAnalysisTest9.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest29.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("hi!", indexReader32, 0, postingsEnum34, postingsEnum35, true);
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest29.ruleChain;
        java.lang.Class<?> wildcardClass39 = synonymsAnalysisTest29.getClass();
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray51, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.lang.Object obj57 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray46, obj57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.lang.Class<?> wildcardClass61 = executorServiceArray46.getClass();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) wildcardClass61);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        synonymsAnalysisTest63.assertFieldsEquals("tests.failfast", indexReader65, fields66, fields67, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService70 = null;
        synonymsAnalysisTest63.setanalysisService(analysisService70);
        java.lang.Class<?> wildcardClass72 = synonymsAnalysisTest63.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = new java.lang.reflect.GenericDeclaration[] { wildcardClass28, wildcardClass39, wildcardClass61, wildcardClass72 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray74 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray73 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) genericDeclarationArray74);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 0, 100.0d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0, (double) 2);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
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
        org.junit.Assert.assertArrayEquals(charArray2, charArray13);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) charArray2);
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
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray76, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray76);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
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
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray85, shortArray86);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray89);
        org.junit.Assert.assertArrayEquals("random", shortArray75, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray65);
        short[] shortArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray97);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10, 0.0d, (double) (short) 1);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest0.assertTermsEquals("hi!", indexReader6, terms7, terms8, false);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", 4, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest0.analysisService = analysisService3;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.getanalysisService();
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        synonymsAnalysisTest5.tearDown();
        java.lang.Object obj9 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest5, obj9);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest5.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest5.analysisService = analysisService12;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.badapples", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest32.assertDocsSkippingEquals("hi!", indexReader35, 0, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain42;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain42;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain42;
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest0.analysisService = analysisService46;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100.0f);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 10.0f, 0.0d, (double) '4');
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
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
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule17);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray34);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) '4', (java.lang.Object) boolean54);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader20, 1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", 2, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.weekly", indexReader14, (int) (short) 100, postingsEnum16, postingsEnum17, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader14);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100, (double) (short) 100, (double) 4);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) ' ');
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
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
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), 0.0d, (double) 10.0f);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService6);
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) synonymsAnalysisTest1);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray9, charArray26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling36 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35, throttling36, throttling37, throttling38, throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest42, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest42.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttlingEnumSet41, (java.lang.Object) eSLogger45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray26, (java.lang.Object) eSLogger45);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger8);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 0, (long) (short) 10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 3, (double) (short) 10, (double) 3);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0L, 1L);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 0, (long) ' ');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest33.assertDocsSkippingEquals("hi!", indexReader36, 0, postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest33.analysisService;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest33.assertFieldsEquals("random", indexReader44, fields45, fields46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        synonymsAnalysisTest33.assertTermsEquals("tests.weekly", indexReader50, terms51, terms52, false);
        synonymsAnalysisTest33.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest33.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest58.setUp();
        synonymsAnalysisTest58.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService57, (java.lang.Object) synonymsAnalysisTest58);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        synonymsAnalysisTest58.assertTermsEquals("europarl.lines.txt.gz", indexReader63, terms64, terms65, true);
        org.junit.rules.TestRule testRule68 = synonymsAnalysisTest58.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest58);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10L, (long) (byte) 1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest1.getlogger();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest9.getanalysisService();
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        synonymsAnalysisTest9.tearDown();
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest9, obj13);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest9.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest9.analysisService = analysisService16;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("tests.badapples", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("hi!", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest36.analysisService;
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain46;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService52);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        synonymsAnalysisTest56.assertDocsEnumEquals("tests.badapples", postingsEnum58, postingsEnum59, true);
        synonymsAnalysisTest56.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest56);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) (-1), (java.lang.Object) synonymsAnalysisTest56);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) analysisService52, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 100);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) (byte) 10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        char[] charArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0.0f, (double) (short) -1, 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest0.getanalysisService();
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray17, charArray21);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray25, charArray29);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray25, charArray32);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray25, charArray38);
        org.junit.Assert.assertArrayEquals(charArray14, charArray25);
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
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals(charArray55, charArray59);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals("", charArray55, charArray62);
        org.junit.Assert.assertArrayEquals(charArray50, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray14, charArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService12, (java.lang.Object) charArray55);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.getanalysisService();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        synonymsAnalysisTest7.tearDown();
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest7, obj11);
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest7.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest7.analysisService = analysisService14;
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest7.logger;
        synonymsAnalysisTest7.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (short) 100);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray9 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray13 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray14 = new short[][] { shortArray5, shortArray9, shortArray13 };
        java.util.List<short[]> shortArrayList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray14);
        java.util.List<short[]> shortArrayList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, shortArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.badapples", postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest18.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (int) '4', postingsEnum30, postingsEnum31);
        synonymsAnalysisTest18.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0, (double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, (long) (byte) 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest9.assertTermsEquals("tests.weekly", indexReader25, terms26, terms27, true);
        synonymsAnalysisTest9.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (-1), 100L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray6, (java.lang.Object) (-1.0f));
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray19, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.lang.Object obj25 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray14, obj25);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray34, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray42, (java.lang.Object) (-1.0f));
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray56, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray64, (java.lang.Object) (-1.0f));
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) executorServiceArray64, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray42);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray1, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
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
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader20, terms21, terms22, false);
        java.lang.String str25 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest26.assertDocsEnumEquals("tests.badapples", postingsEnum28, postingsEnum29, true);
        synonymsAnalysisTest26.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest26);
        synonymsAnalysisTest26.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest26.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest26.assertPositionsSkippingEquals("tests.awaitsfix", indexReader38, (int) 'a', postingsEnum40, postingsEnum41);
        synonymsAnalysisTest26.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest26);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 'a', (double) 100L, (double) (short) 100);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 5);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (short) 100, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 100.0d, (double) 3);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) -1);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
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
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) localeArray24);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
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
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
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
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
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
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray2, obj13);
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, objArray15);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest7.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest7.analysisService;
        synonymsAnalysisTest7.tearDown();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("tests.failfast", indexReader21, 2, postingsEnum23, postingsEnum24, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) analysisService6, (java.lang.Object) indexReader21);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 4, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(0);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) shortArray18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 2, (double) (short) 100);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest1.analysisService = analysisService18;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest1.logger;
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 10.0d, (double) (short) -1);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
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
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
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
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest19.analysisService;
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
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain41;
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest19.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        java.lang.Object[] objArray1 = null;
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray40);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray28);
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray13);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray17, longArray21);
        org.junit.Assert.assertArrayEquals("", longArray13, longArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest26.getanalysisService();
        synonymsAnalysisTest26.overrideTestDefaultQueryCache();
        synonymsAnalysisTest26.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest26.assertDocsSkippingEquals("random", indexReader31, 3, postingsEnum33, postingsEnum34, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = null;
        synonymsAnalysisTest26.setanalysisService(analysisService37);
        java.lang.Class<?> wildcardClass39 = synonymsAnalysisTest26.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) wildcardClass39);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (short) 0);
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 10);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) (short) 0);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray15, (float) 10);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray20, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray20, (float) (short) 10);
        java.lang.Object obj29 = null;
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 0);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) 10);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray45, (float) 10);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray50, (float) (short) 10);
        org.junit.Assert.assertNotEquals("tests.nightly", obj29, (java.lang.Object) floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray50, (float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray50);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray20);
        org.junit.Assert.assertArrayEquals(longArray12, longArray20);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray29, longArray30);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray34);
        org.junit.Assert.assertArrayEquals(longArray26, longArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray20, longArray30);
        org.junit.Assert.assertArrayEquals(longArray5, longArray30);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray41, longArray42);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray46);
        org.junit.Assert.assertArrayEquals(longArray5, longArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray46);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.logger;
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
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest30);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.badapples", indexReader51, fields52, fields53, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) ' ', numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
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
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) shortArray50);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1), (double) ' ');
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest0.getlogger();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest8.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain21;
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
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) synonymsAnalysisTest23);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest8.assertDocsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44, true);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        synonymsAnalysisTest8.assertTermsEquals("tests.slow", indexReader48, terms49, terms50, false);
        synonymsAnalysisTest8.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (-1L));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        java.lang.Object[] objArray0 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        java.lang.Class<?> wildcardClass10 = shortArray6.getClass();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray17);
        java.lang.Class<?> wildcardClass19 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass19 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet21 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) genericDeclarationArray20);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) '#', 10.0f);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
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
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("tests.weekly", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService34);
        synonymsAnalysisTest20.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest20.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService37);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(5);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        java.lang.Class<?> wildcardClass50 = shortArray46.getClass();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray57);
        java.lang.Class<?> wildcardClass59 = charSequenceArray57.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray60 = new java.lang.reflect.GenericDeclaration[] { wildcardClass50, wildcardClass59 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet61 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) genericDeclarationArray60);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest14.getanalysisService();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest14.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray5, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 0, (long) 'a');
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest6.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest6.setanalysisService(analysisService10);
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest6.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger12);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
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
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        synonymsAnalysisTest17.ensureCleanedUp();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest17.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest17.getlogger();
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest17.logger;
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest28.getanalysisService();
        synonymsAnalysisTest28.overrideTestDefaultQueryCache();
        synonymsAnalysisTest28.tearDown();
        java.lang.Object obj32 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest28, obj32);
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest28.ruleChain;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest28.assertFieldsEquals("tests.monster", indexReader36, fields37, fields38, true);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain27, (java.lang.Object) "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain16, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 5, (double) 3);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, (double) '#', (double) 100.0f);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 0.0d, (double) 1.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1L), (double) 2);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (-1), (long) 4);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) (byte) 100, 10.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
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
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("tests.weekly", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService24);
        synonymsAnalysisTest10.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("hi!", indexReader28, (int) (short) -1, postingsEnum30, postingsEnum31);
        synonymsAnalysisTest10.setIndexWriterMaxDocs(100);
        java.lang.String str35 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 100);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService14);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) ruleChain16);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 3);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 10.0f, (float) 4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
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
        java.lang.Object[] objArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray4, objArray36);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.failfast", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService9);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) ruleChain12);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        char[] charArray1 = null;
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
        org.junit.Assert.assertArrayEquals(charArray2, charArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray13);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 10L, (float) (byte) 1);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 0, (long) (byte) 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (short) 10, (-1.0f));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) eSLogger12);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (-1L));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) ' ', (double) 'a');
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
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
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray19);
        org.junit.Assert.assertArrayEquals("hi!", shortArray7, shortArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest24.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest24.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray7, (java.lang.Object) testRule32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray35);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray60);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray65, shortArray66);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray69);
        org.junit.Assert.assertArrayEquals("random", shortArray55, shortArray69);
        org.junit.Assert.assertArrayEquals("random", shortArray35, shortArray69);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray81);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray69, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray1, shortArray69);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest2.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest2.getlogger();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest2.logger;
        org.junit.Assert.assertNotNull("random", (java.lang.Object) synonymsAnalysisTest2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "random");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10, (double) 1.0f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest24.setUp();
        synonymsAnalysisTest24.ensureCheckIndexPassed();
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest24.analysisService;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.weekly", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest24.analysisService;
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.weekly", indexReader38, fields39, fields40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest24.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader44, 1, postingsEnum46, postingsEnum47, true);
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest24.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain50);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader4, fields5, fields6, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '#');
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
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
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest13.analysisService = analysisService25;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) -1);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 2);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 10, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest0.getanalysisService();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest5.setUp();
        synonymsAnalysisTest5.ensureCheckIndexPassed();
        synonymsAnalysisTest5.ensureCleanedUp();
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest5.resetCheckIndexStatus();
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        synonymsAnalysisTest5.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
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
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest10.analysisService = analysisService27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule9, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) -1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
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
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest25.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 0);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray43, (float) 10);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 0);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray53, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray38, floatArray53, (float) (byte) 10);
        float[] floatArray61 = new float[] {};
        float[] floatArray62 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray62, (float) (short) 0);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray66, (float) 10);
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray71, (float) 5);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) (short) 0);
        float[] floatArray81 = new float[] {};
        float[] floatArray82 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray81, floatArray82, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray82, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray66, floatArray77, 0.0f);
        float[] floatArray89 = new float[] {};
        float[] floatArray90 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray89, floatArray90, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray90, (float) (short) 1);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray90, (float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader32, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 0.0f);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 4);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        char[] charArray1 = null;
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray11);
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
        org.junit.Assert.assertArrayEquals(charArray11, charArray16);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray11, charArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray11);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray5);
        java.util.List<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, genericDeclarationArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsSkippingEquals("hi!", indexReader11, 0, postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest8.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest8.setanalysisService(analysisService24);
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest8.getlogger();
        short[] shortArray33 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray37 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray41 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray42 = new short[][] { shortArray33, shortArray37, shortArray41 };
        java.util.List<short[]> shortArrayList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray42);
        java.util.Set<java.lang.Cloneable> cloneableSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray42);
        java.util.List<short[]> shortArrayList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, shortArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) shortArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) genericDeclarationArray5, (java.lang.Object[]) shortArray42);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService15);
        synonymsAnalysisTest2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", obj1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        synonymsAnalysisTest6.ensureCheckIndexPassed();
        synonymsAnalysisTest6.ensureCleanedUp();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        synonymsAnalysisTest6.ensureCleanedUp();
        synonymsAnalysisTest6.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest6.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest6.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (int) '4', postingsEnum13, postingsEnum14);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("hi!", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest17.assertFieldsEquals("random", indexReader28, fields29, fields30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, false);
        synonymsAnalysisTest17.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain42;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '#', (double) 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        int[] intArray6 = new int[] { 4, (byte) 100, 'a', (short) 10, 1 };
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray13, intArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray8, intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
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
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 3, (double) 100);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 0, (long) 100);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[][] byteArray31 = new byte[][] { byteArray5, byteArray10, byteArray15, byteArray20, byteArray25, byteArray30 };
        java.util.Set<byte[]> byteArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray31);
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) byteArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("hi!", indexReader37, 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest34.analysisService;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest34);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest34.assertDocsSkippingEquals("tests.weekly", indexReader47, 5, postingsEnum49, postingsEnum50, false);
        synonymsAnalysisTest34.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) serializableSet33, (java.lang.Object) 10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader6, fields7, fields8, true);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest18.assertDocsSkippingEquals("hi!", indexReader21, 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest18.analysisService;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest18.assertFieldsEquals("random", indexReader29, fields30, fields31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        synonymsAnalysisTest18.assertTermsEquals("tests.weekly", indexReader35, terms36, terms37, false);
        synonymsAnalysisTest18.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("tests.weekly", indexReader44, (int) (short) -1, postingsEnum46, postingsEnum47);
        synonymsAnalysisTest18.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest18.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest52.getanalysisService();
        synonymsAnalysisTest52.overrideTestDefaultQueryCache();
        synonymsAnalysisTest52.overrideTestDefaultQueryCache();
        synonymsAnalysisTest52.setUp();
        synonymsAnalysisTest52.ensureCleanedUp();
        synonymsAnalysisTest52.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) synonymsAnalysisTest52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) indexReader13, (java.lang.Object) synonymsAnalysisTest52);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest4.logger;
        synonymsAnalysisTest4.setUp();
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest1.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
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
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray17);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray28, longArray32);
        org.junit.Assert.assertArrayEquals(longArray24, longArray32);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray37, longArray38);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray41, longArray42);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray46);
        org.junit.Assert.assertArrayEquals(longArray38, longArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray32, longArray42);
        org.junit.Assert.assertArrayEquals(longArray17, longArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray9, longArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray12, longArray16);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals("", longArray16, longArray24);
        org.junit.Assert.assertArrayEquals(longArray2, longArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray16);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setUp();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest4.assertPositionsSkippingEquals("tests.nightly", indexReader17, 5, postingsEnum19, postingsEnum20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum20);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest1.analysisService = analysisService9;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest12.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest22.setanalysisService(analysisService31);
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest22.logger;
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest22, obj34);
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest22.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest37.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        synonymsAnalysisTest37.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest12, synonymsAnalysisTest22, synonymsAnalysisTest37 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet42 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray41);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet43 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray41);
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet44 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray41);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, (org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) analysisService9, (java.lang.Object) synonymsAnalysisTestArray41);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("tests.slow", 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0.0d, (double) 10L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.getlogger();
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("random", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) 1L, 10.0f);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, 1.0d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) (short) 100);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
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
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) ruleChain18);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray32);
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
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) executorServiceArray55);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) (short) 1, (double) 10.0f);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader15, fields16, fields17, false);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray22, longArray23);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        org.junit.Assert.assertArrayEquals(longArray23, longArray31);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray36, longArray40);
        org.junit.Assert.assertArrayEquals(longArray23, longArray40);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray47, longArray48);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray51, longArray52);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray55, longArray56);
        org.junit.Assert.assertArrayEquals(longArray52, longArray56);
        org.junit.Assert.assertArrayEquals(longArray48, longArray56);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray61, longArray62);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray65, longArray66);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray69, longArray70);
        org.junit.Assert.assertArrayEquals(longArray66, longArray70);
        org.junit.Assert.assertArrayEquals(longArray62, longArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray56, longArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray23, longArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields16, (java.lang.Object) longArray23);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 100, 1L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (byte) 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("hi!", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest16.analysisService;
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest16.logger;
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest16.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) ' ', (double) (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest1.getClass();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray18, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClass11, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
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
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray67, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray86, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray86);
        java.lang.Object obj92 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray81, obj92);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray18);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (-1.0f));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
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
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
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
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray24, (java.lang.Object) (-1.0f));
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
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
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray36);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) boolean60);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.Class<?> wildcardClass21 = executorServiceArray1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", 10.0d, (double) 10, (double) '4');
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
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
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray11, floatArray17, 100.0f);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) (short) 0);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray29, (float) 10);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) 5);
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray34, floatArray40, 100.0f);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.slow", "europarl.lines.txt.gz", "tests.slow" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.util.Set<java.io.Serializable> serializableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray40, (java.lang.Object) strArray49);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray40, (float) (short) 0);
        float[] floatArray55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray55, (float) 1L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 10);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) 'a', numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100, (double) (byte) -1, (double) (short) 0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 100, (long) 100);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (short) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        char[] charArray1 = null;
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray10, charArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray7, charArray10);
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        org.junit.Assert.assertArrayEquals(charArray7, charArray24);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray33);
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
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray7, charArray44);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
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
        org.junit.Assert.assertArrayEquals("tests.monster", charArray51, charArray54);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals(charArray66, charArray70);
        org.junit.Assert.assertArrayEquals(charArray51, charArray66);
        org.junit.Assert.assertArrayEquals("", charArray7, charArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray7);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (short) 100);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
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
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
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
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        synonymsAnalysisTest45.ensureCheckIndexPassed();
        synonymsAnalysisTest45.ensureCleanedUp();
        synonymsAnalysisTest45.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest45.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) shortArray16, (java.lang.Object) synonymsAnalysisTest45);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18, true);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest15.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str14, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures11 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray25 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures13, testRuleIgnoreAfterMaxFailures15, testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures20, testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures24 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures26);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures32);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures34);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray38 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures26, testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures30, testRuleIgnoreAfterMaxFailures33, testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures37 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures39);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures41);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures43);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures45);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures49);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray51 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures39, testRuleIgnoreAfterMaxFailures41, testRuleIgnoreAfterMaxFailures43, testRuleIgnoreAfterMaxFailures46, testRuleIgnoreAfterMaxFailures47, testRuleIgnoreAfterMaxFailures50 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray52 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray12, testRuleIgnoreAfterMaxFailuresArray25, testRuleIgnoreAfterMaxFailuresArray38, testRuleIgnoreAfterMaxFailuresArray51 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray52);
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
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray52, (java.lang.Object[]) executorServiceArray56);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) 100.0f);
        synonymsAnalysisTest3.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest3);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest3.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest11.assertDocsSkippingEquals("hi!", indexReader14, 0, postingsEnum16, postingsEnum17, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest11.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest11.assertFieldsEquals("random", indexReader22, fields23, fields24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, 0, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest33.assertDocsEnumEquals("tests.badapples", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest33.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest33.getlogger();
        java.lang.String str41 = synonymsAnalysisTest33.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) str41);
        synonymsAnalysisTest11.tearDown();
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest11.assertFieldsEquals("tests.monster", indexReader47, fields48, fields49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) testRule9, (java.lang.Object) fields48);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) '#');
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) '#', (long) (byte) 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 10, (double) (-1L));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
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
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.slow", "tests.awaitsfix", "tests.nightly");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100L, 0L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
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
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("tests.weekly", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest20.setanalysisService(analysisService34);
        synonymsAnalysisTest20.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest20.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) analysisService37);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest41.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("hi!", indexReader44, 0, postingsEnum46, postingsEnum47, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest41.analysisService;
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger52 = synonymsAnalysisTest41.logger;
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest41.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain53);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.setUp();
        synonymsAnalysisTest6.ensureCleanedUp();
        synonymsAnalysisTest6.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        synonymsAnalysisTest22.ensureCheckIndexPassed();
        synonymsAnalysisTest22.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest22.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.getanalysisService();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.tearDown();
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest29, obj33);
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest29.analysisService = analysisService36;
        org.elasticsearch.common.logging.ESLogger eSLogger38 = synonymsAnalysisTest29.logger;
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest6, (java.lang.Object) '#');
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 0L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest8.setUp();
        synonymsAnalysisTest8.ensureCheckIndexPassed();
        synonymsAnalysisTest8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest8.analysisService;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, false);
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        java.lang.String str20 = synonymsAnalysisTest8.getTestName();
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest8.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("hi!", indexReader28, 0, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest25.analysisService;
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest25.resetCheckIndexStatus();
        synonymsAnalysisTest25.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 4, (float) (short) 10, (float) (byte) 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, true);
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest17.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) ruleChain16, (java.lang.Object) testRule26);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest0.setUp();
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray19, charArray26);
        org.junit.Assert.assertArrayEquals(charArray15, charArray19);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray19, charArray32);
        org.junit.Assert.assertArrayEquals(charArray8, charArray19);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray19, charArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray37);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        short[] shortArray5 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray10 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray15 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray20 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[] shortArray25 = new short[] { (byte) 0, (byte) 0, (short) 100, (short) -1 };
        short[][] shortArray26 = new short[][] { shortArray5, shortArray10, shortArray15, shortArray20, shortArray25 };
        short[][][] shortArray27 = new short[][][] { shortArray26 };
        java.util.Set<short[][]> shortArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray27);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
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
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray76, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray64);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) shortArray27, (java.lang.Object[]) executorServiceArray47);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 0L, (double) 0.0f);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray19, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray23, byteArray24);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray29);
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
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray11);
        byte[] byteArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray57);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
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
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str18 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) 100.0f);
        synonymsAnalysisTest21.assertPathHasBeenCleared("<unknown>");
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 2, 10.0d, (double) 100L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest17.setUp();
        synonymsAnalysisTest17.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest20.analysisService;
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest20.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest20.logger;
        synonymsAnalysisTest20.setUp();
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain37;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("<unknown>", indexReader41, 5, postingsEnum43, postingsEnum44, true);
        synonymsAnalysisTest17.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
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
        short[] shortArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray30, shortArray36);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
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
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("hi!", indexReader23, 0, postingsEnum25, postingsEnum26, true);
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) '4');
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest10.analysisService = analysisService13;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.badapples", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest15.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest15.getanalysisService();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) analysisService34);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest10.analysisService = analysisService36;
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
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
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray26);
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray12, longArray22);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray36, longArray37);
        org.junit.Assert.assertArrayEquals(longArray32, longArray36);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray42, longArray43);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray46, longArray47);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray47, longArray51);
        org.junit.Assert.assertArrayEquals(longArray43, longArray51);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray56, longArray57);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray60, longArray61);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray64, longArray65);
        org.junit.Assert.assertArrayEquals(longArray61, longArray65);
        org.junit.Assert.assertArrayEquals(longArray57, longArray61);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray51, longArray61);
        org.junit.Assert.assertArrayEquals(longArray36, longArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray12, longArray61);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest72.getanalysisService();
        synonymsAnalysisTest72.overrideTestDefaultQueryCache();
        synonymsAnalysisTest72.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService76 = synonymsAnalysisTest72.analysisService;
        synonymsAnalysisTest72.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain79 = synonymsAnalysisTest72.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray61, (java.lang.Object) synonymsAnalysisTest72);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) 100, (double) 10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
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
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("", charArray28, charArray35);
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
        org.junit.Assert.assertArrayEquals(charArray35, charArray40);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        org.junit.Assert.assertArrayEquals(charArray35, charArray56);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray10, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) "tests.maxfailures", (java.lang.Object) (short) 100);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest20.getanalysisService();
        synonymsAnalysisTest20.overrideTestDefaultQueryCache();
        synonymsAnalysisTest20.tearDown();
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest20, obj24);
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest20.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest20.analysisService = analysisService27;
        synonymsAnalysisTest20.setUp();
        synonymsAnalysisTest20.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain19, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("", charArray1, charArray8);
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
        org.junit.Assert.assertArrayEquals(charArray8, charArray13);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray25, charArray29);
        org.junit.Assert.assertArrayEquals(charArray8, charArray29);
        char[] charArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
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
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, 100.0f, (float) 3);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
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
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("", charArray27, charArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray24, charArray27);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        org.junit.Assert.assertArrayEquals(charArray39, charArray43);
        org.junit.Assert.assertArrayEquals(charArray24, charArray39);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
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
        org.junit.Assert.assertArrayEquals("tests.monster", charArray49, charArray52);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals(charArray64, charArray68);
        org.junit.Assert.assertArrayEquals(charArray49, charArray64);
        org.junit.Assert.assertArrayEquals("hi!", charArray39, charArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray19, charArray39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService75 = synonymsAnalysisTest74.getanalysisService();
        synonymsAnalysisTest74.overrideTestDefaultQueryCache();
        synonymsAnalysisTest74.overrideTestDefaultQueryCache();
        synonymsAnalysisTest74.setUp();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        synonymsAnalysisTest74.assertFieldsEquals("", indexReader80, fields81, fields82, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) charArray39, (java.lang.Object) indexReader80);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.slow", indexReader4, (int) (byte) 100, postingsEnum6, postingsEnum7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
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
        java.lang.Object[] objArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray19, objArray57);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10L, 10L);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (long) (byte) 1);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
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
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray63);
        org.junit.Assert.assertArrayEquals(charArray51, charArray56);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray30, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray30);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) '4', (long) ' ');
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest7.setanalysisService(analysisService18);
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest7.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.tearDown();
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, obj5);
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest1.analysisService = analysisService8;
        org.elasticsearch.common.logging.ESLogger eSLogger10 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 10);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 10);
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
        synonymsAnalysisTest32.ensureCheckIndexPassed();
        synonymsAnalysisTest32.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest32.analysisService;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.weekly", indexReader38, fields39, fields40, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest32.analysisService;
        synonymsAnalysisTest32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) synonymsAnalysisTest32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) (byte) 10, (java.lang.Object) synonymsAnalysisTest32);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", 0.0d, (double) ' ', (double) 'a');
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
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
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray15);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest45.assertDocsSkippingEquals("hi!", indexReader48, 0, postingsEnum50, postingsEnum51, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest45.analysisService;
        synonymsAnalysisTest45.ensureCheckIndexPassed();
        synonymsAnalysisTest45.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray37, (java.lang.Object) synonymsAnalysisTest45);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        long[] longArray0 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray2);
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 100L, 0L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 5, (float) 0L, (float) 1L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
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
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader27, (int) (byte) -1, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest32.setUp();
        synonymsAnalysisTest32.ensureCheckIndexPassed();
        synonymsAnalysisTest32.ensureCleanedUp();
        synonymsAnalysisTest32.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest32.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest39.setUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest39.assertDocsSkippingEquals("hi!", indexReader42, 0, postingsEnum44, postingsEnum45, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest39.analysisService;
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest39.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest39.assertPositionsSkippingEquals("tests.badapples", indexReader51, (int) (short) 10, postingsEnum53, postingsEnum54);
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain56;
        synonymsAnalysisTest32.failureAndSuccessEvents = ruleChain56;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest32);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
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
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray31);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray31);
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ESTestCase[]) synonymsAnalysisTestArray31);
        java.util.List<org.junit.Assert> assertList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, (org.junit.Assert[]) synonymsAnalysisTestArray31);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray44);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray68);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList77 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray76);
        java.util.List[] listArray79 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray80 = (java.util.List<java.lang.CharSequence>[]) listArray79;
        charSequenceListArray80[0] = charSequenceList45;
        charSequenceListArray80[1] = charSequenceList53;
        charSequenceListArray80[2] = charSequenceList61;
        charSequenceListArray80[3] = charSequenceList69;
        charSequenceListArray80[4] = charSequenceList77;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList91 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) synonymsAnalysisTestArray31, (java.lang.Object[]) charSequenceListArray80);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 1, 0.0d, (double) (short) -1);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum12, postingsEnum13, false);
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray17, throttlingArray18, throttlingArray19, throttlingArray20, throttlingArray21 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray23, throttlingArray24, throttlingArray25, throttlingArray26, throttlingArray27 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray22, throttlingArray28 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) throttlingArraySet30);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.monster");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray5);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, 0.0f, (float) 2);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (byte) 100, (float) 3, (float) (byte) -1);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, (double) 0, (double) (short) 100);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray30, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray42, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) postingsEnum12);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, (double) 1L, (double) 100L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1.0d, (double) (short) 10, (double) (-1.0f));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
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
        java.util.Set<org.junit.rules.TestRule> testRuleSet68 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray66);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest69.setUp();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest69.assertDocsSkippingEquals("hi!", indexReader72, 0, postingsEnum74, postingsEnum75, true);
        org.junit.rules.TestRule testRule78 = synonymsAnalysisTest69.ruleChain;
        java.lang.Class<?> wildcardClass79 = synonymsAnalysisTest69.getClass();
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray86, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClass79, (java.lang.Object) executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) testRuleArray66, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
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
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        synonymsAnalysisTest16.ensureCheckIndexPassed();
        synonymsAnalysisTest16.ensureCleanedUp();
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
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
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest46.setUp();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("hi!", indexReader49, 0, postingsEnum51, postingsEnum52, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = null;
        synonymsAnalysisTest46.setanalysisService(analysisService55);
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest46.logger;
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) executorServiceArray44, (java.lang.Object) synonymsAnalysisTest46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray44);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
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
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) 0L);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray3, doubleArray8, (double) (-1));
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) 0L);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) 0L);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray18, doubleArray23, (double) (-1));
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) 0L);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray29, doubleArray34, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray29, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray23, (double) 10.0f);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 0L);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) 0L);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray49, doubleArray54, (double) (-1));
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) 0L);
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray60, doubleArray65, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray60, (double) 4);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray74, (double) 0L);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray78, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray73, doubleArray78, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray54, doubleArray73, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray54, (double) (-1L));
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray54, (double) 1);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray3, doubleArray23, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) (-1L));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
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
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[][] shortArray28 = new short[][] { shortArray23, shortArray24, shortArray25, shortArray26, shortArray27 };
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[][] shortArray34 = new short[][] { shortArray29, shortArray30, shortArray31, shortArray32, shortArray33 };
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[][] shortArray40 = new short[][] { shortArray35, shortArray36, shortArray37, shortArray38, shortArray39 };
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        short[][] shortArray46 = new short[][] { shortArray41, shortArray42, shortArray43, shortArray44, shortArray45 };
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        short[][] shortArray52 = new short[][] { shortArray47, shortArray48, shortArray49, shortArray50, shortArray51 };
        short[][][] shortArray53 = new short[][][] { shortArray28, shortArray34, shortArray40, shortArray46, shortArray52 };
        java.util.List<short[][]> shortArrayList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, shortArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) shortArray53);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, (double) 100);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
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
        java.lang.String str16 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (-1L), (long) (short) -1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 5);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1L));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1.0f, (double) 5, (double) '4');
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        java.util.concurrent.ExecutorService[][] executorServiceArray1 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray1);
        java.lang.Class<?> wildcardClass3 = executorServiceArray1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest4.resetCheckIndexStatus();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest4.logger;
        synonymsAnalysisTest4.setUp();
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest4.setanalysisService(analysisService21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest4.assertPositionsSkippingEquals("tests.nightly", indexReader24, 1, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) executorServiceArray1, (java.lang.Object) synonymsAnalysisTest4);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 10, (long) (byte) 100);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 10, (float) ' ', (float) 3);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader9, terms10, terms11, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest22.assertDocsEnumEquals("tests.badapples", postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest22.assertPathHasBeenCleared("tests.monster");
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest22);
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest22.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
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
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray15);
        org.junit.Assert.assertArrayEquals("hi!", shortArray3, shortArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest20.assertDocsEnumEquals("tests.badapples", postingsEnum22, postingsEnum23, true);
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest20.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray3, (java.lang.Object) testRule28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest45.assertDocsEnumEquals("tests.badapples", postingsEnum47, postingsEnum48, true);
        synonymsAnalysisTest45.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger52 = synonymsAnalysisTest45.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger53 = synonymsAnalysisTest45.logger;
        synonymsAnalysisTest45.ensureCheckIndexPassed();
        synonymsAnalysisTest45.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest45.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray31, (java.lang.Object) analysisService56);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        byte[] byteArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray26);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        long[] longArray0 = null;
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
        org.junit.Assert.assertArrayEquals(longArray3, longArray11);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray16, longArray17);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray20, longArray21);
        org.junit.Assert.assertArrayEquals(longArray16, longArray20);
        org.junit.Assert.assertArrayEquals(longArray3, longArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray20);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46, throttling47, throttling48 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet50 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray49);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) throttlingArray49);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray20, byteArray21);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray26);
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
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray56);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray74, byteArray75);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray79, byteArray80);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray83, byteArray84);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray80, byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray26);
        byte[] byteArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray93);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) 1, (double) 0, 0.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
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
        synonymsAnalysisTest2.ensureCleanedUp();
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray29 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures19, testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures28 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures32);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures34);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray42 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures30, testRuleIgnoreAfterMaxFailures32, testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures37, testRuleIgnoreAfterMaxFailures38, testRuleIgnoreAfterMaxFailures41 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures43);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures45);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures49);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures52 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures51);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures54 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures53);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray55 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures43, testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures47, testRuleIgnoreAfterMaxFailures50, testRuleIgnoreAfterMaxFailures51, testRuleIgnoreAfterMaxFailures54 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures56 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures57 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures56);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures58 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures59 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures58);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures60 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures61 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures60);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures62 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures63 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures62);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures64 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures65 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures64);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures66 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures67 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures66);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray68 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures56, testRuleIgnoreAfterMaxFailures58, testRuleIgnoreAfterMaxFailures60, testRuleIgnoreAfterMaxFailures63, testRuleIgnoreAfterMaxFailures64, testRuleIgnoreAfterMaxFailures67 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray69 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray29, testRuleIgnoreAfterMaxFailuresArray42, testRuleIgnoreAfterMaxFailuresArray55, testRuleIgnoreAfterMaxFailuresArray68 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) testRuleIgnoreAfterMaxFailuresArraySet70);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
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
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest17.getlogger();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.maxfailures", indexReader20, fields21, fields22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest17.setanalysisService(analysisService25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.awaitsfix", postingsEnum28, postingsEnum29, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs(0);
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest17.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 10.0f);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray25);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray2, (java.lang.Object) boolean46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
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
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) 0L);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray19, doubleArray24, (double) (-1));
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 0L);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray30, doubleArray35, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray30, (double) 4);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray43, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.monster", (java.lang.Object) doubleArray43);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) '#', 10.0d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        long[] longArray1 = null;
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
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        org.junit.Assert.assertArrayEquals(longArray5, longArray22);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray28, longArray29);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray32, longArray33);
        org.junit.Assert.assertArrayEquals(longArray29, longArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray5);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("europarl.lines.txt.gz", "tests.badapples", "tests.weekly");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) (short) 10, (float) 3);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, 0.0f, (float) 3);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
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
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList48 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest49.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest52.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest52.assertDocsSkippingEquals("hi!", indexReader55, 0, postingsEnum57, postingsEnum58, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService61 = synonymsAnalysisTest52.analysisService;
        org.junit.rules.RuleChain ruleChain62 = synonymsAnalysisTest52.failureAndSuccessEvents;
        synonymsAnalysisTest49.failureAndSuccessEvents = ruleChain62;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charSequenceArray47, (java.lang.Object) ruleChain62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) charSequenceArray47);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 2, (float) (byte) 100, (float) (short) -1);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 1, (long) 5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
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
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain55;
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = null;
        synonymsAnalysisTest14.setanalysisService(analysisService57);
        synonymsAnalysisTest14.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain13, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader5, (int) (short) 10, postingsEnum7, postingsEnum8);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
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
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, obj30);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        java.lang.Object[] objArray1 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray53, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray53);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray1, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        short[] shortArray6 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray10 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray14 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray15 = new short[][] { shortArray6, shortArray10, shortArray14 };
        java.util.List<short[]> shortArrayList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray15);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) shortArray15);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.weekly", "tests.monster", "tests.failfast" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray7, strArray13, strArray19, strArray25, strArray31 };
        java.util.List<java.lang.String[]> strArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, strArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37, throttling38 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40, throttling41 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray45 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling43, throttling44 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray46 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray36, throttlingArray39, throttlingArray42, throttlingArray45 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray46);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray32, (java.lang.Object[]) throttlingArray46);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader14, (int) '4', postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 3, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1), (double) 5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1.0f);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 0L, (double) '#', (double) 'a');
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
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
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.logger;
        synonymsAnalysisTest7.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.slow", indexReader37, terms38, terms39, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        java.lang.Object[] objArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService3);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest4.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("hi!", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest4.assertFieldsEquals("random", indexReader15, fields16, fields17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest4.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, 0, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest26.assertDocsEnumEquals("tests.badapples", postingsEnum28, postingsEnum29, true);
        synonymsAnalysisTest26.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest26.getlogger();
        java.lang.String str34 = synonymsAnalysisTest26.getTestName();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) str34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest4.assertDocsSkippingEquals("<unknown>", indexReader37, 5, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest4.getanalysisService();
        synonymsAnalysisTest4.ensureAllSearchContextsReleased();
        synonymsAnalysisTest4.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        float[] floatArray1 = null;
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
        java.lang.Object obj31 = null;
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
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray52, (float) 5);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray52, (float) (short) 10);
        org.junit.Assert.assertNotEquals("tests.nightly", obj31, (java.lang.Object) floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray52, (float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray52, 0.0f);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 0, (float) (byte) 100, (float) 4);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        float[] floatArray1 = null;
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
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) (short) 0);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) 10);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray46, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray31, floatArray46, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray46, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray46, (float) (byte) 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (-1L));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        short[] shortArray0 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray6);
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
        org.junit.Assert.assertArrayEquals("hi!", shortArray6, shortArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, true);
        synonymsAnalysisTest23.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest23.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray6, (java.lang.Object) testRule31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray39);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray34);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray51);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray54);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray59);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray64, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        org.junit.Assert.assertArrayEquals("random", shortArray54, shortArray68);
        org.junit.Assert.assertArrayEquals("random", shortArray34, shortArray68);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray75, shortArray76);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray79, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray68, shortArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray75);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest0.analysisService = analysisService12;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        byte[][] byteArray31 = new byte[][] { byteArray5, byteArray10, byteArray15, byteArray20, byteArray25, byteArray30 };
        java.util.Set<byte[]> byteArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray31);
        java.util.Set<java.io.Serializable> serializableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) byteArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        java.lang.Object obj51 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray40, obj51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
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
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray79, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray79);
        java.lang.Object obj85 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray74, obj85);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray74);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) byteArray31, (java.lang.Object[]) executorServiceArray40);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        int[] intArray7 = new int[] { 5, (byte) 1, (-1), '#', (short) 0, 1 };
        int[] intArray8 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray7, intArray8);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", 0.0d, 10.0d, (double) (short) 100);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.setUp();
        synonymsAnalysisTest6.ensureCleanedUp();
        synonymsAnalysisTest6.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest1.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("<unknown>", (int) (short) -1, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
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
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        org.junit.Assert.assertArrayEquals(charArray3, charArray18);
        char[] charArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray18, charArray26);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.analysisService = analysisService2;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1.0d, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) (short) -1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
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
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest14.getanalysisService();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.tearDown();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest14.analysisService;
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.setUp();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest14.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain12, (java.lang.Object) testRule22);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.getlogger();
        java.lang.Class<?> wildcardClass5 = synonymsAnalysisTest1.getClass();
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray14, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray27);
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
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray67, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray80, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray75);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) wildcardClass5, (java.lang.Object) executorServiceArray9);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures9 };
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray21 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures16, testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures20 };
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray32 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures23, testRuleIgnoreAfterMaxFailures25, testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures31 };
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray43 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures36, testRuleIgnoreAfterMaxFailures38, testRuleIgnoreAfterMaxFailures39, testRuleIgnoreAfterMaxFailures42 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures44);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures46);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures50);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures52 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures53 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures52);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray54 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures47, testRuleIgnoreAfterMaxFailures49, testRuleIgnoreAfterMaxFailures50, testRuleIgnoreAfterMaxFailures53 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray55 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray21, testRuleIgnoreAfterMaxFailuresArray32, testRuleIgnoreAfterMaxFailuresArray43, testRuleIgnoreAfterMaxFailuresArray54 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray55);
        java.lang.Object[] objArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray55, objArray57);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
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
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest30.getlogger();
        java.lang.String str44 = synonymsAnalysisTest30.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest30.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures8, testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures12 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures20);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures24);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray26 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures16, testRuleIgnoreAfterMaxFailures18, testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures22, testRuleIgnoreAfterMaxFailures25 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures37);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray39 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures29, testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures34, testRuleIgnoreAfterMaxFailures35, testRuleIgnoreAfterMaxFailures38 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures44);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures46);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures51 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures50);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray52 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures40, testRuleIgnoreAfterMaxFailures42, testRuleIgnoreAfterMaxFailures44, testRuleIgnoreAfterMaxFailures47, testRuleIgnoreAfterMaxFailures48, testRuleIgnoreAfterMaxFailures51 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray53 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray26, testRuleIgnoreAfterMaxFailuresArray39, testRuleIgnoreAfterMaxFailuresArray52 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray53);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest10.getlogger();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.maxfailures", indexReader13, fields14, fields15, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.awaitsfix", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest10.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger26);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest1.getClass();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray18, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClass11, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
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
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray67, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray86, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray86);
        java.lang.Object obj92 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray81, obj92);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray31);
        java.lang.Object[] objArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, objArray98);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
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
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        char[] charArray1 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
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
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals("", charArray36, charArray43);
        org.junit.Assert.assertArrayEquals(charArray31, charArray36);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray31, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray1, charArray3);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 1L, 0.0d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (short) 10);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.assertPathHasBeenCleared("<unknown>");
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader7, terms8, terms9, true);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest15.assertFieldsEquals("random", indexReader26, fields27, fields28, true);
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest32.getlogger();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.nightly", indexReader35, fields36, fields37, false);
        java.lang.Class<?> wildcardClass40 = synonymsAnalysisTest32.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) wildcardClass40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.tearDown();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader18, fields19, fields20, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest23.getanalysisService();
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        synonymsAnalysisTest23.tearDown();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain27;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) ruleChain27);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
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
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest27.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("hi!", indexReader30, 0, postingsEnum32, postingsEnum33, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = synonymsAnalysisTest27.analysisService;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain37;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest40.logger;
        synonymsAnalysisTest40.tearDown();
        synonymsAnalysisTest40.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest40.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger47 = synonymsAnalysisTest40.logger;
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest40);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = null;
        synonymsAnalysisTest0.analysisService = analysisService8;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 100, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) ' ', (double) (short) 1, (double) (short) -1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray24);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray24);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray1, (java.lang.Object) boolean45);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest47.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest47.assertDocsSkippingEquals("hi!", indexReader50, 0, postingsEnum52, postingsEnum53, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = synonymsAnalysisTest47.analysisService;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        synonymsAnalysisTest47.assertFieldsEquals("random", indexReader58, fields59, fields60, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService63 = null;
        synonymsAnalysisTest47.setanalysisService(analysisService63);
        synonymsAnalysisTest47.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger66 = synonymsAnalysisTest47.getlogger();
        short[] shortArray72 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray76 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray80 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray81 = new short[][] { shortArray72, shortArray76, shortArray80 };
        java.util.List<short[]> shortArrayList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray81);
        java.util.Set<java.lang.Cloneable> cloneableSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray81);
        java.util.List<short[]> shortArrayList84 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, shortArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest47, (java.lang.Object) shortArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) shortArray81);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (short) 1);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest7.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("hi!", indexReader10, 0, postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = synonymsAnalysisTest7.analysisService;
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
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
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) executorServiceArray51);
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
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray89, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray89);
        boolean boolean97 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceCollectionArray34, (java.lang.Object[]) executorServiceArray89);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (-1.0d), (double) (-1), (double) 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) 'a');
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) '4', (float) 10L, (float) (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (double) 4, (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
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
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest30.getlogger();
        java.lang.String str44 = synonymsAnalysisTest30.getTestName();
        synonymsAnalysisTest30.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest30.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 10, numericDocValues48, numericDocValues49);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest18.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("hi!", indexReader24, 0, postingsEnum26, postingsEnum27, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest21.analysisService;
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain31;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charSequenceArray16, (java.lang.Object) ruleChain31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) charSequenceArray16);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) 10L, (float) 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("random", indexReader5, 3, postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService11);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.nightly", obj15);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
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
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 4);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 10);
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        double[][] doubleArray1 = new double[][] {};
        java.util.Set<double[]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray8);
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
        org.junit.Assert.assertArrayEquals("hi!", shortArray8, shortArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest25.assertDocsEnumEquals("tests.badapples", postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest25.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest25.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray8, (java.lang.Object) testRule33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray36);
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
        org.junit.Assert.assertArrayEquals("random", shortArray36, shortArray70);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray77, shortArray78);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray81, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray77, shortArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray70, shortArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) doubleArray1, (java.lang.Object) shortArray77);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        short[] shortArray4 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray8 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray12 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray13 = new short[][] { shortArray4, shortArray8, shortArray12 };
        java.util.List<short[]> shortArrayList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) cloneableSet15);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest1.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
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
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger25 = synonymsAnalysisTest23.logger;
        java.lang.Object obj26 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest27.getanalysisService();
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        synonymsAnalysisTest27.setUp();
        org.junit.Assert.assertNotEquals(obj26, (java.lang.Object) synonymsAnalysisTest27);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest27.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest27.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) eSLogger34);
        synonymsAnalysisTest23.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.getanalysisService();
        synonymsAnalysisTest37.overrideTestDefaultQueryCache();
        synonymsAnalysisTest37.tearDown();
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain41;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest23);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader6, (int) (short) 10, postingsEnum8, postingsEnum9);
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest1.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
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
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling31 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling31, throttling32, throttling33 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet35 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray34);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) throttlingArray34);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) 1, (float) (byte) 100, (float) 2);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 'a', (double) 1);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) (-1L), 0.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1.0f, (double) '4');
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 0, (double) 0.0f);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 0L);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) (byte) -1, (float) 0);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("hi!", indexReader12, 0, postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.analysisService;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest9.assertFieldsEquals("random", indexReader20, fields21, fields22, true);
        java.lang.String str25 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest9.logger;
        synonymsAnalysisTest9.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest9.analysisService = analysisService28;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) analysisService1);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("hi!", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("hi!", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest15.analysisService;
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.weekly", indexReader29, (int) (short) 100, postingsEnum31, postingsEnum32, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 3, (long) (byte) 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray5);
        int[] intArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        double[] doubleArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray1, doubleArray14, (double) 10L);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (-1.0f));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 0.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 5, (long) (-1));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        java.lang.Object obj0 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) 5);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray12, floatArray18, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) 100.0f);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
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
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        org.junit.Assert.assertArrayEquals(charArray43, charArray47);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals(charArray51, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("", charArray51, charArray58);
        org.junit.Assert.assertArrayEquals(charArray47, charArray51);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals(charArray51, charArray64);
        org.junit.Assert.assertArrayEquals(charArray22, charArray51);
        java.lang.Class<?> wildcardClass68 = charArray22.getClass();
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray76 = new java.util.concurrent.ExecutorService[][] { executorServiceArray70, executorServiceArray71, executorServiceArray72, executorServiceArray73, executorServiceArray74, executorServiceArray75 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList77 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) charArray22, (java.lang.Object) executorServiceArray76);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 'a', 0L);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 'a', (float) 10L, (float) 5);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
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
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) ' ', numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
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
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest0.failureAndSuccessEvents;
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray29, intArray31);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray24, intArray31);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        int[] intArray45 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray44, intArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray37, intArray44);
        org.junit.Assert.assertArrayEquals("", intArray24, intArray44);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("", intArray52, intArray54);
        org.junit.Assert.assertArrayEquals("", intArray44, intArray54);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) intArray44);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("", intArray62, intArray64);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray44, intArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) intArray44);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) ' ', numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        char[] charArray1 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray10, charArray17);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray10, charArray23);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray32, charArray36);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("", charArray32, charArray39);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray29, charArray32);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals(charArray48, charArray52);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray56, charArray63);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray56, charArray69);
        org.junit.Assert.assertArrayEquals(charArray45, charArray56);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) charArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray32, charArray45);
        org.junit.Assert.assertArrayEquals(charArray23, charArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray23);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (byte) 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray46, (java.lang.Object) (-1.0f));
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray59, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray59);
        java.lang.Object obj65 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray54, obj65);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray1, (java.lang.Object) executorServiceArray54);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest69.setUp();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest69.assertDocsSkippingEquals("hi!", indexReader72, 0, postingsEnum74, postingsEnum75, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService78 = synonymsAnalysisTest69.analysisService;
        synonymsAnalysisTest69.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest69.setUp();
        synonymsAnalysisTest69.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray54, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100.0f, (double) '#', (double) 100.0f);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService4);
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest0.analysisService;
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
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
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray16, charArray29);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
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
        org.junit.Assert.assertArrayEquals("tests.monster", charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray29, charArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray37);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 0L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.failfast" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray2, strArray4, strArray6 };
        java.util.Set<java.lang.String[]> strArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        short[][] shortArray16 = new short[][] { shortArray10, shortArray11, shortArray12, shortArray13, shortArray14, shortArray15 };
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        short[][] shortArray23 = new short[][] { shortArray17, shortArray18, shortArray19, shortArray20, shortArray21, shortArray22 };
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        short[][] shortArray30 = new short[][] { shortArray24, shortArray25, shortArray26, shortArray27, shortArray28, shortArray29 };
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        short[][] shortArray37 = new short[][] { shortArray31, shortArray32, shortArray33, shortArray34, shortArray35, shortArray36 };
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        short[][] shortArray44 = new short[][] { shortArray38, shortArray39, shortArray40, shortArray41, shortArray42, shortArray43 };
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        short[][] shortArray51 = new short[][] { shortArray45, shortArray46, shortArray47, shortArray48, shortArray49, shortArray50 };
        short[][][] shortArray52 = new short[][][] { shortArray16, shortArray23, shortArray30, shortArray37, shortArray44, shortArray51 };
        java.util.List<short[][]> shortArrayList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray7, (java.lang.Object[]) shortArray52);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
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
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray19);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
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
        short[] shortArray31 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray35 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[] shortArray39 = new short[] { (short) -1, (short) 1, (short) 1 };
        short[][] shortArray40 = new short[][] { shortArray31, shortArray35, shortArray39 };
        java.util.List<short[]> shortArrayList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, shortArray40);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArrayList41, (java.lang.Object) executorServiceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) charSequenceCollectionArray19, (java.lang.Object[]) executorServiceArray73);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 4);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService18);
        synonymsAnalysisTest10.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum22, postingsEnum23, false);
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest10.logger;
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) 0L);
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
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray37, (double) 10.0f);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) 0L);
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray59, doubleArray64, (double) (-1));
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) 0L);
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray70, doubleArray75, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray70, (double) 4);
        double[] doubleArray83 = new double[] {};
        double[] doubleArray84 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray83, doubleArray84, (double) 0L);
        double[] doubleArray87 = new double[] {};
        double[] doubleArray88 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray87, doubleArray88, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray83, doubleArray88, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray64, doubleArray83, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray64, (double) '4');
        org.junit.Assert.assertNotEquals((java.lang.Object) eSLogger26, (java.lang.Object) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) longArray2, (java.lang.Object) '4');
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) 0L, (double) 'a');
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100.0f, (double) (-1L), (double) (-1.0f));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.weekly", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("hi!", indexReader18, (int) (short) -1, postingsEnum20, postingsEnum21);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(100);
        java.lang.String str25 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str25);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0d, (double) 2);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (short) 10);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, 0.0d, (double) 10L);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest18.logger;
        synonymsAnalysisTest18.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest18.setanalysisService(analysisService23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 0.0d, (double) 1);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        float[] floatArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray8, (float) 4);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
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
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
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
        java.lang.Object obj31 = null;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) executorServiceArray20, obj31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) executorServiceArray42);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 100L, (float) 1, 0.0f);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (-1), (long) 0);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) '4');
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 1L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum3, postingsEnum4, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest12.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("hi!", indexReader15, 0, postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest12.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest12.analysisService;
        java.lang.String str23 = synonymsAnalysisTest12.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) analysisService11, (java.lang.Object) str23);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (byte) 1, 1.0d, (double) 'a');
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) ' ', 0.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule2);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 'a', (float) (byte) 0, (float) (-1L));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("hi!", indexReader5, 0, postingsEnum7, postingsEnum8, true);
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest2.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 10, (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest13.analysisService;
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
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest13.setanalysisService(analysisService38);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest42.getlogger();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.maxfailures", indexReader45, fields46, fields47, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = synonymsAnalysisTest50.getanalysisService();
        synonymsAnalysisTest50.overrideTestDefaultQueryCache();
        synonymsAnalysisTest50.tearDown();
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest50, obj54);
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest50.ruleChain;
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = null;
        synonymsAnalysisTest50.analysisService = analysisService57;
        org.elasticsearch.index.analysis.AnalysisService analysisService59 = synonymsAnalysisTest50.analysisService;
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest77.setUp();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        synonymsAnalysisTest77.assertDocsSkippingEquals("hi!", indexReader80, 0, postingsEnum82, postingsEnum83, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService86 = synonymsAnalysisTest77.analysisService;
        org.junit.rules.RuleChain ruleChain87 = synonymsAnalysisTest77.failureAndSuccessEvents;
        synonymsAnalysisTest60.failureAndSuccessEvents = ruleChain87;
        synonymsAnalysisTest50.failureAndSuccessEvents = ruleChain87;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain87;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain87;
        synonymsAnalysisTest42.failureAndSuccessEvents = ruleChain87;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain87;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain87;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) (short) 10, (java.lang.Object) ruleChain87);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (short) 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
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
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = synonymsAnalysisTest1.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) '#', (double) (-1L), (double) 10L);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) 0L);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray6, (double) (-1));
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) 0L);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray12, doubleArray17, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray17, (double) (byte) 100);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) 0L);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray26, doubleArray31, (double) (-1));
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) 0L);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray37, doubleArray42, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray37, (double) 4);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) 0L);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray50, doubleArray55, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray31, doubleArray50, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray31, (double) ' ');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest64.setUp();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("hi!", indexReader67, 0, postingsEnum69, postingsEnum70, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest64.analysisService;
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        synonymsAnalysisTest64.assertPositionsSkippingEquals("tests.badapples", indexReader76, (int) (short) 10, postingsEnum78, postingsEnum79);
        synonymsAnalysisTest64.overrideTestDefaultQueryCache();
        synonymsAnalysisTest64.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        synonymsAnalysisTest64.assertDocsEnumEquals("tests.failfast", postingsEnum84, postingsEnum85, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray31, (java.lang.Object) true);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 5);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 1L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0d), (double) 4);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("hi!", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest14.analysisService;
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain27;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest29, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger32 = synonymsAnalysisTest29.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest29.setanalysisService(analysisService33);
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest29.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService36 = null;
        synonymsAnalysisTest29.analysisService = analysisService36;
        synonymsAnalysisTest29.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest29);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) (short) 0, (double) 1L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        org.junit.Assert.assertArrayEquals(longArray14, longArray22);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray27, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        org.junit.Assert.assertArrayEquals(longArray14, longArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray14);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray41);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray44, longArray45);
        org.junit.Assert.assertArrayEquals(longArray41, longArray45);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals("", longArray41, longArray50);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) longArray50);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray55, longArray56);
        org.junit.Assert.assertArrayEquals(longArray50, longArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray4, longArray50);
        long[] longArray60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray60);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 100.0f);
        synonymsAnalysisTest0.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 5, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("tests.badapples", "tests.monster", "tests.awaitsfix");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
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
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray3, charArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("hi!", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest36.analysisService;
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest36);
        org.elasticsearch.common.logging.ESLogger eSLogger48 = synonymsAnalysisTest36.logger;
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest36.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = null;
        synonymsAnalysisTest36.setanalysisService(analysisService50);
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("tests.failfast", indexReader54, (int) (short) 10, postingsEnum56, postingsEnum57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray3, (java.lang.Object) postingsEnum56);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 10.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
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
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) executorServiceArray25, (java.lang.Object) (-1.0f));
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
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
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray37);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest63.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger65 = synonymsAnalysisTest63.logger;
        java.lang.Object obj66 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest67 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = synonymsAnalysisTest67.getanalysisService();
        synonymsAnalysisTest67.overrideTestDefaultQueryCache();
        synonymsAnalysisTest67.overrideTestDefaultQueryCache();
        synonymsAnalysisTest67.setUp();
        org.junit.Assert.assertNotEquals(obj66, (java.lang.Object) synonymsAnalysisTest67);
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest67.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger74 = synonymsAnalysisTest67.logger;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest63, (java.lang.Object) eSLogger74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest63.assertTermsEquals("<unknown>", indexReader77, terms78, terms79, false);
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest63.assertDocsSkippingEquals("tests.slow", indexReader83, (int) ' ', postingsEnum85, postingsEnum86, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) executorServiceArray37, (java.lang.Object) indexReader83);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 10.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
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
        org.elasticsearch.common.logging.ESLogger eSLogger43 = synonymsAnalysisTest30.getlogger();
        java.lang.String str44 = synonymsAnalysisTest30.getTestName();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader46, (int) '#', postingsEnum48, postingsEnum49);
        synonymsAnalysisTest30.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest30.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum53, postingsEnum54);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest37.assertDocsEnumEquals("tests.badapples", postingsEnum39, postingsEnum40, true);
        synonymsAnalysisTest37.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest37);
        synonymsAnalysisTest37.assertPathHasBeenCleared("tests.nightly");
        synonymsAnalysisTest37.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest37.assertDocsEnumEquals("<unknown>", postingsEnum49, postingsEnum50, true);
        org.elasticsearch.common.logging.ESLogger eSLogger53 = synonymsAnalysisTest37.getlogger();
        org.junit.Assert.assertNotEquals((java.lang.Object) charArray4, (java.lang.Object) eSLogger53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) eSLogger53);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.nightly", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(10);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.badapples", postingsEnum2, postingsEnum3, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest10.assertDocsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14, false);
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 3, (double) 10.0f);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
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
        java.lang.String str38 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        java.lang.Object obj40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest2, obj40);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 4, (double) 10.0f);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (-1L));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, 1.0d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
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
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("hi!", indexReader16, 0, postingsEnum18, postingsEnum19, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest13.analysisService = analysisService25;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) -1);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) 2);
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest0.logger;
        java.lang.Object obj35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger34, obj35);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (short) 1, (float) (byte) 10);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) 0L, (double) 3);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
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
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest0.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader29, 100, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
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
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService18);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest21.assertDocsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24, true);
        synonymsAnalysisTest21.assertPathHasBeenCleared("tests.monster");
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest21.assertPositionsSkippingEquals("tests.weekly", indexReader30, (int) (short) 100, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = null;
        synonymsAnalysisTest21.setanalysisService(analysisService35);
        synonymsAnalysisTest21.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest21.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) analysisService38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest40.setUp();
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) (short) 1);
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest40);
        java.lang.String str47 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest48.setUp();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest48.assertDocsSkippingEquals("hi!", indexReader51, 0, postingsEnum53, postingsEnum54, true);
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest48.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule57;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) testRule57);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest5.analysisService = analysisService7;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.logger;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, (float) 10);
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) (short) 0);
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray20, (float) 10);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray25, (float) 5);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("random", floatArray25, floatArray31, 100.0f);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 0);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray43, (float) 10);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) 5);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) (short) 0);
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray59, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray43, floatArray54, 0.0f);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray67, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray31, floatArray54, 0.0f);
        org.junit.Assert.assertArrayEquals("random", floatArray3, floatArray54, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger1, (java.lang.Object) floatArray54);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 4);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = synonymsAnalysisTest0.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) analysisService4);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
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
        java.lang.Object[] objArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray19, objArray43);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
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
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 'a', (double) 1);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
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
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest37);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) 5);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1.0f, 100.0d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest0.failureAndSuccessEvents;
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray24);
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
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray38);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain13, (java.lang.Object) shortArray63);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
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
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        java.lang.Class<?> wildcardClass45 = ruleChain42.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest47.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest47.assertDocsSkippingEquals("hi!", indexReader50, 0, postingsEnum52, postingsEnum53, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService56 = null;
        synonymsAnalysisTest47.setanalysisService(analysisService56);
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest47.logger;
        java.lang.Object obj59 = null;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest47, obj59);
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest47.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain42, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray6);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray12, intArray14);
        org.junit.Assert.assertArrayEquals(intArray4, intArray14);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray23);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        org.junit.Assert.assertArrayEquals("", intArray29, intArray31);
        org.junit.Assert.assertArrayEquals(intArray21, intArray31);
        org.junit.Assert.assertArrayEquals(intArray14, intArray21);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray14, intArray37);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray43, intArray50);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray61, intArray63);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray56, intArray63);
        org.junit.Assert.assertArrayEquals("", intArray43, intArray63);
        org.junit.Assert.assertArrayEquals(intArray14, intArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray63);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        java.util.concurrent.ExecutorService[][] executorServiceArray1 = new java.util.concurrent.ExecutorService[][] {};
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray1);
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
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) 0L);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray39, doubleArray44, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray44, (double) (byte) 100);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) 0L);
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray53, doubleArray58, (double) (-1));
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) 0L);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray64, doubleArray69, (double) (-1));
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray64, (double) 4);
        double[] doubleArray77 = new double[] {};
        double[] doubleArray78 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray78, (double) 0L);
        double[] doubleArray81 = new double[] {};
        double[] doubleArray82 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray81, doubleArray82, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray77, doubleArray82, (double) (-1));
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray58, doubleArray77, (double) 1L);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray58, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray58, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) executorServiceArray1, (java.lang.Object) (short) 100);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
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
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray48);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList57 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray56);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList65 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray80);
        java.util.List[] listArray83 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.CharSequence>[] charSequenceListArray84 = (java.util.List<java.lang.CharSequence>[]) listArray83;
        charSequenceListArray84[0] = charSequenceList49;
        charSequenceListArray84[1] = charSequenceList57;
        charSequenceListArray84[2] = charSequenceList65;
        charSequenceListArray84[3] = charSequenceList73;
        charSequenceListArray84[4] = charSequenceList81;
        java.util.List<java.util.List<java.lang.CharSequence>> charSequenceListList95 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceListArray84);
        org.junit.Assert.assertNotSame("", (java.lang.Object) charSequenceListArray84, (java.lang.Object) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) boolean39, (java.lang.Object) "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 10L, (double) 10L);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 100.0f);
        org.elasticsearch.common.logging.ESLogger eSLogger4 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService5);
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum10, postingsEnum11, false);
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 10L, (double) 100.0f);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', 1.0d, (double) 100);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (byte) 100);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
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
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 10);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) 'a', numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, 100L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, 0.0d, 0.0d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) (-1L));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
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
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("hi!", indexReader22, 0, postingsEnum24, postingsEnum25, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) (short) -1);
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest19);
        java.lang.String str33 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService34);
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        synonymsAnalysisTest19.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) "", (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 100, (float) (byte) 10, (float) (byte) -1);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest2.getlogger();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.Class<?> wildcardClass10 = synonymsAnalysisTest2.getClass();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "random", "tests.awaitsfix", "tests.badapples", "hi!", "hi!" };
        java.util.List<java.lang.CharSequence> charSequenceList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charSequenceArray18);
        java.lang.Class<?> wildcardClass20 = charSequenceArray18.getClass();
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) wildcardClass20, obj21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest23.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest23.assertDocsEnumEquals("tests.nightly", postingsEnum26, postingsEnum27, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest23.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest23.analysisService = analysisService31;
        java.lang.Class<?> wildcardClass33 = synonymsAnalysisTest23.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray34 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass20, wildcardClass33 };
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(2, genericDeclarationArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) genericDeclarationArray34);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
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
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger42 = synonymsAnalysisTest3.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (short) 1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("hi!", indexReader9, 0, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest6.analysisService;
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest21.assertDocsEnumEquals("tests.badapples", postingsEnum23, postingsEnum24, true);
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest21.getlogger();
        synonymsAnalysisTest21.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest21.analysisService = analysisService30;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) analysisService30);
    }
}

