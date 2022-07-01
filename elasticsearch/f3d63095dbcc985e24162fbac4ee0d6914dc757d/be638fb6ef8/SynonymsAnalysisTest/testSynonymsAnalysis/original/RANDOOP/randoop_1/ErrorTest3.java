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
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray16);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray26);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray26, byteArray33);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray37);
        org.junit.Assert.assertArrayEquals("", byteArray16, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray33);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray46, byteArray47);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray33, byteArray47);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest55.ruleChain;
        synonymsAnalysisTest55.ensureCleanedUp();
        java.lang.String str58 = synonymsAnalysisTest55.getTestName();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        synonymsAnalysisTest55.assertFieldsEquals("tests.monster", indexReader60, fields61, fields62, false);
        java.lang.String str65 = synonymsAnalysisTest55.getTestName();
        synonymsAnalysisTest55.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.weekly", (java.lang.Object) synonymsAnalysisTest55);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str69 = synonymsAnalysisTest68.getTestName();
        java.lang.String str70 = synonymsAnalysisTest68.getTestName();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest68.assertPositionsSkippingEquals("", indexReader72, (int) ' ', postingsEnum74, postingsEnum75);
        synonymsAnalysisTest68.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        synonymsAnalysisTest68.assertTermsEquals("tests.badapples", indexReader79, terms80, terms81, true);
        org.junit.rules.RuleChain ruleChain84 = null;
        synonymsAnalysisTest68.failureAndSuccessEvents = ruleChain84;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest55, (java.lang.Object) ruleChain84);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        synonymsAnalysisTest6.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest6.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest6.assertFieldsEquals("tests.awaitsfix", indexReader19, fields20, fields21, true);
        java.lang.String str24 = synonymsAnalysisTest6.getTestName();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest6.assertPathHasBeenCleared("tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 100);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 10L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.weekly", postingsEnum10, postingsEnum11, false);
        java.lang.Class<?> wildcardClass14 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest15.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest15.ruleChain;
        synonymsAnalysisTest15.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest15.assertFieldsEquals("", indexReader26, fields27, fields28, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass14, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0d, (double) 'a', (double) 10.0f);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, (double) 10L);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, true);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray18, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        synonymsAnalysisTest33.assertTermsEquals("europarl.lines.txt.gz", indexReader35, terms36, terms37, false);
        synonymsAnalysisTest33.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest33.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain44;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str47 = synonymsAnalysisTest46.getTestName();
        java.lang.String str48 = synonymsAnalysisTest46.getTestName();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("", indexReader50, (int) ' ', postingsEnum52, postingsEnum53);
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest46.failureAndSuccessEvents;
        synonymsAnalysisTest46.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest46.assertDocsSkippingEquals("tests.badapples", indexReader59, (int) (byte) 1, postingsEnum61, postingsEnum62, false);
        synonymsAnalysisTest46.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.monster", indexReader67, fields68, fields69, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest25, (java.lang.Object) indexReader67);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        java.lang.Object[] objArray0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        java.lang.Class<?> wildcardClass15 = synonymsAnalysisTest1.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        java.util.Set<java.io.Serializable> serializableSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) wildcardClassArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) wildcardClassArray18);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 100.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray24);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        synonymsAnalysisTest34.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest34.assertDocsEnumEquals("tests.awaitsfix", postingsEnum38, postingsEnum39, true);
        synonymsAnalysisTest34.ensureCheckIndexPassed();
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) shortArray4, (java.lang.Object) synonymsAnalysisTest34);
        synonymsAnalysisTest34.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest34);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray41, (java.lang.Object) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray53);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        synonymsAnalysisTest62.assertTermsEquals("europarl.lines.txt.gz", indexReader64, terms65, terms66, false);
        synonymsAnalysisTest62.overrideTestDefaultQueryCache();
        synonymsAnalysisTest62.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest62.ensureCleanedUp();
        java.lang.String str72 = synonymsAnalysisTest62.getTestName();
        synonymsAnalysisTest62.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) executorServiceArray30, (java.lang.Object) synonymsAnalysisTest62);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray9);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray30, shortArray35);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray40);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray9, shortArray15);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray15, (java.lang.Object) executorServiceArray48);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.lang.Object[] objArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, objArray61);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 1.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 6, (double) (byte) 1);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 0, (-1.0f));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class[][] classArray5 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray6 = (java.lang.Class<?>[][]) classArray5;
        wildcardClassArray6[0] = wildcardClassArray3;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set[] setArray25 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray26 = (java.util.Set<java.lang.String>[]) setArray25;
        strSetArray26[0] = strSet14;
        strSetArray26[1] = strSet19;
        strSetArray26[2] = strSet23;
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.util.Set[] setArray47 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray48 = (java.util.Set<java.lang.String>[]) setArray47;
        strSetArray48[0] = strSet36;
        strSetArray48[1] = strSet41;
        strSetArray48[2] = strSet45;
        java.util.Set[][] setArray56 = new java.util.Set[2][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[][] strSetArray57 = (java.util.Set<java.lang.String>[][]) setArray56;
        strSetArray57[0] = strSetArray26;
        strSetArray57[1] = strSetArray48;
        java.util.List<java.util.Set<java.lang.String>[]> strSetArrayList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, strSetArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) wildcardClassArray6, (java.lang.Object[]) strSetArray57);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) ' ', numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("random", indexReader12, (int) ' ', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(10);
        java.lang.String str20 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", 3, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray6, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        org.junit.Assert.assertArrayEquals(intArray18, intArray23);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray18, intArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray9, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray41);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray50);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray56, intArray59);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray64, intArray67);
        org.junit.Assert.assertArrayEquals(intArray59, intArray64);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("", intArray59, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray50, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray41, intArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray41);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray80, intArray83);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray88, intArray91);
        org.junit.Assert.assertArrayEquals(intArray83, intArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader9, fields10, fields11, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        char[] charArray22 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray28 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray34 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray35 = new char[][] { charArray22, charArray28, charArray34 };
        java.util.Set<char[]> charArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(charArray35);
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) charArray35);
        java.util.List<char[]> charArrayList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray35);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", (int) 'a', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest7.ensureCleanedUp();
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) doubleArray19);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray28, (double) (byte) -1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray38, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray24, doubleArray38, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray19, doubleArray38, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray3, doubleArray19, 100.0d);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str51 = synonymsAnalysisTest50.getTestName();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.slow", indexReader53, fields54, fields55, false);
        synonymsAnalysisTest50.setIndexWriterMaxDocs(4);
        org.junit.rules.TestRule testRule60 = synonymsAnalysisTest50.ruleChain;
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) doubleArray19, (java.lang.Object) synonymsAnalysisTest50);
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest50.assertDocValuesEquals("tests.monster", (int) '4', numericDocValues64, numericDocValues65);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (-1.0f));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray10, intArray13);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray20, intArray23);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray28, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray23, intArray31);
        org.junit.Assert.assertArrayEquals(intArray5, intArray23);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray39, intArray42);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray50);
        org.junit.Assert.assertArrayEquals(intArray42, intArray47);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("", intArray42, intArray54);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray54, (java.lang.Object) boolean60);
        org.junit.Assert.assertArrayEquals(intArray23, intArray54);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        synonymsAnalysisTest63.assertTermsEquals("europarl.lines.txt.gz", indexReader65, terms66, terms67, false);
        synonymsAnalysisTest63.ensureAllSearchContextsReleased();
        synonymsAnalysisTest63.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str73 = synonymsAnalysisTest63.getTestName();
        synonymsAnalysisTest63.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray54, (java.lang.Object) synonymsAnalysisTest63);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) ' ', (double) (-1.0f), 0.0d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.monster", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("random", indexReader14, (int) ' ', postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest2);
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest2.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        synonymsAnalysisTest22.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest22.assertPathHasBeenCleared("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray4);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray24, shortArray29);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray20);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray42, shortArray43);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray42, shortArray47);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray57, shortArray62);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray67, shortArray72);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray76, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray77);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray52, shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray52);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (-1), (long) 6);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set[] setArray32 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray33 = (java.util.Set<java.lang.String>[]) setArray32;
        strSetArray33[0] = strSet5;
        strSetArray33[1] = strSet10;
        strSetArray33[2] = strSet15;
        strSetArray33[3] = strSet20;
        strSetArray33[4] = strSet25;
        strSetArray33[5] = strSet30;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.ensureCleanedUp();
        java.lang.String str50 = synonymsAnalysisTest47.getTestName();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest47.assertFieldsEquals("tests.monster", indexReader52, fields53, fields54, false);
        synonymsAnalysisTest47.setUp();
        synonymsAnalysisTest47.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) strSetArray33, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) -1, 1L);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, true);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str18 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) ' ', (double) (short) 10, (double) 'a');
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.lang.Class<?> wildcardClass12 = executorServiceArray9.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray9);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain27;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain27);
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocsAndPositionsEnumEquals("hi!", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) '4', (float) '4');
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 3, (double) 100.0f);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest10.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        synonymsAnalysisTest10.setIndexWriterMaxDocs(1);
        java.lang.String str19 = synonymsAnalysisTest10.getTestName();
        java.lang.String str20 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray4, (java.lang.Object) synonymsAnalysisTest10);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray55);
        org.junit.Assert.assertArrayEquals(intArray47, intArray52);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("", intArray47, intArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray38, intArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray29, intArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray4);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 100L);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 10.0d, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        char[] charArray11 = new char[] { '#' };
        char[] charArray13 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray13);
        char[] charArray16 = new char[] { '#' };
        char[] charArray18 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray18);
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        char[] charArray22 = new char[] { '#' };
        char[] charArray24 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals(charArray29, charArray34);
        org.junit.Assert.assertArrayEquals(charArray24, charArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray16, charArray24);
        char[] charArray42 = new char[] { '#' };
        char[] charArray44 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        char[] charArray47 = new char[] { '#' };
        char[] charArray49 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray47, charArray49);
        org.junit.Assert.assertArrayEquals(charArray44, charArray49);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray44);
        org.junit.Assert.assertArrayEquals(charArray16, charArray44);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray60);
        org.junit.Assert.assertArrayEquals(charArray16, charArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray57);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0, (double) (byte) -1);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray1 };
        java.util.Set<int[]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray30);
        org.junit.Assert.assertArrayEquals(longArray15, longArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) longArray15);
        short[] shortArray39 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray40 = new short[][] { shortArray39 };
        java.util.Set<short[]> shortArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) intArray2, (java.lang.Object[]) shortArray40);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1.0f));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 6, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray35);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray52);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray42);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str61 = synonymsAnalysisTest60.getTestName();
        java.lang.String str62 = synonymsAnalysisTest60.getTestName();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        synonymsAnalysisTest60.assertPositionsSkippingEquals("", indexReader64, (int) ' ', postingsEnum66, postingsEnum67);
        org.junit.rules.RuleChain ruleChain69 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain70 = synonymsAnalysisTest60.failureAndSuccessEvents;
        synonymsAnalysisTest60.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean58, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 0L);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        int[] intArray0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals(intArray8, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray20, (java.lang.Object) boolean26);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray30);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray30);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray15);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray26);
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray26, obj29);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray33, shortArray38);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray26, shortArray43);
        org.junit.Assert.assertArrayEquals("", shortArray15, shortArray43);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray49, shortArray50);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray54, shortArray59);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray15, shortArray59);
        short[] shortArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray69);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) 1, (double) 0.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) (short) -1, (float) (short) 10, (float) 2);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        synonymsAnalysisTest9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest9.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        java.lang.Class<?> wildcardClass17 = synonymsAnalysisTest9.getClass();
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        java.lang.Class<?> wildcardClass31 = executorServiceArray20.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest32.ruleChain;
        synonymsAnalysisTest32.ensureCleanedUp();
        java.lang.String str35 = synonymsAnalysisTest32.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.monster", indexReader37, fields38, fields39, false);
        java.lang.String str42 = synonymsAnalysisTest32.getTestName();
        java.lang.Class<?> wildcardClass43 = synonymsAnalysisTest32.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass17;
        wildcardClassArray46[1] = wildcardClass31;
        wildcardClassArray46[2] = wildcardClass43;
        java.util.Set<java.lang.Class<?>> wildcardClassSet53 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray46);
        java.util.Set<java.lang.reflect.Type> typeSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) wildcardClassArray46);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 10.0f, (double) 3);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) ' ', (float) 100, (float) (byte) 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, 10.0f, (float) 10L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, 10.0d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 100, (double) '4');
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.junit.rules.TestRule[] testRuleArray2 = new org.junit.rules.TestRule[] {};
        java.util.List<org.junit.rules.TestRule> testRuleList3 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, testRuleArray2);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray10, (double) (byte) 1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray10, doubleArray13, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray10, (double) 10.0f);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str34 = synonymsAnalysisTest33.getTestName();
        java.lang.String str35 = synonymsAnalysisTest33.getTestName();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest33.assertPositionsSkippingEquals("", indexReader37, (int) ' ', postingsEnum39, postingsEnum40);
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest33.ensureCleanedUp();
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest33, (java.lang.Object) doubleArray45);
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) (byte) 1);
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray54, (double) (byte) -1);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) (byte) 1);
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray64, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray50, doubleArray64, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray45, doubleArray64, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray29, doubleArray45, 100.0d);
        org.junit.Assert.assertArrayEquals("random", doubleArray24, doubleArray29, 10.0d);
        double[] doubleArray78 = new double[] {};
        double[] doubleArray79 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray78, doubleArray79, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray24, doubleArray78, (double) (byte) 0);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray24, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) 0, (java.lang.Object) doubleArray5);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader10, 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, true);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.failfast", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.nightly", postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, 10.0f, 0.0f);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 10, (long) (short) 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str4 = synonymsAnalysisTest3.getTestName();
        java.lang.String str5 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain9;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain9;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain9);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray15, byteArray16);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray26);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray36, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray22, byteArray36);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray49, byteArray50);
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray52);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray56, byteArray57);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray61);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray71);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray75, byteArray76);
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray71, byteArray78);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray82, byteArray83);
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray82);
        org.junit.Assert.assertArrayEquals("", byteArray61, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray49, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray36, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain9, (java.lang.Object) byteArray16);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.util.Set<java.io.Serializable> serializableSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray8);
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (byte) 10);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) strArray24);
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.failfast", indexReader31, (int) 'a', postingsEnum33, postingsEnum34, false);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray40, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray48, intArray51);
        org.junit.Assert.assertArrayEquals(intArray43, intArray48);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray60, intArray63);
        org.junit.Assert.assertArrayEquals(intArray55, intArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray43, intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) indexReader31, (java.lang.Object) intArray43);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        long[] longArray0 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) 4);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (-1), 0L);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 10.0d, (double) 100L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.badapples", indexReader9, 2, postingsEnum11, postingsEnum12, false);
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (short) 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 6, 100.0d, (double) 100);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100, (double) (short) -1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 10, (long) (short) 100);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray18);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray31, byteArray38);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray42, byteArray43);
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray31);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray7);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray52, byteArray53);
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray55);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray59, byteArray60);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray64);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray68, byteArray69);
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray64, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray52, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray52);
        byte[] byteArray76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray76);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (short) 10, (double) 1.0f);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str16 = synonymsAnalysisTest15.getTestName();
        java.lang.String str17 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) '4');
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray41, (java.lang.Object) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray53);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray68);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) synonymsAnalysisTestArray72);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (-1.0d), (double) (-1.0f));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1L));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        java.lang.String str14 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest11.failureAndSuccessEvents;
        java.lang.String str17 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("random", indexReader33, (int) (short) 100, postingsEnum35, postingsEnum36);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues41, numericDocValues42);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 6, (double) 100.0f, (double) 'a');
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray15, longArray19);
        java.lang.Object obj23 = null;
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray25, longArray30);
        org.junit.Assert.assertNotEquals("tests.weekly", obj23, (java.lang.Object) longArray25);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray36, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray45, longArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray41, longArray50);
        org.junit.Assert.assertArrayEquals(longArray25, longArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray19, longArray41);
        org.junit.Assert.assertArrayEquals("", longArray9, longArray41);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray64);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray68, longArray69);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray72, longArray73);
        org.junit.Assert.assertArrayEquals(longArray68, longArray73);
        org.junit.Assert.assertArrayEquals(longArray64, longArray73);
        java.lang.Object obj78 = null;
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray80, longArray81);
        long[] longArray84 = new long[] {};
        long[] longArray85 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray84, longArray85);
        org.junit.Assert.assertArrayEquals(longArray80, longArray85);
        org.junit.Assert.assertNotEquals("tests.weekly", obj78, (java.lang.Object) longArray80);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray73, longArray80);
        org.junit.Assert.assertArrayEquals(longArray41, longArray80);
        org.junit.Assert.assertNotSame("", (java.lang.Object) longArray80, (java.lang.Object) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) '#');
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 5, 1.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, 0.0d, (double) '4');
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 1, (long) (byte) -1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray26, (java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) intArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest11.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, false);
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        synonymsAnalysisTest11.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "<unknown>", (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray25);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray25, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray36);
        org.junit.Assert.assertArrayEquals("", byteArray15, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray32);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray32, byteArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray6);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        java.lang.Class<?> wildcardClass15 = synonymsAnalysisTest1.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        java.util.List<java.lang.reflect.Type> typeList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.Set<java.lang.reflect.Type> typeSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray18);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest38.ruleChain;
        synonymsAnalysisTest38.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest38.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray31, (java.lang.Object) synonymsAnalysisTest38);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray49);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) executorServiceArray31);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 10L, 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, (double) (byte) 10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        java.lang.String[] strArray2 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray4 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray6 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray8 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray10 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray12 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray2, strArray4, strArray6, strArray8, strArray10, strArray12 };
        java.util.Set<java.lang.String[]> strArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray16, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray54);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray9);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray22, (java.lang.Object) synonymsAnalysisTest29);
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest29);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule52 = synonymsAnalysisTest51.ruleChain;
        synonymsAnalysisTest51.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest51.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray44, (java.lang.Object) synonymsAnalysisTest51);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 0, (long) (short) 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 0, (double) 0.0f);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray6, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray70);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray79);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray67, (java.lang.Object) executorServiceArray79);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) 10, (java.lang.Object) executorServiceArray18);
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.lang.Object[] objArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, objArray91);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 0L);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) -1, (double) ' ');
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) '4', 0L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 1.0d, (double) 0L, (double) (short) 10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader16, (int) (short) 1, postingsEnum18, postingsEnum19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) (short) 1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (long) (short) 0, (long) (short) 0);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (double) 2);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray8, obj11);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray31, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray46);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray26, shortArray51);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray59, shortArray64);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray59);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray69);
        java.lang.Object obj74 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray69, obj74);
        short[] shortArray79 = new short[] {};
        short[] shortArray80 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray79, shortArray80);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray79, shortArray84);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray79);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray8, shortArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray89);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (short) 10, (float) 10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.slow", postingsEnum18, postingsEnum19, false);
        synonymsAnalysisTest14.tearDown();
        synonymsAnalysisTest14.setUp();
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest37.ruleChain;
        synonymsAnalysisTest37.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray30, (java.lang.Object) synonymsAnalysisTest37);
        synonymsAnalysisTest37.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        synonymsAnalysisTest37.assertDocsEnumEquals("tests.monster", postingsEnum44, postingsEnum45, false);
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest37.failureAndSuccessEvents;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain48;
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        java.lang.String str51 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.assertPathHasBeenCleared("hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "hi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals(intArray8, intArray13);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray20);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray20, (java.lang.Object) boolean26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray20);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray7 = new char[] { '#' };
        char[] charArray9 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
        char[] charArray13 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray20 = new char[] { '#' };
        char[] charArray22 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray22);
        char[] charArray25 = new char[] { '#' };
        char[] charArray27 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray20, charArray25);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        char[] charArray36 = new char[] { '#' };
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        org.junit.Assert.assertArrayEquals(charArray33, charArray38);
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray20, charArray38);
        char[] charArray46 = new char[] { '#' };
        char[] charArray48 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        org.junit.Assert.assertArrayEquals(charArray20, charArray48);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray53, charArray58);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray20, charArray53);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        org.junit.Assert.assertArrayEquals(charArray67, charArray72);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray20, charArray72);
        org.junit.Assert.assertArrayEquals(charArray9, charArray72);
        char[] charArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray9, charArray77);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest12.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str22 = synonymsAnalysisTest12.getTestName();
        java.lang.String str23 = synonymsAnalysisTest12.getTestName();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader27, fields28, fields29, false);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray48, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray76);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray17, (double) 0L);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray30, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str37 = synonymsAnalysisTest36.getTestName();
        java.lang.String str38 = synonymsAnalysisTest36.getTestName();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("", indexReader40, (int) ' ', postingsEnum42, postingsEnum43);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.ensureCleanedUp();
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest36, (java.lang.Object) doubleArray48);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray26, doubleArray48, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray3, doubleArray26, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) doubleArray26);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) '4', (double) (short) 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) -1, (long) (short) -1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray18);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray26);
        java.lang.Class<?> wildcardClass34 = byteArray14.getClass();
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) (byte) 1);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray37, doubleArray40, 10.0d);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray47, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray14, (java.lang.Object) doubleArray47);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.slow", indexReader26, terms27, terms28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 'a', (double) 2, (double) (short) -1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest0.assertTermsEquals("random", indexReader16, terms17, terms18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, (float) 100);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray48, (float) (short) 0);
        float[] floatArray59 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray64 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray48, floatArray59, (float) (byte) 100);
        float[] floatArray74 = new float[] { (short) 100, (short) -1, 0.0f, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray74, (float) 6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) ' ');
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        java.lang.String str14 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest11.failureAndSuccessEvents;
        java.lang.String str17 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader35, (int) (byte) 0, postingsEnum37, postingsEnum38);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(5);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str44 = synonymsAnalysisTest43.getTestName();
        java.lang.String str45 = synonymsAnalysisTest43.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule47 = synonymsAnalysisTest46.ruleChain;
        synonymsAnalysisTest46.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest46.failureAndSuccessEvents;
        synonymsAnalysisTest43.failureAndSuccessEvents = ruleChain49;
        synonymsAnalysisTest43.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest43.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest43);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 0, (long) 'a');
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        java.lang.Object obj13 = null;
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        org.junit.Assert.assertNotEquals("tests.weekly", obj13, (java.lang.Object) longArray15);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray26, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray35, longArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray31, longArray40);
        org.junit.Assert.assertArrayEquals(longArray15, longArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray9, longArray31);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray47, longArray48);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray51, longArray52);
        org.junit.Assert.assertArrayEquals(longArray48, longArray52);
        org.junit.Assert.assertArrayEquals(longArray31, longArray48);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray57, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray61, longArray62);
        org.junit.Assert.assertArrayEquals(longArray58, longArray62);
        org.junit.Assert.assertArrayEquals(longArray48, longArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray58);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray11);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray32, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray32);
        java.lang.Object[] objArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, objArray80);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1L, (double) 1L, (double) (short) 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.lang.Class<?> wildcardClass13 = executorServiceArray10.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray10);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass16 = synonymsAnalysisTest1.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.ensureCleanedUp();
        java.lang.String str20 = synonymsAnalysisTest17.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.monster", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest17.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest17.assertTermsEquals("random", indexReader29, terms30, terms31, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str35 = synonymsAnalysisTest34.getTestName();
        java.lang.String str36 = synonymsAnalysisTest34.getTestName();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("", indexReader38, (int) ' ', postingsEnum40, postingsEnum41);
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str46 = synonymsAnalysisTest45.getTestName();
        java.lang.String str47 = synonymsAnalysisTest45.getTestName();
        java.lang.String str48 = synonymsAnalysisTest45.getTestName();
        synonymsAnalysisTest45.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest45.failureAndSuccessEvents;
        java.lang.String str51 = synonymsAnalysisTest45.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest52.ruleChain;
        synonymsAnalysisTest52.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest55 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str56 = synonymsAnalysisTest55.getTestName();
        java.lang.String str57 = synonymsAnalysisTest55.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest58.ruleChain;
        synonymsAnalysisTest58.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain61 = synonymsAnalysisTest58.failureAndSuccessEvents;
        synonymsAnalysisTest55.failureAndSuccessEvents = ruleChain61;
        synonymsAnalysisTest52.failureAndSuccessEvents = ruleChain61;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain61;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain61;
        java.lang.Object obj66 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain61, obj66);
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain61;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) wildcardClass16, (java.lang.Object) synonymsAnalysisTest17);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', (long) (byte) 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 3);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0d, (double) 10);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', 1.0f, (float) (byte) -1);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader12, fields13, fields14, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain23);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain23);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader7, fields8, fields9, true);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        org.junit.Assert.assertNotSame("random", (java.lang.Object) doubleArray3, (java.lang.Object) "tests.nightly");
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) (byte) 1);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray12, doubleArray15, 10.0d);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("", indexReader26, (int) ' ', postingsEnum28, postingsEnum29);
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest22.ensureCleanedUp();
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest22, (java.lang.Object) doubleArray34);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray43, (double) (byte) -1);
        double[] doubleArray49 = new double[] {};
        double[] doubleArray50 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray50, (double) (byte) 1);
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray49, doubleArray53, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray39, doubleArray53, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray34, doubleArray53, (double) (short) 0);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray53, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray3, doubleArray12, (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray12, (double) 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        int[] intArray6 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray12 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray13 = new int[][] { intArray6, intArray12 };
        int[] intArray19 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray25 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray26 = new int[][] { intArray19, intArray25 };
        int[] intArray32 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray38 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray39 = new int[][] { intArray32, intArray38 };
        int[][][] intArray40 = new int[][][] { intArray13, intArray26, intArray39 };
        java.util.Set<int[][]> intArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(intArray40);
        java.util.List<int[][]> intArrayList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, intArray40);
        java.util.Set<java.io.Serializable> serializableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) intArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str45 = synonymsAnalysisTest44.getTestName();
        java.lang.String str46 = synonymsAnalysisTest44.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest44.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        synonymsAnalysisTest44.assertTermsEquals("tests.maxfailures", indexReader53, terms54, terms55, false);
        java.lang.Class<?> wildcardClass58 = synonymsAnalysisTest44.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass58;
        java.util.Set<java.lang.Class<?>> wildcardClassSet64 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray61);
        java.util.Set<java.io.Serializable> serializableSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) wildcardClassArray61);
        java.util.Set<java.lang.Class<?>> wildcardClassSet66 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray40, (java.lang.Object[]) wildcardClassArray61);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray14 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest0 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet15 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest19.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest19.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest16, synonymsAnalysisTest19 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet34 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTestCaseArray14, (java.lang.Object[]) synonymsAnalysisTestArray33);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("random", indexReader25, (int) (short) 10, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.nightly", indexReader32, (int) ' ', postingsEnum34, postingsEnum35, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest14);
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain39);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) fields18);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest38.assertTermsEquals("europarl.lines.txt.gz", indexReader40, terms41, terms42, false);
        synonymsAnalysisTest38.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        synonymsAnalysisTest38.assertTermsEquals("tests.weekly", indexReader48, terms49, terms50, true);
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest38.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass54 = ruleChain53.getClass();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) executorServiceArray20, (java.lang.Object) wildcardClass54);
        java.lang.Object[] objArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, objArray56);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 3, (double) 5);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy8 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest23.ruleChain;
        synonymsAnalysisTest23.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray16, (java.lang.Object) synonymsAnalysisTest23);
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest23.ruleChain;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) testRule29);
        org.junit.Assert.assertNotEquals((java.lang.Object) queryCachingPolicy8, (java.lang.Object) "tests.awaitsfix");
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray32 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy8 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet33 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray32);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) queryCachingPolicyArray32);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        java.lang.String str5 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        synonymsAnalysisTest8.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest8.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest8.tearDown();
        synonymsAnalysisTest8.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest8);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader18, 4, postingsEnum20, postingsEnum21, false);
        java.lang.Class<?> wildcardClass24 = synonymsAnalysisTest2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str26 = synonymsAnalysisTest25.getTestName();
        java.lang.String str27 = synonymsAnalysisTest25.getTestName();
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        synonymsAnalysisTest25.resetCheckIndexStatus();
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) '4');
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest47.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray40, (java.lang.Object) synonymsAnalysisTest47);
        synonymsAnalysisTest47.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest47.assertDocsEnumEquals("tests.monster", postingsEnum54, postingsEnum55, false);
        synonymsAnalysisTest47.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str63 = synonymsAnalysisTest62.getTestName();
        java.lang.String str64 = synonymsAnalysisTest62.getTestName();
        synonymsAnalysisTest62.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest62.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        synonymsAnalysisTest68.assertTermsEquals("europarl.lines.txt.gz", indexReader70, terms71, terms72, false);
        synonymsAnalysisTest68.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest68.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule78 = synonymsAnalysisTest68.ruleChain;
        synonymsAnalysisTest68.ensureAllSearchContextsReleased();
        synonymsAnalysisTest68.overrideTestDefaultQueryCache();
        synonymsAnalysisTest68.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain82 = synonymsAnalysisTest68.failureAndSuccessEvents;
        synonymsAnalysisTest62.failureAndSuccessEvents = ruleChain82;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain82;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain82;
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass24, (java.lang.Object) ruleChain82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) queryCachingPolicy1, (java.lang.Object) ruleChain82);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) queryCachingPolicy1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum13, postingsEnum14, true);
        java.lang.String str17 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest19.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, false);
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest19.ruleChain;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.awaitsfix", indexReader32, fields33, fields34, true);
        java.lang.String str37 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("tests.monster", postingsEnum40, postingsEnum41, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest44.ruleChain;
        synonymsAnalysisTest44.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str48 = synonymsAnalysisTest47.getTestName();
        java.lang.String str49 = synonymsAnalysisTest47.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule51 = synonymsAnalysisTest50.ruleChain;
        synonymsAnalysisTest50.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest50.failureAndSuccessEvents;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest44.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain53;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain53);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, (long) (short) 100);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) -1, (long) (byte) -1);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader17, fields18, fields19, true);
        java.lang.Object obj22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) true, obj22);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.lang.Class<?> wildcardClass8 = executorServiceArray5.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest9.assertTermsEquals("europarl.lines.txt.gz", indexReader11, terms12, terms13, false);
        synonymsAnalysisTest9.setIndexWriterMaxDocs(1);
        java.lang.String str18 = synonymsAnalysisTest9.getTestName();
        java.lang.Object obj19 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest9, obj19);
        synonymsAnalysisTest9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass8, (java.lang.Object) synonymsAnalysisTest9);
        java.lang.Object obj23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass8, obj23);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray20);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray28);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray28, byteArray37);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray55, byteArray56);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray60);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray64, byteArray65);
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray67);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray60, byteArray67);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray71, byteArray72);
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray71);
        org.junit.Assert.assertArrayEquals("", byteArray50, byteArray67);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray80, byteArray81);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray85);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray89, byteArray90);
        byte[] byteArray92 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray92);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray85, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) byteArray28);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, true);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        float[] floatArray1 = null;
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray1, floatArray11, (float) '#');
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 1L, (double) (byte) 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.badapples", indexReader8, (int) 'a', postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest17.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest17.ruleChain;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, true);
        java.lang.String str35 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.monster", postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        synonymsAnalysisTest42.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, false);
        synonymsAnalysisTest42.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest42.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule52 = synonymsAnalysisTest42.ruleChain;
        synonymsAnalysisTest42.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest42.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain54;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule16, (java.lang.Object) ruleChain54);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader6, (int) ' ', postingsEnum8, postingsEnum9);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest2, obj16);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.setIndexWriterMaxDocs(10);
        synonymsAnalysisTest2.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocValuesEquals("tests.slow", 10, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray3);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) typeArray1, (java.lang.Object[]) synonymsAnalysisTestArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) typeArray1, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray8, charArray13);
        org.junit.Assert.assertArrayEquals(charArray4, charArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest19.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, false);
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest19.resetCheckIndexStatus();
        synonymsAnalysisTest19.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest19.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest19);
        java.lang.String str34 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray4, (java.lang.Object) 2);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray40, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray50);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray56, shortArray61);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray56);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) charArray4, (java.lang.Object) shortArray66);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray13, shortArray18);
        short[] shortArray21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader15, fields16, fields17, true);
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray18);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.util.Set[] setArray55 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray56 = (java.util.Set<java.lang.String>[]) setArray55;
        strSetArray56[0] = strSet28;
        strSetArray56[1] = strSet33;
        strSetArray56[2] = strSet38;
        strSetArray56[3] = strSet43;
        strSetArray56[4] = strSet48;
        strSetArray56[5] = strSet53;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray56);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) strSetArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) strSetArray56);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain13;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest16.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, false);
        java.lang.Class<?> wildcardClass30 = synonymsAnalysisTest16.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.util.Set<java.lang.Class<?>> wildcardClassSet36 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray33);
        java.util.List<java.lang.reflect.Type> typeList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain13, (java.lang.Object) typeList37);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        synonymsAnalysisTest0.setUp();
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray79, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray58, (java.lang.Object) executorServiceArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray58);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues93 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 0, numericDocValues93, numericDocValues94);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (-1.0f), (double) 1L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 0.0d, (double) 10.0f, 100.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader9, fields10, fields11, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str16 = synonymsAnalysisTest15.getTestName();
        java.lang.String str17 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray32, intArray35);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray35, intArray40);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertArrayEquals("", intArray35, intArray47);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray47, (java.lang.Object) boolean53);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray57);
        org.junit.Assert.assertArrayEquals("random", intArray47, intArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) intArray57);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum63, postingsEnum64);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        char[] charArray29 = new char[] { '#' };
        char[] charArray31 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray31);
        org.junit.Assert.assertArrayEquals(charArray26, charArray31);
        org.junit.Assert.assertArrayEquals(charArray21, charArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray13, charArray21);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray44 = new char[] { '#' };
        char[] charArray46 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        org.junit.Assert.assertArrayEquals(charArray41, charArray46);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray41);
        org.junit.Assert.assertArrayEquals(charArray13, charArray41);
        char[] charArray52 = new char[] { '#' };
        char[] charArray54 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray52, charArray54);
        char[] charArray57 = new char[] { '#' };
        char[] charArray59 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray57, charArray59);
        char[] charArray62 = new char[] { '#' };
        char[] charArray64 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray62, charArray64);
        org.junit.Assert.assertArrayEquals(charArray59, charArray64);
        org.junit.Assert.assertArrayEquals(charArray54, charArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray59);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) (-1L), (double) (short) 100);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray7 = new char[] { '#' };
        char[] charArray9 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray18 = new char[] { '#' };
        char[] charArray20 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        org.junit.Assert.assertArrayEquals(charArray7, charArray15);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray32, charArray37);
        org.junit.Assert.assertArrayEquals(charArray28, charArray37);
        char[] charArray44 = new char[] { '#' };
        char[] charArray46 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        char[] charArray50 = new char[] { '#' };
        char[] charArray52 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray50, charArray52);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray50, charArray55);
        org.junit.Assert.assertArrayEquals(charArray46, charArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray28, charArray46);
        org.junit.Assert.assertArrayEquals("random", charArray15, charArray28);
        char[] charArray64 = new char[] { '#' };
        char[] charArray66 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray64, charArray66);
        char[] charArray69 = new char[] { '#' };
        char[] charArray71 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray69, charArray71);
        org.junit.Assert.assertArrayEquals(charArray66, charArray69);
        char[] charArray75 = new char[] { '#' };
        char[] charArray77 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray75, charArray77);
        char[] charArray80 = new char[] { '#' };
        char[] charArray82 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray80, charArray82);
        org.junit.Assert.assertArrayEquals(charArray77, charArray82);
        org.junit.Assert.assertArrayEquals(charArray69, charArray77);
        org.junit.Assert.assertArrayEquals(charArray28, charArray77);
        char[] charArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray28, charArray87);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 'a', (double) (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) (byte) 100, (double) 2);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray20, byteArray27);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("", byteArray10, byteArray27);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray27, byteArray48);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest66 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule67 = synonymsAnalysisTest66.ruleChain;
        synonymsAnalysisTest66.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain69 = synonymsAnalysisTest66.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray59, (java.lang.Object) synonymsAnalysisTest66);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule72 = synonymsAnalysisTest71.ruleChain;
        synonymsAnalysisTest71.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest71.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain74);
        synonymsAnalysisTest66.failureAndSuccessEvents = ruleChain74;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray27, (java.lang.Object) ruleChain74);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str13 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) indexReader17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, (long) (short) 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.failfast", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str21 = synonymsAnalysisTest20.getTestName();
        java.lang.String str22 = synonymsAnalysisTest20.getTestName();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader24, (int) ' ', postingsEnum26, postingsEnum27);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest20);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest20, obj34);
        synonymsAnalysisTest20.ensureCleanedUp();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest20.ruleChain;
        java.lang.String str38 = synonymsAnalysisTest20.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
        synonymsAnalysisTest20.tearDown();
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray80);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray70);
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) executorServiceArray43);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.setUp();
        java.lang.String str11 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, true);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray35, (float) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        float[] floatArray56 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray61 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray61, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray11, floatArray61, (float) 100);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest70 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule71 = synonymsAnalysisTest70.ruleChain;
        synonymsAnalysisTest70.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest70.assertDocsEnumEquals("tests.awaitsfix", postingsEnum74, postingsEnum75, true);
        synonymsAnalysisTest70.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest70.setUp();
        synonymsAnalysisTest70.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule82 = synonymsAnalysisTest70.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) floatArray11, (java.lang.Object) synonymsAnalysisTest70);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 0L, 10.0f);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 10L);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray2, doubleArray5, 10.0d);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray16, (double) (byte) -1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray26, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray12, doubleArray26, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray26, (double) 10);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str43 = synonymsAnalysisTest42.getTestName();
        java.lang.String str44 = synonymsAnalysisTest42.getTestName();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest42.assertPositionsSkippingEquals("", indexReader46, (int) ' ', postingsEnum48, postingsEnum49);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest42.failureAndSuccessEvents;
        synonymsAnalysisTest42.ensureCleanedUp();
        double[] doubleArray53 = new double[] {};
        double[] doubleArray54 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray54, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest42, (java.lang.Object) doubleArray54);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) (byte) 1);
        double[] doubleArray63 = new double[] {};
        double[] doubleArray64 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray64, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray63, (double) (byte) -1);
        double[] doubleArray69 = new double[] {};
        double[] doubleArray70 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray70, (double) (byte) 1);
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray74, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray73, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray59, doubleArray73, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray54, doubleArray73, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray38, doubleArray54, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray54, (double) 1);
        double[] doubleArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray87, (double) (byte) -1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 1.0d, (double) 10, (double) 1.0f);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray35, (float) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        float[] floatArray56 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray61 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray61, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray11, floatArray61, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray61, (float) 5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, objArray13);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) ' ', (float) 0, 1.0f);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest6.tearDown();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest6);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (byte) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        java.lang.Object[] objArray0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class[][] classArray5 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray6 = (java.lang.Class<?>[][]) classArray5;
        wildcardClassArray6[0] = wildcardClassArray3;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) wildcardClassArray6);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader6, (int) ' ', postingsEnum8, postingsEnum9);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest2.failureAndSuccessEvents;
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        java.lang.Object obj16 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest2, obj16);
        java.lang.Class<?> wildcardClass18 = synonymsAnalysisTest2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain20 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest19.resetCheckIndexStatus();
        java.lang.String str23 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest19.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10, (-1.0d), (double) 6);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest7.assertTermsEquals("tests.maxfailures", indexReader16, terms17, terms18, false);
        java.lang.Class<?> wildcardClass21 = synonymsAnalysisTest7.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.util.Set<java.lang.Class<?>> wildcardClassSet27 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray24);
        java.util.List<java.lang.reflect.Type> typeList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain4, (java.lang.Object) typeList28);
        java.lang.Class<?> wildcardClass30 = typeList28.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest31.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) wildcardClass30, (java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        long[] longArray1 = new long[] {};
        long[][] longArray2 = new long[][] { longArray1 };
        java.util.Set<long[]> longArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(longArray2);
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest5.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, false);
        synonymsAnalysisTest5.ensureAllSearchContextsReleased();
        synonymsAnalysisTest5.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest5.resetCheckIndexStatus();
        synonymsAnalysisTest5.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray37, (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray49);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray2, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) executorServiceArray19);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray28);
        java.util.Set<java.lang.CharSequence> charSequenceSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray28);
        java.util.Set<java.lang.CharSequence> charSequenceSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) strArray28);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray14);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray9);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray19);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray29, shortArray34);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray25);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray19);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        long[] longArray1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray18);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray18, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str30 = synonymsAnalysisTest29.getTestName();
        java.lang.String str31 = synonymsAnalysisTest29.getTestName();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest29.assertPositionsSkippingEquals("", indexReader33, (int) ' ', postingsEnum35, postingsEnum36);
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest29);
        java.lang.Object obj43 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest29, obj43);
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest29.ruleChain;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("tests.failfast", indexReader48, 1, postingsEnum50, postingsEnum51, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray18, (java.lang.Object) postingsEnum50);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) 2, (double) (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray2, strArray4, strArray6, strArray8, strArray10, strArray12 };
        java.lang.String[][][] strArray14 = new java.lang.String[][][] { strArray13 };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray16, strArray18, strArray20, strArray22, strArray24, strArray26 };
        java.lang.String[][][] strArray28 = new java.lang.String[][][] { strArray27 };
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[][] strArray41 = new java.lang.String[][] { strArray30, strArray32, strArray34, strArray36, strArray38, strArray40 };
        java.lang.String[][][] strArray42 = new java.lang.String[][][] { strArray41 };
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.weekly" };
        java.lang.String[][] strArray55 = new java.lang.String[][] { strArray44, strArray46, strArray48, strArray50, strArray52, strArray54 };
        java.lang.String[][][] strArray56 = new java.lang.String[][][] { strArray55 };
        java.lang.String[][][][] strArray57 = new java.lang.String[][][][] { strArray14, strArray28, strArray42, strArray56 };
        java.util.Set<java.lang.String[][][]> strArraySet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class[][] classArray63 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray64 = (java.lang.Class<?>[][]) classArray63;
        wildcardClassArray64[0] = wildcardClassArray61;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray64);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray57, (java.lang.Object[]) wildcardClassArray64);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("<unknown>", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str18 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain21);
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain21;
        java.lang.String str24 = synonymsAnalysisTest13.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocsAndPositionsEnumEquals("random", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray17, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray45);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.lang.Object[] objArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray45, objArray66);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 1, (long) (byte) -1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray18, (float) 100);
        float[] floatArray32 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray37 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) (byte) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray49, 10.0f);
        float[] floatArray58 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray63 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray63, (float) (byte) 100);
        float[] floatArray70 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray75 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray75, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray58, 100.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray18, floatArray58, 1.0f);
        float[] floatArray85 = new float[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray58, floatArray85, (float) '4');
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain6 = null;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest5.resetCheckIndexStatus();
        synonymsAnalysisTest5.ensureCleanedUp();
        synonymsAnalysisTest5.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.slow", postingsEnum5, postingsEnum6, false);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest11.assertFieldsEquals("enwiki.random.lines.txt", indexReader18, fields19, fields20, true);
        synonymsAnalysisTest11.setUp();
        synonymsAnalysisTest11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 2, (double) (byte) -1, 100.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, (double) (byte) -1);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 1, (long) 5);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1.0d, (double) 100);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.monster", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str27 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.tearDown();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) executorServiceArray47);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest2);
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (-1.0d), (double) 0L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 3, (float) (-1));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[][] classArray10 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray11 = (java.lang.Class<?>[][]) classArray10;
        wildcardClassArray11[0] = wildcardClassArray2;
        wildcardClassArray11[1] = wildcardClassArray5;
        wildcardClassArray11[2] = wildcardClassArray8;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClassArraySet18);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray24);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray14);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray36, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray41);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest64.ruleChain;
        synonymsAnalysisTest64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray57, (java.lang.Object) synonymsAnalysisTest64);
        synonymsAnalysisTest64.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest64.assertDocsEnumEquals("tests.monster", postingsEnum71, postingsEnum72, false);
        synonymsAnalysisTest64.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str77 = synonymsAnalysisTest64.getTestName();
        synonymsAnalysisTest64.assertPathHasBeenCleared("random");
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray41, (java.lang.Object) synonymsAnalysisTest64);
        synonymsAnalysisTest64.overrideTestDefaultQueryCache();
        synonymsAnalysisTest64.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest64);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 1, (float) (byte) 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain4);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest7.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest7.assertDocsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18, true);
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.awaitsfix", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest7.assertFieldsEquals("tests.weekly", indexReader29, fields30, fields31, false);
        synonymsAnalysisTest7.setUp();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) ruleChain4, (java.lang.Object) synonymsAnalysisTest7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest7.assertPathHasBeenCleared("");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray21, 10.0f);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray35, (float) (byte) 0);
        float[] floatArray45 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray50 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (byte) 100);
        float[] floatArray57 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray62 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray62, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray57, (float) 100);
        float[] floatArray71 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray76 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray76, (float) (byte) 100);
        float[] floatArray83 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray88 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray88, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray88, 10.0f);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray57, floatArray71, (float) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray71, (float) (short) -1);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        short[] shortArray5 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray6 = new short[][] { shortArray5 };
        java.util.Set<short[]> shortArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) shortArraySet7, (java.lang.Object) executorServiceArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest33.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, true);
        synonymsAnalysisTest33.setUp();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest43.assertTermsEquals("europarl.lines.txt.gz", indexReader45, terms46, terms47, false);
        synonymsAnalysisTest43.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest43.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest43.ruleChain;
        synonymsAnalysisTest43.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest43.failureAndSuccessEvents;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain55;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain55;
        org.junit.rules.TestRule testRule58 = synonymsAnalysisTest25.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArraySet7, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray18, byteArray25);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray25);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray43, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray50);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray57, byteArray58);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray62);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray62, byteArray69);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray73, byteArray74);
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray73);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray80, byteArray81);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray81);
        byte[] byteArray90 = new byte[] {};
        byte[] byteArray91 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray90, byteArray91);
        byte[] byteArray93 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray90, byteArray93);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray81, byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray90);
        byte[] byteArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray90, byteArray97);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 2, 100.0d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str12 = synonymsAnalysisTest2.getTestName();
        java.lang.String str13 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("", obj1, (java.lang.Object) synonymsAnalysisTest2);
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        java.lang.String str12 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.Object obj16 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain18 = null;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.maxfailures", indexReader21, fields22, fields23, true);
        java.lang.String str26 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.tearDown();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.nightly", obj16, (java.lang.Object) synonymsAnalysisTest17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) synonymsAnalysisTest1, obj16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 1, (double) (byte) -1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", 2, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1L), (double) (short) 1);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 100, (float) (short) -1);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader14, fields15, fields16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader20, fields21, fields22, false);
        java.lang.Object obj25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields21, obj25);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        java.lang.Object obj1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
        org.junit.Assert.assertNotEquals("tests.weekly", obj1, (java.lang.Object) longArray3);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray24, longArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray15, longArray24);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        org.junit.Assert.assertArrayEquals(longArray24, longArray35);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray44, longArray45);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray45, longArray49);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray45);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray55, longArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray64, longArray65);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray68, longArray69);
        org.junit.Assert.assertArrayEquals(longArray64, longArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray55, longArray64);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray74, longArray75);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray78, longArray79);
        org.junit.Assert.assertArrayEquals(longArray75, longArray79);
        org.junit.Assert.assertArrayEquals(longArray64, longArray79);
        org.junit.Assert.assertArrayEquals(longArray45, longArray64);
        org.junit.Assert.assertArrayEquals(longArray3, longArray45);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest85 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest85.tearDown();
        synonymsAnalysisTest85.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray3, (java.lang.Object) synonymsAnalysisTest85);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        java.util.Set<int[]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray29);
        org.junit.Assert.assertArrayEquals(longArray14, longArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray1, (java.lang.Object) longArray14);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        char[][] charArray39 = new char[][] { charArray35, charArray36, charArray37, charArray38 };
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        char[][] charArray44 = new char[][] { charArray40, charArray41, charArray42, charArray43 };
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        char[][] charArray49 = new char[][] { charArray45, charArray46, charArray47, charArray48 };
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        char[][] charArray54 = new char[][] { charArray50, charArray51, charArray52, charArray53 };
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        char[][] charArray59 = new char[][] { charArray55, charArray56, charArray57, charArray58 };
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        char[][] charArray64 = new char[][] { charArray60, charArray61, charArray62, charArray63 };
        char[][][] charArray65 = new char[][][] { charArray39, charArray44, charArray49, charArray54, charArray59, charArray64 };
        java.util.List<char[][]> charArrayList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray1, (java.lang.Object[]) charArray65);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (long) (byte) -1, (-1L));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) -1, (double) 100);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet19 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) throttlingArray18);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray22, (java.lang.Object) synonymsAnalysisTest29);
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40, throttling41, throttling42, throttling43 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet45 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray44);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) throttlingSet45);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) executorServiceArray2, (java.lang.Object) throttlingSet45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingSet45);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set[] setArray31 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray32 = (java.util.Set<java.lang.String>[]) setArray31;
        strSetArray32[0] = strSet4;
        strSetArray32[1] = strSet9;
        strSetArray32[2] = strSet14;
        strSetArray32[3] = strSet19;
        strSetArray32[4] = strSet24;
        strSetArray32[5] = strSet29;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray32);
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strSetArray32);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) locale48, (java.lang.Object) "tests.maxfailures");
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale48 };
        java.util.Set<java.util.Locale> localeSet56 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray55);
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strSetArray32, (java.lang.Object[]) localeArray55);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) '4', (float) 10L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) 4, 0.0f);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray19, byteArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray30);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray40);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray40, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray40);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray56);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray60, byteArray61);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray65);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray70, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray75);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray79, byteArray80);
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray75, byteArray82);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray86, byteArray87);
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray86, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray86);
        org.junit.Assert.assertArrayEquals("", byteArray65, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray53, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray40, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray4, byteArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray4);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.Set<java.lang.String[][]> strArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.util.Set<java.lang.String[][]> strArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[][][]) strArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str5 = synonymsAnalysisTest4.getTestName();
        java.lang.String str6 = synonymsAnalysisTest4.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest4.failureAndSuccessEvents = ruleChain10;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest4.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest4.assertPositionsSkippingEquals("tests.badapples", indexReader16, 3, postingsEnum18, postingsEnum19);
        synonymsAnalysisTest4.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charSequenceArraySet3, (java.lang.Object) synonymsAnalysisTest4);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) -1);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray11, longArray16);
        org.junit.Assert.assertArrayEquals(longArray7, longArray16);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) longArray16);
        long[] longArray25 = new long[] { (short) 0, 0, (byte) 100, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray16, longArray25);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (byte) 100);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader13, terms14, terms15, true);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray20, longArray21);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray34);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray30, longArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray21, longArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) longArray21);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest6.tearDown();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest6);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader16, 4, postingsEnum18, postingsEnum19, false);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str25 = synonymsAnalysisTest24.getTestName();
        java.lang.String str26 = synonymsAnalysisTest24.getTestName();
        java.lang.String str27 = synonymsAnalysisTest24.getTestName();
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest24.failureAndSuccessEvents;
        java.lang.String str30 = synonymsAnalysisTest24.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str35 = synonymsAnalysisTest34.getTestName();
        java.lang.String str36 = synonymsAnalysisTest34.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest37.ruleChain;
        synonymsAnalysisTest37.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest37.failureAndSuccessEvents;
        synonymsAnalysisTest34.failureAndSuccessEvents = ruleChain40;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain40;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.weekly", indexReader45, fields46, fields47, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) fields46);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray48);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray38);
        long[] longArray57 = new long[] {};
        long[][] longArray58 = new long[][] { longArray57 };
        java.util.Set<long[]> longArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(longArray58);
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray58);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) longArray58);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 1.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 5, (long) 10);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) '4', (double) (byte) 10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (-1.0d));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str13 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader17, fields18, fields19, true);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.weekly", (java.lang.Object) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest32.assertTermsEquals("europarl.lines.txt.gz", indexReader34, terms35, terms36, false);
        synonymsAnalysisTest32.ensureAllSearchContextsReleased();
        synonymsAnalysisTest32.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest32.resetCheckIndexStatus();
        synonymsAnalysisTest32.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray69);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray83);
        java.lang.Object[] objArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, objArray92);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 100, 0.0f, (float) 1L);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray8, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest5.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, false);
        synonymsAnalysisTest5.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest16.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest16.failureAndSuccessEvents;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest0, synonymsAnalysisTest5, synonymsAnalysisTest16 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet29 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray43, byteArray50);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray54, byteArray55);
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTestArray28, (java.lang.Object) byteArray34);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray5, (java.lang.Object) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", objArray1, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 2, 1.0f, (float) (short) -1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) 10);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        java.lang.Class<?> wildcardClass14 = synonymsAnalysisTest0.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.util.Set<java.lang.Class<?>> wildcardClassSet20 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray17);
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray17);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray37);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray75);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray17, (java.lang.Object[]) executorServiceArray37);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 0.0f, (float) '4');
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 'a');
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10L, (double) (short) 100);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (-1L), (double) (short) 10, (double) 'a');
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (-1L));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 1);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) ' ', (float) 2, (float) (byte) -1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray6, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        org.junit.Assert.assertArrayEquals(intArray18, intArray23);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray18, intArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray9, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        synonymsAnalysisTest44.assertTermsEquals("europarl.lines.txt.gz", indexReader46, terms47, terms48, false);
        synonymsAnalysisTest44.setIndexWriterMaxDocs(1);
        java.lang.String str53 = synonymsAnalysisTest44.getTestName();
        java.lang.String str54 = synonymsAnalysisTest44.getTestName();
        synonymsAnalysisTest44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray38, (java.lang.Object) synonymsAnalysisTest44);
        org.junit.Assert.assertArrayEquals("", intArray30, intArray38);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray61, intArray64);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray69, intArray72);
        org.junit.Assert.assertArrayEquals(intArray64, intArray69);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("", intArray64, intArray76);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray76, (java.lang.Object) boolean82);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray76);
        int[] intArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray30, intArray85);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 6, (float) (short) 1, 1.0f);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray10, byteArray17);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray27);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray27, byteArray34);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray38);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray46);
        org.junit.Assert.assertArrayEquals("", byteArray10, byteArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray46);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, 0.0f, (float) 4);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest8.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        synonymsAnalysisTest8.setIndexWriterMaxDocs(1);
        java.lang.String str17 = synonymsAnalysisTest8.getTestName();
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest8, obj18);
        synonymsAnalysisTest8.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest8);
        synonymsAnalysisTest8.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest8.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray5, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, true);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray17, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.ensureCheckIndexPassed();
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest24);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader33, terms34, terms35, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str39 = synonymsAnalysisTest38.getTestName();
        java.lang.String str40 = synonymsAnalysisTest38.getTestName();
        java.lang.String str41 = synonymsAnalysisTest38.getTestName();
        synonymsAnalysisTest38.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest38.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest38.assertTermsEquals("", indexReader45, terms46, terms47, false);
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum53, postingsEnum54);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (byte) 1);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) (byte) -1, (float) (-1L));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) -1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.slow", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) 10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 1L);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain3, obj4);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        synonymsAnalysisTest22.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest22.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray15, (java.lang.Object) synonymsAnalysisTest22);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray50);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray80);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray84);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        java.util.concurrent.ExecutorService executorService90 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] { executorService90 };
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray91);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray88, (java.lang.Object[]) executorServiceArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray91);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray91);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray91);
        java.lang.Object[] objArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray3, objArray97);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 3, (float) 10, (float) (byte) 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray9, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray14, byteArray21);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray25);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray39);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray39, byteArray46);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray50, byteArray51);
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray57, byteArray58);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray58);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray58, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray67);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray76, byteArray77);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray80, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray81);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray85, byteArray86);
        byte[] byteArray88 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray85, byteArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray81, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray67);
        java.lang.Object obj93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) byteArray67, obj93);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray8, charArray13);
        org.junit.Assert.assertArrayEquals(charArray4, charArray13);
        char[] charArray20 = new char[] { '#' };
        char[] charArray22 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray22);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray26, charArray31);
        org.junit.Assert.assertArrayEquals(charArray22, charArray31);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str39 = synonymsAnalysisTest38.getTestName();
        java.lang.String str40 = synonymsAnalysisTest38.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest41.ruleChain;
        synonymsAnalysisTest41.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest38.failureAndSuccessEvents = ruleChain44;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest38.assertFieldsEquals("", indexReader47, fields48, fields49, false);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray4, (java.lang.Object) fields48);
        char[] charArray55 = new char[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray55);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 2, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain18, obj19);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        synonymsAnalysisTest15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray8, (java.lang.Object) synonymsAnalysisTest15);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray25);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        java.lang.Object obj0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray8, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray18, shortArray23);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray28);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray13);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray35, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray45);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str51 = synonymsAnalysisTest50.getTestName();
        java.lang.String str52 = synonymsAnalysisTest50.getTestName();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest50.assertPositionsSkippingEquals("", indexReader54, (int) ' ', postingsEnum56, postingsEnum57);
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest50.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest50.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str62 = synonymsAnalysisTest61.getTestName();
        java.lang.String str63 = synonymsAnalysisTest61.getTestName();
        java.lang.String str64 = synonymsAnalysisTest61.getTestName();
        synonymsAnalysisTest61.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest61.failureAndSuccessEvents;
        java.lang.String str67 = synonymsAnalysisTest61.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule69 = synonymsAnalysisTest68.ruleChain;
        synonymsAnalysisTest68.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str72 = synonymsAnalysisTest71.getTestName();
        java.lang.String str73 = synonymsAnalysisTest71.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest74 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule75 = synonymsAnalysisTest74.ruleChain;
        synonymsAnalysisTest74.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest74.failureAndSuccessEvents;
        synonymsAnalysisTest71.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest68.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest61.failureAndSuccessEvents = ruleChain77;
        synonymsAnalysisTest50.failureAndSuccessEvents = ruleChain77;
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest50.assertPositionsSkippingEquals("random", indexReader83, (int) (short) 100, postingsEnum85, postingsEnum86);
        synonymsAnalysisTest50.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) shortArray40, (java.lang.Object) synonymsAnalysisTest50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) shortArray40);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 0, (double) 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) (byte) -1);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray27, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray13, doubleArray27, (double) 0L);
        double[] doubleArray36 = new double[] {};
        double[] doubleArray37 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray37, (double) (byte) 1);
        double[] doubleArray40 = new double[] {};
        double[] doubleArray41 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray41, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray36, doubleArray40, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str47 = synonymsAnalysisTest46.getTestName();
        java.lang.String str48 = synonymsAnalysisTest46.getTestName();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest46.assertPositionsSkippingEquals("", indexReader50, (int) ' ', postingsEnum52, postingsEnum53);
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest46.failureAndSuccessEvents;
        synonymsAnalysisTest46.ensureCleanedUp();
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest46, (java.lang.Object) doubleArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray36, doubleArray58, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray13, doubleArray36, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray13, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, 100.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain8 = null;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain8;
        synonymsAnalysisTest7.resetCheckIndexStatus();
        synonymsAnalysisTest7.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule6, (java.lang.Object) synonymsAnalysisTest7);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray24);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray29);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray14);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray36, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray41);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest64.ruleChain;
        synonymsAnalysisTest64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray57, (java.lang.Object) synonymsAnalysisTest64);
        synonymsAnalysisTest64.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest64.assertDocsEnumEquals("tests.monster", postingsEnum71, postingsEnum72, false);
        synonymsAnalysisTest64.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str77 = synonymsAnalysisTest64.getTestName();
        synonymsAnalysisTest64.assertPathHasBeenCleared("random");
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) shortArray41, (java.lang.Object) synonymsAnalysisTest64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) 10);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 'a', (long) (short) 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (int) (short) -1, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10, (double) 6);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 0, (double) 'a');
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        synonymsAnalysisTest15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray8, (java.lang.Object) synonymsAnalysisTest15);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) executorServiceArray41);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 4, 0.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.maxfailures", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray16 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest2 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray16);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray16);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) eSTestCaseArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain21 = null;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest20.resetCheckIndexStatus();
        java.lang.String str24 = synonymsAnalysisTest20.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest25.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, false);
        synonymsAnalysisTest25.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        synonymsAnalysisTest36.assertTermsEquals("europarl.lines.txt.gz", indexReader38, terms39, terms40, false);
        synonymsAnalysisTest36.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest20, synonymsAnalysisTest25, synonymsAnalysisTest36 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet49 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray48);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet50 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray48);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet51 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) eSTestCaseArray16, (java.lang.Object[]) synonymsAnalysisTestArray48);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        org.junit.Assert.assertArrayEquals(charArray21, charArray26);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray8, charArray16);
        char[] charArray34 = new char[] { '#' };
        char[] charArray36 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray36);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        org.junit.Assert.assertArrayEquals(charArray36, charArray41);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray36);
        org.junit.Assert.assertArrayEquals(charArray8, charArray36);
        char[] charArray49 = new char[] { '#' };
        char[] charArray51 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray49, charArray51);
        char[] charArray54 = new char[] { '#' };
        char[] charArray56 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        org.junit.Assert.assertArrayEquals(charArray51, charArray56);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray51);
        org.junit.Assert.assertArrayEquals(charArray36, charArray51);
        char[] charArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray51, charArray61);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        int[] intArray10 = new int[] {};
        int[][] intArray11 = new int[][] { intArray10 };
        int[] intArray12 = new int[] {};
        int[][] intArray13 = new int[][] { intArray12 };
        int[] intArray14 = new int[] {};
        int[][] intArray15 = new int[][] { intArray14 };
        int[] intArray16 = new int[] {};
        int[][] intArray17 = new int[][] { intArray16 };
        int[] intArray18 = new int[] {};
        int[][] intArray19 = new int[][] { intArray18 };
        int[] intArray20 = new int[] {};
        int[][] intArray21 = new int[][] { intArray20 };
        int[][][] intArray22 = new int[][][] { intArray11, intArray13, intArray15, intArray17, intArray19, intArray21 };
        java.util.Set<int[][]> intArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) intArray22);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, true);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray18, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        synonymsAnalysisTest33.assertTermsEquals("europarl.lines.txt.gz", indexReader35, terms36, terms37, false);
        synonymsAnalysisTest33.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest33.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest33.failureAndSuccessEvents;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain44;
        char[][][][] charArray46 = new char[][][][] {};
        char[][][][] charArray47 = new char[][][][] {};
        char[][][][] charArray48 = new char[][][][] {};
        char[][][][][] charArray49 = new char[][][][][] { charArray46, charArray47, charArray48 };
        java.util.Set<char[][][][]> charArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(charArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) ruleChain44, (java.lang.Object) charArray49);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray4, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray16);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str27 = synonymsAnalysisTest26.getTestName();
        java.lang.String str28 = synonymsAnalysisTest26.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain32;
        synonymsAnalysisTest26.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest26.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) executorServiceArray16, (java.lang.Object) synonymsAnalysisTest26);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray6, shortArray11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray11);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.lang.Class<?> wildcardClass12 = executorServiceArray9.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray9);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.failfast", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.monster", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        long[] longArray0 = null;
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray36, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray45, longArray50);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray36, longArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray26, longArray45);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray56, longArray57);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray60, longArray61);
        org.junit.Assert.assertArrayEquals(longArray57, longArray61);
        org.junit.Assert.assertArrayEquals("", longArray26, longArray57);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray67, longArray68);
        long[] longArray71 = new long[] {};
        long[] longArray72 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray71, longArray72);
        org.junit.Assert.assertArrayEquals(longArray67, longArray72);
        long[] longArray76 = new long[] {};
        long[] longArray77 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray76, longArray77);
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray80, longArray81);
        org.junit.Assert.assertArrayEquals(longArray76, longArray81);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray72, longArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray26, longArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray26);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("", indexReader12, (int) ' ', postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest8.failureAndSuccessEvents;
        synonymsAnalysisTest8.ensureCleanedUp();
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) doubleArray20);
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest8.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        java.lang.Object obj0 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        org.junit.Assert.assertArrayEquals(longArray9, longArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray5, longArray9);
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
        org.junit.Assert.assertArrayEquals(longArray27, longArray32);
        org.junit.Assert.assertArrayEquals(longArray23, longArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray5, longArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray19, byteArray26);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain11, (java.lang.Object) byteArray26);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) (short) 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest8.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        synonymsAnalysisTest8.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("tests.nightly", indexReader18, 0, postingsEnum20, postingsEnum21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest36.ruleChain;
        synonymsAnalysisTest36.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest36.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray29, (java.lang.Object) synonymsAnalysisTest36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule42 = synonymsAnalysisTest41.ruleChain;
        synonymsAnalysisTest41.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain44);
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain44;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain44;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain44;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str51 = synonymsAnalysisTest50.getTestName();
        java.lang.String str52 = synonymsAnalysisTest50.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule54 = synonymsAnalysisTest53.ruleChain;
        synonymsAnalysisTest53.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest53.failureAndSuccessEvents;
        synonymsAnalysisTest50.failureAndSuccessEvents = ruleChain56;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        synonymsAnalysisTest50.assertTermsEquals("tests.maxfailures", indexReader59, terms60, terms61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.awaitsfix", indexReader65, fields66, fields67, true);
        org.junit.rules.TestRule testRule70 = synonymsAnalysisTest50.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule70);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100, (double) (short) 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader10, fields11, fields12, true);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest16.ensureAllSearchContextsReleased();
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.awaitsfix", indexReader29, fields30, fields31, true);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.weekly", indexReader35, fields36, fields37, false);
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest16);
        java.lang.String str44 = synonymsAnalysisTest16.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) str44);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain20;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain20);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        java.lang.String str18 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        java.lang.String str22 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str18 = synonymsAnalysisTest17.getTestName();
        java.lang.String str19 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain23;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest17.assertTermsEquals("tests.maxfailures", indexReader26, terms27, terms28, false);
        java.lang.Class<?> wildcardClass31 = synonymsAnalysisTest17.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        wildcardClassArray34[0] = wildcardClass31;
        java.util.Set<java.lang.Class<?>> wildcardClassSet37 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray34);
        java.util.List<java.lang.reflect.Type> typeList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray34);
        java.util.Set<java.lang.reflect.Type> typeSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray34);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray34);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) wildcardClassArray34);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest12.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        synonymsAnalysisTest12.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        synonymsAnalysisTest25.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, true);
        synonymsAnalysisTest25.setUp();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest25);
        java.lang.Class<?> wildcardClass35 = synonymsAnalysisTest25.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain21, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray10);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray10);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray26);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray31, shortArray36);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray16, shortArray26);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray10, shortArray16);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray16, (java.lang.Object) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray62);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray62);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet74 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        java.util.Set<java.lang.CharSequence> charSequenceSet75 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) charSequenceArray73);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 'a');
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) 4);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
        java.lang.Object obj8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) throttlingArray6, obj8);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 1L);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("random", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        synonymsAnalysisTest18.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, false);
        synonymsAnalysisTest18.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        synonymsAnalysisTest30.assertTermsEquals("europarl.lines.txt.gz", indexReader32, terms33, terms34, false);
        synonymsAnalysisTest30.ensureAllSearchContextsReleased();
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str40 = synonymsAnalysisTest30.getTestName();
        java.lang.String str41 = synonymsAnalysisTest30.getTestName();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain42;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues48, numericDocValues49);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 3, (double) (byte) 1, (double) 100);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.badapples", indexReader9, (int) 'a', postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) testRule17);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 100L);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        char[][] charArray5 = new char[][] { charArray1, charArray2, charArray3, charArray4 };
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        char[][] charArray10 = new char[][] { charArray6, charArray7, charArray8, charArray9 };
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        char[][] charArray15 = new char[][] { charArray11, charArray12, charArray13, charArray14 };
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        char[][] charArray20 = new char[][] { charArray16, charArray17, charArray18, charArray19 };
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        char[][] charArray25 = new char[][] { charArray21, charArray22, charArray23, charArray24 };
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        char[][] charArray30 = new char[][] { charArray26, charArray27, charArray28, charArray29 };
        char[][][] charArray31 = new char[][][] { charArray5, charArray10, charArray15, charArray20, charArray25, charArray30 };
        java.util.List<char[][]> charArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, charArray31);
        java.util.Set<char[][]> charArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(charArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest47.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray40, (java.lang.Object) synonymsAnalysisTest47);
        synonymsAnalysisTest47.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest47.assertDocsEnumEquals("tests.monster", postingsEnum54, postingsEnum55, false);
        synonymsAnalysisTest47.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule59 = synonymsAnalysisTest47.ruleChain;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest47.assertDocsSkippingEquals("tests.slow", indexReader61, (int) (byte) 10, postingsEnum63, postingsEnum64, false);
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest47.assertPathHasBeenCleared("europarl.lines.txt.gz");
        synonymsAnalysisTest47.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray31, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray31);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) boolean39, (java.lang.Object) synonymsAnalysisTest40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray49);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray39);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27, true);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray30 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest16 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray30);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (org.apache.lucene.util.LuceneTestCase[]) eSTestCaseArray30);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) eSTestCaseArray30);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray1 };
        java.util.Set<int[]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray30);
        org.junit.Assert.assertArrayEquals(longArray15, longArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray2, (java.lang.Object) longArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTestArray36, (java.lang.Object) strSet42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) intArray2, (java.lang.Object[]) synonymsAnalysisTestArray36);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str5 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest17.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest17.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest6, synonymsAnalysisTest17 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet30 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray29);
        java.lang.Object obj31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTestSet30, obj31);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray6);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray10, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray21);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray44, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray30, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) (short) 0, (java.lang.Object) byteArray30);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 6, (double) (short) -1, 10.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        java.lang.Object obj1 = null;
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray6, longArray15);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray36);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray46, longArray47);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray46, longArray51);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray55, longArray60);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray46, longArray55);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray65, longArray66);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray69, longArray70);
        org.junit.Assert.assertArrayEquals(longArray66, longArray70);
        org.junit.Assert.assertArrayEquals(longArray55, longArray70);
        org.junit.Assert.assertArrayEquals(longArray36, longArray55);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest75.assertTermsEquals("europarl.lines.txt.gz", indexReader77, terms78, terms79, false);
        synonymsAnalysisTest75.setIndexWriterMaxDocs(1);
        java.lang.String str84 = synonymsAnalysisTest75.getTestName();
        java.lang.Object obj85 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest75, obj85);
        synonymsAnalysisTest75.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest75);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) longArray36, (java.lang.Object) synonymsAnalysisTest75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", obj1, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 3, 0.0f, (float) 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) 'a');
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray14);
        org.junit.Assert.assertArrayEquals(charArray5, charArray14);
        char[] charArray22 = new char[] { '#' };
        char[] charArray24 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        char[] charArray33 = new char[] { '#' };
        char[] charArray35 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray35);
        char[] charArray38 = new char[] { '#' };
        char[] charArray40 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals(charArray40, charArray45);
        org.junit.Assert.assertArrayEquals(charArray35, charArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray35);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals(charArray55, charArray60);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray55);
        org.junit.Assert.assertArrayEquals(charArray27, charArray55);
        char[] charArray68 = new char[] { '#' };
        char[] charArray70 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray68, charArray70);
        char[] charArray73 = new char[] { '#' };
        char[] charArray75 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray73, charArray75);
        org.junit.Assert.assertArrayEquals(charArray70, charArray75);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray70);
        org.junit.Assert.assertArrayEquals(charArray55, charArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray14, charArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) charArray70);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader28, (int) (short) 0, postingsEnum30, postingsEnum31);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader35, fields36, fields37, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (-1L));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (byte) 100);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) 10, (float) (byte) 0, (float) (byte) -1);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest7.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, false);
        synonymsAnalysisTest7.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest7.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        synonymsAnalysisTest7.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.awaitsfix");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest27.assertTermsEquals("europarl.lines.txt.gz", indexReader29, terms30, terms31, false);
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        synonymsAnalysisTest27.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest27);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 1);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) (-1L), (double) 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '#', (float) (short) -1, (float) (short) 10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) (byte) 100, (float) (byte) 1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 100.0f, (double) (byte) 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) '4');
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray17, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest24.assertDocsEnumEquals("tests.monster", postingsEnum31, postingsEnum32, false);
        synonymsAnalysisTest24.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str40 = synonymsAnalysisTest39.getTestName();
        java.lang.String str41 = synonymsAnalysisTest39.getTestName();
        synonymsAnalysisTest39.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest39.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        synonymsAnalysisTest45.assertTermsEquals("europarl.lines.txt.gz", indexReader47, terms48, terms49, false);
        synonymsAnalysisTest45.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest45.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule55 = synonymsAnalysisTest45.ruleChain;
        synonymsAnalysisTest45.ensureAllSearchContextsReleased();
        synonymsAnalysisTest45.overrideTestDefaultQueryCache();
        synonymsAnalysisTest45.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest39.failureAndSuccessEvents = ruleChain59;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain59;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        synonymsAnalysisTest63.assertTermsEquals("europarl.lines.txt.gz", indexReader65, terms66, terms67, false);
        synonymsAnalysisTest63.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain72 = synonymsAnalysisTest63.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule73 = synonymsAnalysisTest63.ruleChain;
        synonymsAnalysisTest63.ensureAllSearchContextsReleased();
        synonymsAnalysisTest63.overrideTestDefaultQueryCache();
        synonymsAnalysisTest63.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest63.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) ruleChain59, (java.lang.Object) synonymsAnalysisTest63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest63);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray13, shortArray18);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray23);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray30, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray40, shortArray45);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) shortArray23);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (short) 0, 100L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray31);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) boolean39, (java.lang.Object) synonymsAnalysisTest40);
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        synonymsAnalysisTest40.assertPathHasBeenCleared("tests.nightly");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str48 = synonymsAnalysisTest47.getTestName();
        java.lang.String str49 = synonymsAnalysisTest47.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest47.assertDocsEnumEquals("tests.slow", postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        synonymsAnalysisTest47.assertTermsEquals("tests.monster", indexReader56, terms57, terms58, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.nightly", (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray1, intArray6);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        org.junit.Assert.assertArrayEquals(intArray18, intArray23);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray23);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray34, intArray37);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray43, intArray46);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray51, intArray54);
        org.junit.Assert.assertArrayEquals(intArray46, intArray51);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("", intArray46, intArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray37, intArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) intArray37);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain11 = null;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, true);
        java.lang.String str19 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray8, intArray11);
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) intArray1, (java.lang.Object) ruleChain20);
        int[] intArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray22);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray19, intArray22);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray30);
        org.junit.Assert.assertArrayEquals(intArray22, intArray27);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray39, intArray42);
        org.junit.Assert.assertArrayEquals(intArray34, intArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray22, intArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) intArray39);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 6, (double) 1);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 1L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str25 = synonymsAnalysisTest24.getTestName();
        java.lang.String str26 = synonymsAnalysisTest24.getTestName();
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest24.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray19, (java.lang.Object) synonymsAnalysisTest24);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest24.assertDocsAndPositionsEnumEquals("", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader10, 0, postingsEnum12, postingsEnum13);
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (short) -1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("<unknown>", indexReader12, fields13, fields14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader12, terms13, terms14, false);
        synonymsAnalysisTest1.tearDown();
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray24, (java.lang.Object) synonymsAnalysisTest31);
        synonymsAnalysisTest31.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest31.assertDocsEnumEquals("tests.monster", postingsEnum38, postingsEnum39, false);
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule43 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str47 = synonymsAnalysisTest46.getTestName();
        java.lang.String str48 = synonymsAnalysisTest46.getTestName();
        synonymsAnalysisTest46.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest46.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        synonymsAnalysisTest52.assertTermsEquals("europarl.lines.txt.gz", indexReader54, terms55, terms56, false);
        synonymsAnalysisTest52.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain61 = synonymsAnalysisTest52.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest52.ruleChain;
        synonymsAnalysisTest52.ensureAllSearchContextsReleased();
        synonymsAnalysisTest52.overrideTestDefaultQueryCache();
        synonymsAnalysisTest52.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest52.failureAndSuccessEvents;
        synonymsAnalysisTest46.failureAndSuccessEvents = ruleChain66;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain66;
        org.junit.rules.TestRule testRule69 = synonymsAnalysisTest31.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        char[] charArray1 = null;
        char[] charArray4 = new char[] { '#' };
        char[] charArray6 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertArrayEquals(charArray11, charArray16);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray6, charArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray11);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 'a', (long) (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 'a', 0L);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1.0f), (double) 4);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0L, (double) 5);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (short) 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("<unknown>", indexReader11, fields12, fields13, true);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 1, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray17);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray17, (java.lang.Object) strArray33);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray8, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray19);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray33);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray33, byteArray40);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray44);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray52);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray52, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray61);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray69);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray75, byteArray76);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray80);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray84, byteArray85);
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray80, byteArray87);
        byte[] byteArray91 = new byte[] {};
        byte[] byteArray92 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray91, byteArray92);
        byte[] byteArray94 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray91, byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray8);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest17.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest29.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, false);
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        synonymsAnalysisTest29.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str39 = synonymsAnalysisTest29.getTestName();
        java.lang.String str40 = synonymsAnalysisTest29.getTestName();
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest29.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain41;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str46 = synonymsAnalysisTest45.getTestName();
        java.lang.String str47 = synonymsAnalysisTest45.getTestName();
        synonymsAnalysisTest45.overrideTestDefaultQueryCache();
        synonymsAnalysisTest45.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest45.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain41, (java.lang.Object) synonymsAnalysisTest45);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.monster", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.slow", indexReader28, (int) (byte) 10, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest14.resetCheckIndexStatus();
        synonymsAnalysisTest14.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str43 = synonymsAnalysisTest42.getTestName();
        java.lang.String str44 = synonymsAnalysisTest42.getTestName();
        synonymsAnalysisTest42.ensureCheckIndexPassed();
        synonymsAnalysisTest42.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) synonymsAnalysisTest42);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.lang.Class<?> wildcardClass12 = executorServiceArray9.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray9);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain16 = null;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain16;
        synonymsAnalysisTest15.resetCheckIndexStatus();
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1L, (long) 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling3, throttling4, throttling5, throttling6 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet8 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray7);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) throttlingSet8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray24, byteArray25);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray29, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray36);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingSet8, (java.lang.Object) byteArray20);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray2, (java.lang.Object) 100L);
        int[] intArray10 = new int[] {};
        int[][] intArray11 = new int[][] { intArray10 };
        int[] intArray12 = new int[] {};
        int[][] intArray13 = new int[][] { intArray12 };
        int[] intArray14 = new int[] {};
        int[][] intArray15 = new int[][] { intArray14 };
        int[] intArray16 = new int[] {};
        int[][] intArray17 = new int[][] { intArray16 };
        int[] intArray18 = new int[] {};
        int[][] intArray19 = new int[][] { intArray18 };
        int[] intArray20 = new int[] {};
        int[][] intArray21 = new int[][] { intArray20 };
        int[][][] intArray22 = new int[][][] { intArray11, intArray13, intArray15, intArray17, intArray19, intArray21 };
        java.util.Set<int[][]> intArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) intArray22);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1), (double) 0L);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) (short) 10, (double) 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 3, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str5 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader9, 5, postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader16, fields17, fields18, true);
        java.lang.Object obj21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "tests.weekly", obj21);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        char[] charArray4 = new char[] { '#' };
        char[] charArray6 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray9);
        char[] charArray15 = new char[] { '#' };
        char[] charArray17 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray20 = new char[] { '#' };
        char[] charArray22 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray22);
        org.junit.Assert.assertArrayEquals(charArray17, charArray22);
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        org.junit.Assert.assertArrayEquals("", charArray4, charArray22);
        char[] charArray30 = new char[] { '#' };
        char[] charArray32 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        org.junit.Assert.assertArrayEquals(charArray4, charArray32);
        java.lang.Object obj35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) charArray32, obj35);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 10.0d, (double) (short) -1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray26, (java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray64, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray64);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray2, shortArray3);
        java.lang.Class<?> wildcardClass5 = shortArray3.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest6.assertPositionsSkippingEquals("", indexReader10, (int) ' ', postingsEnum12, postingsEnum13);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest6.assertFieldsEquals("<unknown>", indexReader17, fields18, fields19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) wildcardClass5, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray26);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray36);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray36, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray47);
        org.junit.Assert.assertArrayEquals("", byteArray26, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray14, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray43);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray57, byteArray58);
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray60);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray64, byteArray65);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray69);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray73, byteArray74);
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray76);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray69, byteArray76);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray80, byteArray81);
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray76);
        byte[] byteArray88 = new byte[] {};
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray88, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray43);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 10, (double) 1L, (double) '#');
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray15);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray25);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray30, shortArray35);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray15, shortArray40);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray48, shortArray53);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray48);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray58);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        synonymsAnalysisTest63.assertTermsEquals("europarl.lines.txt.gz", indexReader65, terms66, terms67, false);
        synonymsAnalysisTest63.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain72 = synonymsAnalysisTest63.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule73 = synonymsAnalysisTest63.ruleChain;
        synonymsAnalysisTest63.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest75.assertTermsEquals("europarl.lines.txt.gz", indexReader77, terms78, terms79, false);
        synonymsAnalysisTest75.ensureAllSearchContextsReleased();
        synonymsAnalysisTest75.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str85 = synonymsAnalysisTest75.getTestName();
        java.lang.String str86 = synonymsAnalysisTest75.getTestName();
        org.junit.rules.RuleChain ruleChain87 = synonymsAnalysisTest75.failureAndSuccessEvents;
        synonymsAnalysisTest63.failureAndSuccessEvents = ruleChain87;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) shortArray58, (java.lang.Object) synonymsAnalysisTest63);
        org.junit.rules.RuleChain ruleChain90 = synonymsAnalysisTest63.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain90);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10L, (double) 0L, (double) 6);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (-1), numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (-1L), (double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10, 0.0d, 0.0d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) ' ');
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) '4', (long) '4');
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) (short) 0, 0.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray33);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("", intArray25, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray16, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray37);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray46, intArray49);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray54, intArray57);
        org.junit.Assert.assertArrayEquals("", intArray49, intArray57);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str63 = synonymsAnalysisTest62.getTestName();
        java.lang.String str64 = synonymsAnalysisTest62.getTestName();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        synonymsAnalysisTest62.assertPositionsSkippingEquals("", indexReader66, (int) ' ', postingsEnum68, postingsEnum69);
        org.junit.rules.RuleChain ruleChain71 = synonymsAnalysisTest62.failureAndSuccessEvents;
        synonymsAnalysisTest62.ensureCleanedUp();
        double[] doubleArray73 = new double[] {};
        double[] doubleArray74 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray74, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest62, (java.lang.Object) doubleArray74);
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest62.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray49, (java.lang.Object) synonymsAnalysisTest62);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 100L, 10.0f, (float) 3);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray14, charArray19);
        org.junit.Assert.assertArrayEquals(charArray10, charArray19);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest25.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, false);
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest25.resetCheckIndexStatus();
        synonymsAnalysisTest25.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest25);
        java.lang.String str40 = synonymsAnalysisTest25.getTestName();
        synonymsAnalysisTest25.setIndexWriterMaxDocs(2);
        org.junit.Assert.assertNotSame((java.lang.Object) charArray10, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) strArray4, (java.lang.Object) 2);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str10 = synonymsAnalysisTest9.getTestName();
        java.lang.String str11 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest9);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("<unknown>", indexReader14, 4, postingsEnum16, postingsEnum17);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray35, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray69, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray73);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray63);
        java.lang.Object obj83 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray63, obj83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) 4, obj83);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray7, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray18);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray36, byteArray37);
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray32, byteArray39);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray50, byteArray51);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray51);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray60, byteArray61);
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray51, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray60);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray69, byteArray70);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray74);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray78, byteArray79);
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray81);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray74, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray81);
        byte[] byteArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray85);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 'a', (long) (byte) 0);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0f, (float) 'a', (float) 1L);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 100.0d, (double) (short) 100);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", 6, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest0.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (byte) 1, 10.0f, (float) 1L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) 1);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "tests.maxfailures" };
        java.util.Set<java.lang.CharSequence> charSequenceSet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) charSequenceSet5);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray10, intArray13);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray10, intArray17);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 0.0d, (double) (short) -1);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain17;
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest0.ruleChain;
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest34.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray27, (java.lang.Object) synonymsAnalysisTest34);
        synonymsAnalysisTest34.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest34.assertDocsEnumEquals("tests.monster", postingsEnum41, postingsEnum42, false);
        synonymsAnalysisTest34.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest34.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) testRule46);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader14, 6, postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain19);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray11, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) (byte) -1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray22, (double) (byte) -1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray32, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray18, doubleArray32, (double) 0L);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) (byte) 1);
        double[] doubleArray45 = new double[] {};
        double[] doubleArray46 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray46, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray45, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str52 = synonymsAnalysisTest51.getTestName();
        java.lang.String str53 = synonymsAnalysisTest51.getTestName();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        synonymsAnalysisTest51.assertPositionsSkippingEquals("", indexReader55, (int) ' ', postingsEnum57, postingsEnum58);
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest51.failureAndSuccessEvents;
        synonymsAnalysisTest51.ensureCleanedUp();
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest51, (java.lang.Object) doubleArray63);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray41, doubleArray63, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray18, doubleArray41, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray18, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray3, doubleArray6, (double) 1L);
        double[] doubleArray75 = new double[] {};
        double[] doubleArray76 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray75, doubleArray76, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray76, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) doubleArray76);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader10, 0, postingsEnum12, postingsEnum13);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray16 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray16);
        java.util.Set<org.junit.Assert> assertSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) luceneTestCaseArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) assertSet18);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        java.lang.Class<?> wildcardClass15 = synonymsAnalysisTest1.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.util.Set<java.lang.Class<?>> wildcardClassSet21 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        java.util.Set<java.lang.Class<?>> wildcardClassSet22 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray18);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray26, (java.lang.Object) executorServiceArray38);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) executorServiceArray26);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader16, (int) (short) 1, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader22, 0, postingsEnum24, postingsEnum25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) postingsEnum24);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0d, (double) 0, (double) 0);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) 'a', (float) 5, (float) (byte) 1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) 10);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        org.junit.Assert.assertArrayEquals(longArray14, longArray25);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray35, longArray40);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray44, longArray45);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray48, longArray49);
        org.junit.Assert.assertArrayEquals(longArray44, longArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray35, longArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray25, longArray44);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray56, longArray60);
        org.junit.Assert.assertArrayEquals("", longArray25, longArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) longArray56);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 1);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest2.failureAndSuccessEvents;
        java.lang.String str6 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.ensureCleanedUp();
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest2.ruleChain;
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest14.assertFieldsEquals("", indexReader26, fields27, fields28, true);
        synonymsAnalysisTest14.ensureCleanedUp();
        synonymsAnalysisTest14.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.badapples", indexReader34, 5, postingsEnum36, postingsEnum37, false);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray10, (java.lang.Object) synonymsAnalysisTest14);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest14);
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest14);
        short[] shortArray48 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray49 = new short[][] { shortArray48 };
        java.util.Set<short[]> shortArraySet50 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) shortArraySet50, (java.lang.Object) executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) executorServiceArray62);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        java.lang.Object obj12 = null;
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertNotEquals("tests.weekly", obj12, (java.lang.Object) longArray14);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray25, longArray30);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray30, longArray39);
        org.junit.Assert.assertArrayEquals(longArray14, longArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray8, longArray30);
        long[] longArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray30, longArray45);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) 10, (double) 100L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader13, (int) ' ', postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 'a', (double) (-1L));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray22, (java.lang.Object) synonymsAnalysisTest29);
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray2, (java.lang.Object) synonymsAnalysisTest29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling43 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40, throttling41, throttling42, throttling43 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet45 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray44);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) throttlingSet45);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) executorServiceArray2, (java.lang.Object) throttlingSet45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0d), (double) '#');
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray23, (float) 100);
        float[] floatArray32 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray37 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) (byte) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        float[] floatArray56 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray61 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray61, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray44, 100.0f);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray6, floatArray44, (float) (-1));
        float[] floatArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray6, floatArray70, (float) '4');
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray21, 10.0f);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray35, (float) (byte) 0);
        float[] floatArray45 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray50 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (byte) 100);
        float[] floatArray57 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray62 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray62, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray62, 10.0f);
        float[] floatArray71 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray76 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray76, (float) (byte) 100);
        float[] floatArray83 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray88 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray88, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray88, 10.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray45, floatArray71, (float) 4);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray45, (float) 3);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray40);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray30);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str50 = synonymsAnalysisTest49.getTestName();
        java.lang.String str51 = synonymsAnalysisTest49.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule53 = synonymsAnalysisTest52.ruleChain;
        synonymsAnalysisTest52.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain55 = synonymsAnalysisTest52.failureAndSuccessEvents;
        synonymsAnalysisTest49.failureAndSuccessEvents = ruleChain55;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        synonymsAnalysisTest49.assertTermsEquals("tests.maxfailures", indexReader58, terms59, terms60, false);
        java.lang.Class<?> wildcardClass63 = synonymsAnalysisTest49.getClass();
        java.lang.Class[] classArray65 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass63;
        java.util.Set<java.lang.Class<?>> wildcardClassSet69 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray66);
        java.util.List<java.lang.reflect.Type> typeList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray66);
        java.util.Set<java.lang.reflect.Type> typeSet71 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray66);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) wildcardClassArray66);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        char[] charArray0 = null;
        char[] charArray4 = new char[] { '#' };
        char[] charArray6 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray15 = new char[] { '#' };
        char[] charArray17 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray20 = new char[] { '#' };
        char[] charArray22 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray22);
        char[] charArray25 = new char[] { '#' };
        char[] charArray27 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        org.junit.Assert.assertArrayEquals(charArray22, charArray27);
        org.junit.Assert.assertArrayEquals(charArray17, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray17);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        char[] charArray40 = new char[] { '#' };
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray37);
        org.junit.Assert.assertArrayEquals(charArray9, charArray37);
        char[] charArray48 = new char[] { '#' };
        char[] charArray50 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        org.junit.Assert.assertArrayEquals(charArray50, charArray53);
        org.junit.Assert.assertArrayEquals(charArray9, charArray50);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray65);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule73 = synonymsAnalysisTest72.ruleChain;
        synonymsAnalysisTest72.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain75 = synonymsAnalysisTest72.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray65, (java.lang.Object) synonymsAnalysisTest72);
        synonymsAnalysisTest72.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule78 = synonymsAnalysisTest72.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule78;
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) charArray9, (java.lang.Object) testRule78);
        char[] charArray83 = new char[] { '#' };
        char[] charArray85 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray83, charArray85);
        char[] charArray88 = new char[] { '#' };
        char[] charArray90 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray88, charArray90);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray83, charArray88);
        org.junit.Assert.assertArrayEquals(charArray9, charArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray83);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        java.lang.Object obj0 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest7.ensureCleanedUp();
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest7, (java.lang.Object) doubleArray19);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray28, (double) (byte) -1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray38, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray24, doubleArray38, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray19, doubleArray38, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray3, doubleArray19, 100.0d);
        double[] doubleArray51 = new double[] {};
        double[] doubleArray52 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray52, (double) (byte) 1);
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray52, doubleArray55, 10.0d);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) (byte) 1);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray66, (double) (byte) -1);
        double[] doubleArray72 = new double[] {};
        double[] doubleArray73 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray73, (double) (byte) 1);
        double[] doubleArray76 = new double[] {};
        double[] doubleArray77 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray76, doubleArray77, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray76, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray62, doubleArray76, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray76, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray76, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) doubleArray3);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", objArray1, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 2, (double) (short) -1);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) ' ');
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        char[] charArray11 = new char[] { '#' };
        char[] charArray13 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray13);
        char[] charArray16 = new char[] { '#' };
        char[] charArray18 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray18);
        org.junit.Assert.assertArrayEquals(charArray13, charArray18);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        char[] charArray29 = new char[] { '#' };
        char[] charArray31 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray31);
        org.junit.Assert.assertArrayEquals(charArray26, charArray31);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray26);
        org.junit.Assert.assertArrayEquals(charArray13, charArray26);
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        char[] charArray42 = new char[] { '#' };
        char[] charArray44 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        char[] charArray48 = new char[] { '#' };
        char[] charArray50 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        org.junit.Assert.assertArrayEquals(charArray50, charArray55);
        org.junit.Assert.assertArrayEquals(charArray42, charArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray26, charArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray42);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader12, 3, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest0.ruleChain;
        java.lang.Class[] classArray22 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        java.lang.Class[][] classArray25 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray26 = (java.lang.Class<?>[][]) classArray25;
        wildcardClassArray26[0] = wildcardClassArray23;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule20, (java.lang.Object) wildcardClassArray26);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs(1);
        java.lang.String str23 = synonymsAnalysisTest14.getTestName();
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest14, obj24);
        synonymsAnalysisTest14.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) '#', (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest14.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 100, 10L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray18 = new char[] { '#' };
        char[] charArray20 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray20);
        org.junit.Assert.assertArrayEquals(charArray10, charArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray10);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str32 = synonymsAnalysisTest31.getTestName();
        synonymsAnalysisTest31.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray20);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray43, intArray46);
        org.junit.Assert.assertArrayEquals(intArray38, intArray43);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals("", intArray38, intArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray29, intArray50);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray20, intArray50);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) intArray7);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray11);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest23.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, false);
        synonymsAnalysisTest23.setIndexWriterMaxDocs(1);
        java.lang.String str32 = synonymsAnalysisTest23.getTestName();
        java.lang.String str33 = synonymsAnalysisTest23.getTestName();
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray17, (java.lang.Object) synonymsAnalysisTest23);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray11, (java.lang.Object) synonymsAnalysisTest23);
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTestArray48, (java.lang.Object) strSet54);
        java.util.Collection[] collectionArray57 = new java.util.Collection[5];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray58 = (java.util.Collection<java.lang.String>[]) collectionArray57;
        strCollectionArray58[0] = strSet6;
        strCollectionArray58[1] = strSet37;
        strCollectionArray58[2] = strSet41;
        strCollectionArray58[3] = strSet46;
        strCollectionArray58[4] = strSet54;
        java.util.List<java.util.Collection<java.lang.String>> strCollectionList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, strCollectionArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) strCollectionList69);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 'a', (-1.0f));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1L, 100L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1.0d), (double) 'a', (double) 4);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) (byte) -1);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray17, (double) 0L);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray30, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str37 = synonymsAnalysisTest36.getTestName();
        java.lang.String str38 = synonymsAnalysisTest36.getTestName();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("", indexReader40, (int) ' ', postingsEnum42, postingsEnum43);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest36.failureAndSuccessEvents;
        synonymsAnalysisTest36.ensureCleanedUp();
        double[] doubleArray47 = new double[] {};
        double[] doubleArray48 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray47, doubleArray48, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest36, (java.lang.Object) doubleArray48);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray26, doubleArray48, (double) '#');
        double[] doubleArray55 = new double[] {};
        double[] doubleArray56 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray56, (double) (byte) 1);
        double[] doubleArray59 = new double[] {};
        double[] doubleArray60 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray60, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray56, doubleArray59, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray59, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray59, 100.0d);
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) (byte) 1);
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray74, (double) (byte) -1);
        double[] doubleArray80 = new double[] {};
        double[] doubleArray81 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray81, (double) (byte) 1);
        double[] doubleArray84 = new double[] {};
        double[] doubleArray85 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray84, doubleArray85, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray84, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray70, doubleArray84, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray70, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray59, (double) (byte) 1);
    }
}

